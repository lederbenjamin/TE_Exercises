﻿/// <reference path="../jquery-3.1.1.js" />
//Locate all <div> elements and add the 'president' class.
function presentialDivs() {
	$("#presidents").children("div").addClass("president");
}

//Locate George Washington and add the 'founding-father' class
function georgeWashington() {
	$("#presidents").children("#george-washington").addClass("founding-father");

}

//Locate all Republican presidents and add the 'red' class.
function republicanPresidents() {
	$("#presidents").children(".Republican").addClass("red");

}

//Locate all Democrat presidents and add the 'blue' class.
function democratPresidents() {
	$("#presidents").children(".Democratic").addClass("blue");

}

//Locate all Federalist presidents and add the 'gold' class.
function otherPresidents() {
	$("div").find(".president").not(".Republican").not(".Democratic").addClass("gold");

}

//Locate all presidents named 'James' and add the 'james' class.
function presidentsNamedJames() {
	$("[id*='james']").addClass("james");

}

//Locate each president serving at the beginning of each century and add the 'beginningOfCentury' class.
function turnOfTheCenturyPresidents() {
    $("#presidents").children("h2").next().addClass("beginningOfCentury");
}

//Locate each president serving at the end of the century and add the 'endOfCentury' class.
function endOfTheCenturyPresidents() {
    $("#presidents").children("h2").prev().addClass("endOfCentury");
    $("#presidents").children("div").last().addClass("endOfCentury");
}

//Locate all presidents serving in the 1900s who appear on currency and add the 'appearOnCurrency' class.
function currencyPresidents() {
    $("#presidents").children("h2:contains('1900s')").nextAll(".currency").addClass("appearOnCurrency");


}