angular.module('First', [
  'First.services',
  'First.controllers',
  'ngRoute'
]).
config(['$routeProvider', function($routeProvider) {
  $routeProvider.
	when("/start", {templateUrl: "partials/start.html", controller: "startController"}).
	when("/game", {templateUrl: "partials/game.html", controller: "gameController"}).
	otherwise({redirectTo: '/start'});
}]);
