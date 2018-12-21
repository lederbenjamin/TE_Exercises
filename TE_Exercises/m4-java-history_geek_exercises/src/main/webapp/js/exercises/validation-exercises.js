/// <reference path="../jquery-3.1.1.js" />
/// <reference path="../jquery.validate.js" />

// Email address - required
// Email address - .gov only (BONUS)
// Password - required, length 8 or more
// ConfirmPassword

$(document).ready(function () {

    // Validate takes an object, not a function
    // Objects in javascript use { .. } notation and are the same as key / value pairs
    $("#register").find("#form0").validate({

        debug: false,
        rules: {

            email: {
                email: true,            //require this field to only accept email
                required: true,
                dotGovEmail: true, //uses custom validator for @techelevator.com
            },
            password: {
                required: true,         //requires password field
                minlength: 8,           //requires at least 8 characters

            },
            confirmPassword: {
                equalTo: "#password",    //uses the CSS selector to match value of the field
            },

        },
        messages: {
            email: {
                required: "You must provide an email",
            },

        },
        errorClass: "error",
        validClass: "valid"


    });

    $("#login").find("#form0").validate({

        debug: false,
        rules: {

            email: {
                email: true,            //require this field to only accept email
                required: true
                //uses custom validator for @techelevator.com
            },
            password: {
                required: true,         //requires password field
                minlength: 8,           //requires at least 8 characters

            },
            confirmPassword: {
                equalTo: "#password",    //uses the CSS selector to match value of the field
            },

        },
        messages: {
            email: {
                required: "You must provide an email",
            },

        },
        errorClass: "error",
        validClass: "valid"


    });
    $("#checkout").validate({
        errorContainer: "#errorSummary",
        errorLabelContainer: "#errorSummary ul",
        wrapper: "li",
        rules: {
            BillingAddress1: {
                required: true
            },
            BillingCity: {
                required: true
            },
            BillingState: {
                required: true
            },
            BillingPostalCode: {
                required: true
            },
            ShippingAddress1: {
                required: true
            },
            ShippingCity: {
                required: true
            },
            ShippingState: {
                required: true
            },
            NameOnCard: {
                required: true
            },
            CreditCardNumber: {
                required: true
            },
            ExpirationDate: {
                required: true
            }


        },

        messages: {
            BillingAddress1: {
                required: "You must provide a Billing Address"
            },
            BillingCity: {
                required: "You must provide a Billing City"
            },
            BillingState: {
                required: "You must provide a Billing State"
            },
            BillingPostalCode: {
                required: "You must provide a Billing Postal Code"
            },
            ShippingAddress1: {
                required: "You must provide a Shipping Address"
            },
            ShippingCity: {
                required: "You must provide a Shipping City"
            },
            ShippingState: {
                required: "You must provide a Shipping State"
            },
            ShippingPostalCode: {
                required: "You must provide a Shipping Postal Code"
            },
            NameOnCard: {
                required: "You must provide a name for the Credit Card"
            },
            CreditCardNumber: {
                required: "You must provide a Credit Card number"
            },
            ExpirationDate: {
                required: "You must provide an expiration date for your Credit Card"
            }

        }

    });

});


$.validator.addMethod("govEmail", function (value, index) {
    return value.toLowerCase().match(/@[a-zA-Z0-9\.\-]+\.gov$/);
    //>>.match(/^[\w\-\.\+]+\@[a-zA-Z0-9\.\-]+\.[a-zA-z0-9]{2,4}$/;<<
    //>>^^
}, "Email must end with .gov");

$.validator.addMethod("strongpassword", function (value, index) {
    return value.match(/[A-Z]/) && value.match(/[a-z]/) && value.match(/\d/);
}, "Please enter a stronger password (one capital, one lowercase, and one number");