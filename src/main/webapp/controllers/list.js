'use strict';

angular.module('books')
    .controller('ListCtrl', function ($scope, book) {

    	$scope.delete = function(id) {
            book.delete(id, function() {
                $scope.load();
            });
        }
    	
        $scope.load = function() {
            book.list(function (response) {
                $scope.list = response.data;
            });
        }

        $scope.save = function() {
            book.save($scope.form, function() {
                $scope.load();
            });
        }

        $scope.form = {};

        $scope.load();
    });
