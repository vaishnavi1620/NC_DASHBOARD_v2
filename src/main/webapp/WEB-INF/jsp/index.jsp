<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>NetCrackerApplication</title>
  <base href="/">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="icon" type="image/x-icon" href="favicon.ico">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
  <div  class="container-fluid">
    <div class="panel panel-default">
      <div class="panel-heading" style="background-color:  #23527c ">
        <h1 style="text-align: center; color: white">NetCracker Orders Tracker</h1><br>
      </div>
    </div>
  </div>

<div class="panel-body" >
  <div class="nav nav-divider">
    <label style="margin-right: 20px" for="orderNumber">Order number
      <input id="orderNumber" type="search" placeholder="Please enter order number" required/>
      <label id="lblOrderNumber" class="text-danger" for="order_number"></label>
    </label>

    <label style="margin-right: 20px" for="storeNumber">Store number
      <input id="storeNumber" type="search" placeholder="Please enter store number" required/>
      <label id="lblStoreNumber" class="text-danger" for="store_number"></label>
    </label>

    <label style="margin-right: 20px">
      <input style="margin-left: 10px" class="has-success" type="radio" value="iss" name="type" #iss/> In Store Sale
      <input style="margin-left: 10px" type="radio" value="cnc" name="type" #cnc> Click & Collect
      <input style="margin-left: 10px" type="radio" value="cnct" name="type" #cnct> Click & Collect Today
<!--      <label style="margin-right: 10px" class="text-danger" *ngIf="orderTypeError">Please select order type</label>-->
    </label>
    <button id="btnSearch" class="nav-link" class="btn btn-primary active">Search</button>
  </div>
  <div class="panel-body"></div>
  <div id="cncView" class="panel panel-default">
    <div class="panel" style="text-align: center; background-color:  #aec6cf">
      <h4>Click & Collect Order Details</h4><br>
    </div>

    <div class="panel">
      <table  class="table table-hover table-sm" >
        <thead class="thead-light">
        <tr >
          <th><div id="orderNo">Order Number : </div>
            <div id="storeNo">Store Number : </div>
            <div id="cStatus">Current Status : </div></th>
          <th></th>
          <th></th>
        </tr>
        <tr><td colspan="3">
          <div class="panel" style="text-align: center; background-color:  #e7feff">
            <h4><b>Order status history</b></h4><br>
          </div></td>
        </tr>
        </thead>
        <thead class="thead-light">
        <tr>
          <th>Status</th>
          <th>Action Date Time</th>
          <th></th>
        </tr>
        </thead>
        <tbody id="history">
        <tr>
          <td><div id="hStatus"></div></td>
          <td><div id="hDate"></div></td>
          <td></td>
         </tr>
        </tbody><br>
      </table>
    </div>
  </div>
</div>
<h3 id="orderErr" class="text-info">Order not Found.</h3>

    <script src="js/validations.js">
    </script>
  </body>
</html>