angular.module("components.flights-table").component("flightsTable", {
    bindings: {
        flights: "<",
        companies: "<"
    },
    templateUrl: "./js/components/flights-table/flights-table.html",
    controller: "FlightsTableController"
});