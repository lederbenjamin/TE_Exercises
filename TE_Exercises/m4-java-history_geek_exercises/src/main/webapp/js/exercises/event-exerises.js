/// <reference path="../jquery-3.1.1.js" />

$(document).ready(function () {
	
	$("#SameShipping").on('click', function(){
		if(this.checked == true){
			$("#ShippingAddress1").val($("#BillingAddress1").val());
			$("#ShippingAddress2").val($("#BillingAddress2").val());
			$("#ShippingCity").val($("#BillingCity").val());
			$("#ShippingState").val($("#BillingState").val());
			$("#ShippingPostalCode").val($("#BillingPostalCode").val());
		}
	});
	
	$("input[name='ShippingType']").on('click', function(event){
		var checkBox = $(this);
		var checkShipping = checkBox.attr('data-cost');
		$('#shipping > .price').text('$' + checkShipping); 
		
		var subttl = $('#subtotal > .price').text().substring(1);
		$('#grandtotal > .price').text('$' + (parseFloat(checkShipping) + parseFloat(subttl)).toFixed(2));
		
	});
		
//	Pirate Explorer Game
	window.addEventListener("keydown", function (event) {
		  if (event.defaultPrevented) {
		    return;
		  }

		  switch (event.key) {
		    case "ArrowDown":
		    		var index = $(".ship").index()+1;
		    		var stuff = ":nth-child("+index+")";
		    		$(".ship").removeClass("ship").parent().next().children(stuff).addClass("ship");
		      break;
		    case "ArrowUp":
			    	var index = $(".ship").index()+1;
		    		var stuff = ":nth-child("+index+")";
		    		$(".ship").removeClass("ship").parent().prev().children(stuff).addClass("ship");
		      break;
		    case "ArrowLeft":
			    	var index = $(".ship").index()+1;
		    		var stuff = ":nth-child("+index+")";
		    		$(".ship").removeClass("ship").parent().children(stuff).prev().addClass("ship");
		      break;
		    case "ArrowRight":
			    	var index = $(".ship").index()+1;
		    		var stuff = ":nth-child("+index+")";
		    		$(".ship").removeClass("ship").parent().children(stuff).next().addClass("ship");
		      break;
		    case "Enter":
		    	$(".ship").removeClass("ship");
		      break;
		    default:
		      return;
		  }

		  event.preventDefault();
		}, true);
});