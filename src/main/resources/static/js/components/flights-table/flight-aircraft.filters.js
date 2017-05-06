angular.module("components.flights-table")
    .filter("airCraft", function () {
        return function (airCraft) {
            return airCraft.model + ' (' + airCraft.id + ')';
        }
    })
    .filter("airCraftTitle", function () {
        return function (airCraft) {
            return [
                'Страна: ' + airCraft.state,
                'Год Выпуска: ' + airCraft.yearOfIssue
            ].join('\n');
        }
    })
    .filter("companyTitle", function () {
        return function (company) {
            return [
                'Страна: ' + company.country,
                'Год Основания: ' + company.yearOfRegistration,
                'Главный Аэропорт: ' + company.mainBase,
                'Доп. Аэропорт: ' + company.additionalHub
            ].join('\n');
        }
    })
    .filter("pilotTitle", function ($filter) {
        return function (pilot) {
            return [
                'Национальность: ' + pilot.nationality,
                'Лет Выслуги: ' + pilot.yearsOfExperience,
                'Дата Рождения: ' + $filter("localDate")(pilot.dateOfBirth)
            ].join('\n');
        }
    })
    .filter("localTime", function () {
        return function (localTime) {
            return localTime.hour + ":"
                + (localTime.minute < 10) ? ("0" + localTime.minute) : localTime.minute + ":"
                + (localTime.second < 10) ? ("0" + localTime.second) : localTime.second;
        }
    })
    .filter("localDate", function () {
        return function (localDate) {
            return localDate.dayOfMonth + '.' + localDate.monthValue + '.' + localDate.year;
        }
    });