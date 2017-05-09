angular.module("components.flights").controller("FlightsController", function (FlightsService) {
    var ctrl = this;

    ctrl.$onInit = function () {
        FlightsService.allCompanies().then(function (response) {
            if (response.status === 200 && response.data) {
                ctrl.companies = response.data;
            } else {
                ctrl.companies = [];
                console.log("warn", response.status);
            }
            ctrl.filterChanged();
        }, function (error) {
            ctrl.companies = [];
            console.log("error", error);
        })

    };

    ctrl.filterChanged = function (years, company) {
        var findFlights;

        if ((years || years === 0) && company) {
            //
            findFlights = FlightsService.allByFilter(years, company);

        } else if (years || years === 0) {
            findFlights = FlightsService.allByYears(years);
        } else if (company) {
            findFlights = FlightsService.allByCompany(company);
        } else {
            //findFlights = FlightsService.updateTickets(20085, 22, 322);
            findFlights = FlightsService.all();
        }

        findFlights.then(function (response) {
            if (response.status === 200 && response.data && response.data._embedded) {
                ctrl.flights = response.data._embedded.flights;
            } else {
                ctrl.flights = [];
                console.log("warn", response.status);
            }
        }, function (error) {
            ctrl.flights = [];
            console.log("error", error);
        });
    };
});
