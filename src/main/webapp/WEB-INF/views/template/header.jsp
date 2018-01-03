<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>BO Project</title>

    <!-- Angular JS -->
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.1/angular.min.js" > </script>

    <%--Jquery--%>
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>

    <%--Data Table--%>
    <link href="<c:url value="/resources/css/dataTables.bootstrap4.min.css"/>" rel="stylesheet">
    <!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">

    <!-- Carousel CSS -->
    <link href="<c:url value="/resources/css/carousel.css" />" rel="stylesheet">

    <!-- Main CSS -->
    <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">

    <%--Font Awesome--%>
    <link href="<c:url value="/resources/css/font-awesome.min.css"/>" rel="stylesheet">
</head>
<body>

<header>
    <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
        <a class="navbar-brand" href="<c:url value="/" /> ">Shop</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarCollapse">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="<c:url value="/" /> ">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="<c:url value="/product/productList/all" />">Products</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="<c:url value="/contactUs" />">About Us</a>
                </li>
            </ul>
            <ul class="navbar-nav mt-2 mt-md-2">
                <c:if test="${pageContext.request.userPrincipal.name != null}">
                <li class="nav-item active">
                    <a class="nav-link">Welcome: ${pageContext.request.userPrincipal.name}</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="<c:url value="/j_spring_security_logout" />">Logout</a>
                </li>
                    <c:if test="${pageContext.request.userPrincipal.name != 'admin'}">
                        <li class="nav-item">
                            <a class="nav-link" href="<c:url value="/customer/cart" />">Cart</a>
                        </li>
                    </c:if>
                    <c:if test="${pageContext.request.userPrincipal.name  == 'admin'}">
                        <li class="nav-item">
                            <a class="nav-link" href="<c:url value="/admin" />">Admin</a>
                        </li>
                    </c:if>
                </c:if>
                <c:if test="${pageContext.request.userPrincipal.name  == null}">
                    <li class="nav-item">
                        <a class="nav-link" href="<c:url value="/login/" />">Login</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="<c:url value="/register" />">Register</a>
                    </li>
                </c:if>
            </ul>
        </div>
    </nav>
</header>

<main role="main">