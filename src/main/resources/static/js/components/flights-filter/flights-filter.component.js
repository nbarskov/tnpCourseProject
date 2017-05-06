angular.module("components.flights-filter").component("flightsFilter", {
    bindings: {
        years: "<",
        company: "<",
        onChange: "&",
        companies: "<"
    },
    templateUrl: "./js/components/flights-filter/flights-filter.html",
    controller: "FlightsFilterController"
});
