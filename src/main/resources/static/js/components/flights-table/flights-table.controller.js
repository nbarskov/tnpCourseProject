angular.module("components.flights-table").controller("FlightsTableController", function (FlightsService) {
    var ctrl = this;

    ctrl.company = function (airCraft) {
        return ctrl.companies.find(function (c) {

        });
    }

    ctrl.buttonPressed = function(flight, tickets_bought, tickets_availible) {
        var updateFlights;
        tickets_availible = 300 - tickets_bought;
        updateFlights = FlightsService.updateTickets(flight,tickets_bought,tickets_availible);
        updateFlights = FlightsService.all();
    }
});