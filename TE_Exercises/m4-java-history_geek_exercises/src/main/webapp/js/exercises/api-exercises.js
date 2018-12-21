///<reference path="../jquery-3.1.1.js"/>
var root = 'http://localhost:8080/m4-java-historygeek-exercises';

$(document).ready(function () {
	
    $("#BillingPostalCode").on('change', function(event) { //tie this function onto the postalCode //run fcn on jQuery
    	var billingZipCode = $("#BillingPostalCode").val();
    	var subtotal = $('#subtotal span').text();
    	subtotal = subtotal.substring(1, subtotal.length);
    	$.ajax ({
    		url: root + '/api/getTax', //just completing the url to where you actually want to get to
            type: "GET",
            data: {
            	billingZipCode: billingZipCode,
            	subtotal: subtotal, //parts to the L of the : are the impt parts to be named for exactly what the controllers are looking for
            },
            dataType: 'json'
    	}).done(function(data) { //done or .then(so after the call) and assume that the data is a floating pt num. as a string
    		var tax = parseFloat(data).toFixed('2');
    		$('#tax span').text('$' + tax); //update the tax span
    		grandTotal(); //then call the grandTotal, do the math, then update everything
    	});
    })
});