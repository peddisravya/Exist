<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
	function JSON2CSV(objArray) {
		var array = typeof objArray != 'object' ? JSON.parse(objArray)
				: objArray;

		var str = '';
		var line = '';

		if ($("#labels").is(':checked')) {
			var head = array[0];
			if ($("#quote").is(':checked')) {
				for ( var index in array[0]) {
					var value = index + "";
					line += '"' + value.replace(/"/g, '""') + '",';
				}
			} else {
				for ( var index in array[0]) {
					line += index + ',';
				}
			}

			line = line.slice(0, -1);
			str += line + '\r\n';
		}

		for (var i = 0; i < array.length; i++) {
			var line = '';

			if ($("#quote").is(':checked')) {
				for ( var index in array[i]) {
					var value = array[i][index] + "";
					line += '"' + value.replace(/"/g, '""') + '",';
				}
			} else {
				for ( var index in array[i]) {
					line += array[i][index] + ',';
				}
			}

			line = line.slice(0, -1);
			str += line + '\r\n';
		}
		return str;

	}

	$("#convert").click(function() {
		var json = $.parseJSON($("#json").val());
		var csv = JSON2CSV(json);
		$("#csv").val(csv);
	});

	$("#download").click(function() {
		var json = $.parseJSON($("#json").val());
		var csv = JSON2CSV(json);
		window.open("data:text/csv;charset=utf-8," + escape(csv))
	});
</script>
<style>
#heading {
	font-size: x-large;
	font-weight: bold;
}

.text {
	width: 99%;
	height: 200px;
}

.small {
	font-size: small;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSON to CSV</title>
</head>
<body>
	<p id="heading">JSON to CSV Converter</p>
	<p class="small">
		<a href="http://jsfiddle.net/sturtevant/AZFvQ/" target="_blank">CSV
			to JSON Converter</a>
</body>
</html>