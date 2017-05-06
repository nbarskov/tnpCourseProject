angular.module("components.flights").component("flights", {
    bindings: {
        companies: "<",
        flights: "<"
    },
    templateUrl: "./js/components/flights/flights.html",
    controller: "FlightsController"
});
