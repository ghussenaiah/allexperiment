<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="myApp">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script> -->
<script type="text/javascript" src=js/angular.min.js></script>
</head>
<body ng-controller="myCtrl">

<table>
<tr><td>ID</td><td>Name</td><td>Price</td>
</tr>

<tr ng-repeat="pr in listproduct">
<td>{{pr.id}}</td>
<td>{{pr.name}}</td>
<td>{{pr.price}}</td>

</tr>
</table>

<script>
var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope, $http) {
  $http.get('http://localhost:9091/Rest_Call_AngularJs/rest/product/findall').success(function (response) {
	  $scope.listproduct = response.product;
  });
});
</script>
</body>
</html>