function runFunction()
{
	var x = document.getElementById("fname").value;
	var y = document.getElementById("lname").value;
	var z = document.getElementsByName("hello").value = x + " " + y;
	document.getElementsByName("hello")[0].innerHTML = x + " " + y;
	window.alert("Warmonger : " + x + " " + y);
}