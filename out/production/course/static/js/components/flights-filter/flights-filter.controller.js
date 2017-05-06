angular.module("components.flights-filter").controller("FlightsFilterController", function () {
    var ctrl = this;

    ctrl.changed = function () {
        ctrl.onChange({
            years: ctrl.years,
            company: ctrl.company
        });
    }
});
