function sumDouble(x, y) {
    if (x == y) {
    return (x+y)*2;
    }
    else {
    return x + y;
    }
}

function hasTeen(x, y, z) {
    if (x >= 13 && x <= 19) {
    return true;
    }
    else if (y >= 13 && y <= 19) {
    return true;
    }
    else if (z >= 13 && z <= 19) {
    return true;
    }       
    else {
    return false;
    }
}

function lastDigit(x, y) {
    var xAsString = x.toString();
    var yAsString = y.toString();
    var xLast = xAsString.substr(-1);
    var yLast = yAsString.substr(-1);
    if (xLast == yLast){
        return true;
    }
    else{
        return false;
    }
}

function seeColor(x){
    if (x.startsWith("red")){
        return "red";
    }
    else if (x.startsWith("blue")){
        return "blue";
    }
    else{
        return "";
    } 
}

function middleThree(x){
    if (x.length == 3) {
        return x;
    }
    else {
        return x.substr(x.length/2-1, 3);
    }
}

function frontAgain(x){
    if (x.substr(0,2) == x.substr(x.length-2, 2)){
        return true;
    }
    else{
        return false;
    }
}

function alarmClock(x, y){
    if (y){
        if(x == 0){
            return "Sunday off"
        }
        else if(x == 1){
            return "Monday 10:00"
        }
        else if(x == 2){
            return "Tuesday 10:00"
        }
        else if(x == 3){
            return "Wednesday 10:00"
        }
        else if(x == 4){
            return "Thursday 10:00"
        }
        else if(x == 5){
            return "Friday 10:00"
        }
        else {
            return "Saturday off"
        }
    }
    else {

        if(x == 0){
            return "Sunday 10:00"
        }
        else if(x == 1){
            return "Monday 7:00"
        }
        else if(x == 2){
            return "Tuesday 7:00"
        }
        else if(x == 3){
            return "Wednesday 7:00"
        }
        else if(x == 4){
            return "Thursday 7:00"
        }
        else if(x == 5){
            return "Friday 7:00"
        }
        else {
            return "Saturday 10:00"
        }
    }
}

function makeMiddle(x){
    if (x.length%2 != 0 || x.length < 2){
        return [];
    }
    else {
        var y = x.slice(x.length/2-1, x.length/2+1);
        return y;
    }

}

function oddOnly(x){
    var y = [];
    var i;
    for (i = 0; i < x.length; i++) { 
        if (x[i]%2 != 0){
            y.push(x[i]);
        }
    }
    return y;
}

function weave(x, y){
    var z = [];
    var i;
    var j = 0;
    if (x.length > y.length){
        for (i = 0; i < y.length; i++) { 
                z.push(x[j]);
                z.push(y[i]);
                j++;
        }
        for (j; j < x.length; j++) { 
            z.push(x[j]);
        } 
    }
    else {
        for (i = 0; i < x.length; i++) { 
                z.push(x[i]);
                z.push(y[j]);
                j++;
        }
        for (j; j < y.length; j++) { 
            z.push(y[j]);
        }
        
    }
    return z;
}

function cigarParty(x, y){
    if (y){
        if (x >= 40) {
            return true;
        }
        else {
            return false;
        }
    }
    else  {
        if (x >= 40 && x <= 60){
            return true;
        }
        else {
            return false;
        }
    }
}

function stringSplosion (x) {
    var y = [];
    for (i = 0; i <= x.length; i++) {
        y.push(x.substr(0,i));
    }
    var firstRes = y.join();
    var result = firstRes.replace(/,/g, '');
    return result;
}

function fizzBuzz (x) {
    if (x%3==0 && x%5==0){
        return "FizzBuzz";
    }
    else if (x%3==0){
        return "Fizz";
    }
    else if (x%5==0){
        return "Buzz";
    }
    else {
        return x;
    }
}

function countValues(array) {
    result = {};
    var x;
    for (x of array) {
    if (result[x] !== undefined) {
    result[x] = result[x] + 1;
    } else {
    result[x] = 1;
    }
    } return result;
}

function reverseArray(x){

    return x.reverse();
}

function blackJack(x,y){
    return 0;
}






