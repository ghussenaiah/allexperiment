<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AJAX with Servlets using AngularJS</title>


<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script>
var app = angular.module('myApp', []);

function MyController($scope, $http) {

        $scope.getDataFromServer = function() {
                $http({
                        method : 'GET',
                        url : 'javaAngularJS'
                }).success(function(data, status, headers, config) {
                        $scope.person = data;
                }).error(function(data, status, headers, config) {
                        // called asynchronously if an error occurs
                        // or server returns response with an error status.
                });

        };
};
</script>
</head>
<body>
<div ng-app="myApp">
        <div ng-controller="MyController">
           <button ng-click="getDataFromServer()">Fetch data from server</button>
           <p>First Name : {{person.firstName}}</p>
           <p>Last Name : {{person.lastName}}</p>
        </div>
</div>
</body>
</html>