'use strict';

angular.module('books')
    .controller('DetailCtrl', function ($scope, $routeParams, book) {

        $scope.get = function() {
            book.get($routeParams.id, function (response) {
                $scope.book = response.data;
            });
        }

        $scope.get();
    });
