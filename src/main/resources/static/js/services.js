angular.module('First.services', [])
  .factory('firstService', function($http, $location) {

    var firstApi = {};

    firstApi.getPlayer = function() {
      return $http.get('/player');
    };

    return firstApi;
  });
