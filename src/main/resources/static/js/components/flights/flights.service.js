function FlightsService($http) {
    var BASE_URL = "/flights";

    return {
        all: function () {
            return $http.get(BASE_URL);
        },
        allByFilter: function (years, company) {
            return $http({
                url: BASE_URL + "/search/findAllByPilot_YearsOfExperienceGreaterThanAndAirCraft_CompanyIdEquals",
                method: "GET",
                params: {
                    age: years - 1,
                    companyId: company
                }
            });
        },
        allByYears: function (years) {
            return $http({
                url: BASE_URL + "/search/findAllByPilot_YearsOfExperienceGreaterThan",
                method: "GET",
                params: {
                    age: years - 1
                }
            });
        },
        allByCompany: function (company) {
            return $http({
                url: BASE_URL + "/search/findAllByAirCraft_CompanyId",
                method: "GET",
                params: {
                    companyId: company
                }
            });
        },
        updateTickets: function (flight, tickets_bought, tickets_availible) {
            return $http({
                url: BASE_URL + "/" + flight,
                method: "PATCH",
                data: {
                    ticketsBought: tickets_bought,
                    ticketsAvailable: tickets_availible
                }
            });
        },
        allCompanies: function () {
            return $http.get("/companies");
        }

    };
}

angular.module("components.flights").factory("FlightsService", FlightsService);