angular.module('First.controllers', []).
    
  controller('startController', function($scope, $http, $location) {
  $scope.name = null;

    $scope.play = function() {
      console.log('Start', $scope.name);
  
      $http.post('/start', {name: $scope.name})
          .then(
              function(response){
                $location.path('/game');
              },
              function(response){
                console.log("Could not send name.");
              }
          );
    }
  }).

  controller('gameController', function($scope, firstService) {
    firstService.getPlayer().then(function(response) {
        console.log(response.data.name);
    });

    $scope.test = "Action";
  });
