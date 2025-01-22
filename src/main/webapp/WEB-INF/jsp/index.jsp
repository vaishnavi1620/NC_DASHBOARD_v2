<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>NetCrackerApplication</title>
  <base href="/">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <!-- CSS and JS Dependencies -->
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
  <link rel="icon" type="image/x-icon" href="favicon.ico">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>

<body>
  <div class="container-fluid" >
    <div class="panel" style="background-color: #23527c">
      <div class="panel-heading" style="background-color: #23527c">
        <h1 class="text-center text-white" style="color: white;">NetCracker Orders Status Tracker</h1><br>
      </div>
    </div>
  </div>

 <div class="panel-body">
    <div class="nav nav-divider" style="display: flex; flex-wrap: wrap; gap: 20px; align-items: center;">

      <!-- Order Number Input -->
      <div style="display: flex; flex-direction: column; align-items: flex-start; position: relative;">
        <label for="orderNumber" style="margin-right: 20px; display: inline-block;">
          Order Number
        </label>
        <input id="orderNumber" type="search" class="form-control rounded" placeholder="Please enter order number" required style="display: inline-block; width: auto;" onblur="validateOrderNumber()" />
        <label id="lblOrderNumber" class="text-danger" style="display: none; position: absolute; bottom: -20px; left: 0;"></label>
      </div>

      <!-- Store Number Input -->
      <div style="display: flex; flex-direction: column; align-items: flex-start; position: relative;">
        <label for="storeNumber" style="margin-right: 20px; display: inline-block;">
          Store Number
        </label>
        <input id="storeNumber" type="search" class="form-control rounded" placeholder="Please enter store number" required style="display: inline-block; width: auto;" onblur="validateStoreNumber()" />
        <label id="lblStoreNumber" class="text-danger" style="display: none; position: absolute; bottom: -20px; left: 0;"></label>
      </div>

      <!-- Order Type Radio Buttons -->
      <div style="display: flex; align-items: center; gap: 20px;">
        <label>
          <input style="margin-left: 10px" class="form-check-input" type="radio" value="iss" name="type" id="iss" /> In Store Sale
        </label>
        <label>
          <input style="margin-left: 10px" type="radio" value="cnc" name="type" id="cnc" /> Click & Collect
        </label>
        <label>
          <input style="margin-left: 10px" type="radio" value="cnct" name="type" id="cnct" /> Click & Collect Today
        </label>
      </div>

      <!-- Search Button -->
      <div>
        <button id="btnSearch" class="nav-link btn btn-primary active" style="display: inline-block;">Search</button>
      </div>

    </div>
 </div>



  <!-- CNC Order View -->
  <div id="cncView" class="panel panel-default" style="display: none;">
    <div class="panel" style="text-align: center; background-color: #aec6cf">
      <h4>Click & Collect Order Details</h4><br>
    </div>
    <div class="panel">
      <table class="table table-hover table-sm">
        <thead class="thead-light">
          <tr>
            <th>
              <div id="orderNo">Order Number: </div>
              <div id="storeNo">Store Number: </div>
              <div id="cStatus">Current Status: </div>
            </th>
            <th></th>
            <th></th>
          </tr>
          <tr>
            <td colspan="3">
              <div class="panel" style="text-align: center; background-color: #e7feff">
                <h4><b>Order Status History</b></h4><br>
              </div>
            </td>
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
        </tbody>
      </table>
    </div>
  </div>

  <!-- ISS Order View -->
  <div id="issView" class="panel panel-default" style="display: none;">
    <div class="panel" style="text-align: center; background-color: #aec6cf">
      <h4>In Store Sale Order Details</h4><br>
    </div>
    <div class="panel">
      <table class="table table-hover table-sm">
        <thead class="thead-light">
          <tr>
            <th>
              <div id="issOrderNo">Order Number: </div>
              <div id="issStoreNo">Store Number: </div>
              <div id="issStatus">Current Status: </div>
            </th>
            <th></th>
            <th></th>
          </tr>

        </thead>
        </table>
    </div>
  </div>

  <!-- CNCT Order View -->
  <div id="cnctView" class="panel panel-default" style="display: none;">
    <div class="panel" style="text-align: center; background-color: #aec6cf">
      <h4>Click & Collect Today Order Details</h4><br>
    </div>
    <div class="panel">
      <table class="table table-hover table-sm">
        <thead class="thead-light">
          <tr>
            <th>
              <div id="cnctOrderNo">Order Number: </div>
              <div id="cnctStoreNo">Store Number: </div>
              <div id="cnctStatus">Current Status: </div>
            </th>
            <th></th>
            <th></th>
          </tr>
          <tr>
            <td colspan="3">
              <div class="panel" style="text-align: center; background-color: #e7feff">
                <h4><b>Order Status History</b></h4><br>
              </div>
            </td>
          </tr>
        </thead>
        <thead class="thead-light">
          <tr>
            <th>Status</th>
            <th>Action Date Time</th>
            <th></th>
          </tr>
        </thead>
        <tbody id="cnctHistory">
          <tr>
            <td><div id="hStatus"></div></td>
            <td><div id="hDate"></div></td>
            <td></td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>

  <!-- Order Not Found Error Message -->
  <h3 id="orderErr" class="text-info" style="display: none;">Order Not Found.</h3>

  <!-- JS Scripts -->
  <script src="js/validations.js"></script>
  <script src="/js/jquery-3.7.1.min.js"></script>
</body>
</html>
