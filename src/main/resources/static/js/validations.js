         window.onload = function() {
              document.getElementById('cncView').style.display = 'none';
              document.getElementById("orderErr").style.display = "none";
            };

          async function fetchData() {
                const isValidOrderNumber = validateOrderNumber();
                const isValidStoreNumber = validateStoreNumber();

                if(isValidOrderNumber && isValidStoreNumber) {
                    try {
                            const response = await fetch('orders/cnc?orderNumber=' + document.getElementById('orderNumber').value + '&storeNumber=' + document.getElementById('storeNumber').value);
                            if(Array.isArray(response.data) && response.data.length === 0) {
                                document.getElementById("cncView").style.display = "none";
                                document.getElementById("orderErr").style.display = "block";
                            } else {
                                document.getElementById("cncView").style.display = "block";
                                const data = await response.json(); // Parse the JSON response
                                if(Array.isArray(data) && data.length === 0) {
                                    document.getElementById("cncView").style.display = "none";
                                    document.getElementById("orderErr").style.display = "block";
                                } else {
                                    // Call the function to display data
                                    displayData(data);
                                    document.getElementById("cncView").style.display = "block";
                                    document.getElementById("orderErr").style.display = "none";
                                }

                            }
                    } catch (error) {
                        console.error('Error fetching data:', error);
                    }
                }
          }

          function validateOrderNumber(){
                  document.getElementById("orderErr").style.display = "none";
                  if(document.getElementById("orderNumber").value === "") {
                    document.getElementById("lblOrderNumber").textContent = "Order number required."
                    document.getElementById("lblOrderNumber").style.display = "block";
                    return false;
                  } else {
                    document.getElementById("lblOrderNumber").style.display = "none";
                    return true;
                  }
          }

          function validateStoreNumber(){
                  document.getElementById("orderErr").style.display = "none";
                  if(document.getElementById("storeNumber").value === "") {
                    document.getElementById("lblStoreNumber").textContent = "Store number required."
                    document.getElementById("lblStoreNumber").style.display = "block";
                    return false;
                  } else {
                    document.getElementById("lblStoreNumber").style.display = "none";
                    return true;
                  }
          }

          // Function to render data
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
