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
      <input id="orderNumber" type="search" placeholder="Please enter order number" #orderNumber required/>
      <label id="lblOrderNumber" class="text-danger" for="order_number"></label>
    </label>

    <label style="margin-right: 20px" for="storeNumber">Store number
      <input id="storeNumber" type="search" placeholder="Please enter store number" #storeNumber required/>
<!--      <label class="text-danger" for="store_number">Store number required.</label>-->
    </label>
    <label style="margin-right: 20px">
      <input style="margin-left: 10px" class="has-success" type="radio" value="iss" name="type" #iss/> In Store Sale
      <input style="margin-left: 10px" type="radio" value="cnc" name="type" #cnc> Click & Collect
      <input style="margin-left: 10px" type="radio" value="cnct" name="type" #cnct> Click & Collect Today
<!--      <label style="margin-right: 10px" class="text-danger" *ngIf="orderTypeError">Please select order type</label>-->
    </label>
    <button id="btnSearch" class="nav-link" class="btn btn-primary active">Search</button>
  </div>
  <div></div>
  <div id="cncView" class="panel panel-default">
    <div class="panel" style="text-align: center; background-color:  #aec6cf">
      <h4>Click & Collect Order Details</h4><br>
    </div>

    <div class="panel-body" *ngIf="hasData()">
      <table  class="table table-hover table-sm"  *ngFor="let order of orders">
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
    <h3 class="text-info" *ngIf="!hasData()">No Click & Collect Orders Found.</h3>
  </div>

</div>


<script>
     window.onload = function() {
          document.getElementById('cncView').style.display = 'none';
        };
  async function fetchData() {
  if(document.getElementById("orderNumber").value === "") {
    document.getElementById("lblOrderNumber").textContent = "Order number required."
    document.getElementById("lblOrderNumber").style.display = "block";
  } else {
    document.getElementById("lblOrderNumber").style.display = "none";
  }
              try {
                  const response = await fetch('orders/cnc?orderNumber=' + document.getElementById('orderNumber').value + '&storeNumber=' + document.getElementById('storeNumber').value);
                  if(Array.isArray(response.data) && response.data.length === 0) {
                    document.getElementById("cncView").style.display = "none";
                    document.getElementById("cncView").innerText = "No CNC orders present";

                  } else {
                     document.getElementById("cncView").style.display = "block";
                      const data = await response.json(); // Parse the JSON response
                      displayData(data); // Call the function to display data

                  }
              } catch (error) {
                  console.error('Error fetching data:', error);
              }
          }


           // Function to render data to the HTML
          function displayData(data) {

                document.getElementById('orderNo').innerText = 'Order Number : ' + data[0].orderNumber;
                document.getElementById('storeNo').innerText = 'Store Number : ' + data[0].storeId;
                document.getElementById('cStatus').innerText = 'Current Status : ' + data[0].currentStatus;

                let history = data[0].tukCncHistoryDtoList;
                let html = ``;
                history.forEach(item => {
                  html = html + `<tr><td>` + item.status + `</td><td>` + item.actionDateTime + `</td></tr>`;
                });
                document.getElementById('history').innerHTML = html;
          }
     document.getElementById('btnSearch').addEventListener('click', fetchData);
      </script>
  </body>
</html>