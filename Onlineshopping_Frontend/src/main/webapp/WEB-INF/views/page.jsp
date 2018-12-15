
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="css" value="resources/css"/>
<c:set var="js" value="resources/js"/>
<c:set var="images" value="resources/images"/>

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>SocketsOnline.com - ${title}</title>


<script>
	window.menu = '${title}';//The ${title}is coming from the Home Controller
	window.contextRoot = '${contextRoot}';
</script>

<!-- Bootstrap v3.3.7 Core CSS -->
<link href="${css}/bootstrap.css" rel="stylesheet">

<!-- Bootstrap v3.3.7 Cyborg theme-->
<link href="${css}/bootstrap-cyborg-theme.css" rel="stylesheet">

<!--Bootstrap DataTables -->
<%-- <link href="${css}/dataTables.bootstrap4.css" rel="stylesheet"> --%>

<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">


</head>

<body>

	<div class="wrapper">

		<!-- Navigation -->
		<%@include file="./shared/navbar.jsp"%>

		<!-- Page Content -->

		<div class="content">
			
			<!-- Loading the Home page content when user clicks Home -->
			<c:if test="${userClickHome == true}">
				<%@include file="home.jsp"%>
			</c:if>

			<!-- Loading the About Us page content when user clicks About Us -->
			<c:if test="${userClickAbout == true}">
				<%@include file="about.jsp"%>
			</c:if>

			<!-- Loading the Contact Us page content when user clicks Contact Us -->
			<c:if test="${userClickContact == true}">
				<%@include file="contact.jsp"%>
			</c:if>

			<!-- Loading only when user click All Products or CategoryProducts-->
			<c:if
				test="${userClickAllProducts==true or userClickCategoryProducts==true}">
				<%@include file="listProducts.jsp"%>
			</c:if>
		</div>
		<!-- Footer comes here -->

		<%@include file="./shared/footer.jsp"%>
	</div>

	<!-- Bootstrap core JavaScript -->
	<script src="${js}/jquery.js"></script>


	<!-- DataTable Bootstarp script -->
	<%-- <script src="${js}/dataTables.bootstrap.js"></script> --%>

	<!--Linking myapp.js to page.jsp  -->
	<script src="${js}/myapp.js"></script>
	<!-- Bootstrap v3.3.7 js -->
	<script src="${js}/bootstrap.js"></script>
	
</body>

</html>
