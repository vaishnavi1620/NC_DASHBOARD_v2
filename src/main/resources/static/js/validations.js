window.onload = function() {
    document.getElementById('cncView').style.display = 'none';
    document.getElementById('issView').style.display = 'none';
    document.getElementById('cnctView').style.display = 'none';
    document.getElementById("orderErr").style.display = "none";
};

async function fetchData() {
    const isValidOrderNumber = validateOrderNumber();
    const isValidStoreNumber = validateStoreNumber();

    // Check if order number and store number are valid
    if (isValidOrderNumber && isValidStoreNumber) {
        const orderType = document.querySelector('input[name="type"]:checked')?.value;

        if (!orderType) {
            alert("Please select an order type.");
            return;
        }

        try {
            // Construct URL based on the selected order type
            const url = `orders/${orderType}?orderNumber=${document.getElementById('orderNumber').value}&storeNumber=${document.getElementById('storeNumber').value}`;
            const response = await fetch(url);
            console.log(url);
            const data = await response.json(); // Parse the JSON response

            if (Array.isArray(data) && data.length === 0) {
                document.getElementById("orderErr").style.display = "block";
                document.getElementById("cncView").style.display = "none";
                document.getElementById("issView").style.display = "none";
                document.getElementById("cnctView").style.display = "none";
            } else {
                document.getElementById("orderErr").style.display = "none";
                // Call the function to display data based on order type
                displayData(data, orderType);
            }
        } catch (error) {
            console.error('Error fetching data:', error);
        }
    }
}

function validateOrderNumber() {
    if (document.getElementById("orderNumber").value === "") {
        document.getElementById("lblOrderNumber").textContent = "Order number required.";
        document.getElementById("lblOrderNumber").style.display = "block"; // Show error below input
        return false;
    } else {
        document.getElementById("lblOrderNumber").style.display = "none"; // Hide error if valid
        return true;
    }
}

function validateStoreNumber() {
    if (document.getElementById("storeNumber").value === "") {
        document.getElementById("lblStoreNumber").textContent = "Store number required.";
        document.getElementById("lblStoreNumber").style.display = "block"; // Show error below input
        return false;
    } else {
        document.getElementById("lblStoreNumber").style.display = "none"; // Hide error if valid
        return true;
    }
}




// Function to render data based on order type
function displayData(data, orderType) {
    // Hide all views initially
    document.getElementById('cncView').style.display = 'none';
    document.getElementById('issView').style.display = 'none';
    document.getElementById('cnctView').style.display = 'none';

    // Display the appropriate view based on the order type
    if (orderType === 'cnc') {
        document.getElementById('cncView').style.display = 'block';
    } else if (orderType === 'iss') {
        document.getElementById('issView').style.display = 'block';
    } else if (orderType === 'cnct') {
        document.getElementById('cnctView').style.display = 'block';
    }

    // Update the order details section
        if (orderType === 'cnc') {
            // CNC order details
            console.log(data);
            const cncData = data[0]; // assuming the data is an array with a single object
            document.getElementById('orderNo').innerText = 'Order Number: ' + cncData.orderNumber;
            document.getElementById('storeNo').innerText = 'Store Number: ' + cncData.storeId;
            document.getElementById('cStatus').innerText = 'Current Status: ' + cncData.currentStatus;

            const history = Array.isArray(cncData.tukCncHistoryDtoList) ? cncData.tukCncHistoryDtoList : [];

                    // Render CNC order history
                    let historyHtml = '';
                    history.forEach(item => {
                        historyHtml += `<tr><td>${item.status}</td><td>${item.actionDateTime}</td></tr>`;
                    });
            document.getElementById('history').innerHTML = historyHtml;
        }
        else if (orderType === 'iss') {
            // ISS order details

            const issData = data[0];
            console.log(issData);
            document.getElementById('issOrderNo').innerText = 'Order Number: ' + issData.tukNcOrderListPK.orderNumber;
            document.getElementById('issStoreNo').innerText = 'Store Number::  ' + issData.tukNcOrderListPK.rtlLocId; // rtlLocId is the store ID
            document.getElementById('issStatus').innerText = 'Current Status: ' + issData.status;

        }
        else if (orderType === 'cnct') {
                    // CNC order details
                    console.log(data);
                    const cncTData = data[0]; // assuming the data is an array with a single object
                    document.getElementById('cnctOrderNo').innerText = 'Order Number: ' + cncTData.orderNumber;
                    document.getElementById('cnctStoreNo').innerText = 'Store Number: ' + cncTData.storeId;
                    document.getElementById('cnctStatus').innerText = 'Current Status: ' + cncTData.currentStatus;

                    const history = Array.isArray(cncTData.tukCnctHistoryDtoList) ? cncTData.tukCnctHistoryDtoList : [];
                    console.log(history);
                            // Render CNCT order history
                            let historyHtml = '';
                                                history.forEach(item => {
                                                    historyHtml += `<tr><td>${item.status}</td><td>${item.actionDateTime}</td></tr>`;
                                                });
                                        document.getElementById('cnctHistory').innerHTML = historyHtml;
                }


}


// Add event listener to the search button
document.getElementById('btnSearch').addEventListener('click', fetchData);
