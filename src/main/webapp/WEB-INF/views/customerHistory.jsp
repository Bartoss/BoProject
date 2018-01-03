<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Customer History Page</h1>

            <p class="lead">This is the customer history page.</p>
        </div>

        <table class="table table-striped table-hover">
            <thead class="thead-inverse">
            <tr >
                <th>Name</th>
                <th>Email</th>
                <th>Phone</th>
                <th>Username</th>
                <th>Enabled</th>

            </tr>
            </thead>
            <c:forEach items="${historyList}" var="history">
                <tr>
                    <td>${history.cart}</td>
                    <td>${history.cartItemId}</td>
                    <td>${history.product}</td>
                    <td>${history.quantity}</td>
                    <td>${history.totalPrice}</td>
                </tr>
            </c:forEach>
        </table>

        <%@include file="/WEB-INF/views/template/footer.jsp" %>
