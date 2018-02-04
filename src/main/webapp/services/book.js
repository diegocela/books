'use strict';

angular.module('books')
    .service('book', function ($http) {
        return {
        	delete: function (id, success) {
            	return $http.delete("/rest/book/" + id).then(success);
            },
        	get: function (id, success) {
            	return $http.get("/rest/book/" + id).then(success);
            },
            list: function (success) {
                return $http.get("/rest/book").then(success);
            },
            save: function (book, success) {
                return $http.post("/rest/book", book).then(success);
            }
        };
    });
