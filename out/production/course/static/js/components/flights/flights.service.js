function FlightsService($http) {
    var BASE_URL = "/flights";

    return {
        all: function () {
            return $http.get(BASE_URL);
        },
        allByFilter: function (filter) {
            return $http({
                url: BASE_URL + "/search/findAllByPilot_YearsOfExperienceGreaterThanOrAirCraft_CompanyId",
                method: "GET",
                params: {
                    age: filter.years - 1,
                    companyId: filter.company
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
        allCompanies: function () {
            return $http.get("/companies");
        }
    };
}

angular.module("components.flights").factory("FlightsService", FlightsService);