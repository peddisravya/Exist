<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Upload File Request Page</title>
</head>
<body>


<form  action="upl" enctype="multipart/form-data">
		File to upload: <input required="required" type="file" name="file" /><br />

<!-- 		Name: <input type="text" name="name" /><br /> <br /> --> <input
			type="submit" value="Upload" /> Press here to upload the file!
	</form>

</body>
</html>