<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>
<script>
    $(document).ready(function() {
        $('#example').DataTable();
    } );
</script>

<br/>
    <div class="container">
        <div class="page-header">
            <h1>Product Inventory Page</h1>

            <p class="lead">This is the product inventory page!</p>
        </div>

        <table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
            <thead class="thead-inverse">
            <tr>
                <th>No.</th>
                <th>Photo Thumb</th>
                <th>Product Name</th>
                <th>Category</th>
                <th>Condition</th>
                <th>Price</th>
                <th></th>
            </tr>
            </thead>
            <tbody>

            <c:forEach items="${products}" var="product">

                <tr>
                    <th>${product.productId}</th>
                    <td><img src="<c:url value="/resources/images/${product.productId}.png" /> " alt="image" class="image"/></td>
                    <td>${product.productName}</td>
                    <td>${product.productCategory}</td>
                    <td>${product.productCondition}</td>
                    <td>${product.productPrice} USD</td>
                    <td><a href="<spring:url value="/product/viewProduct/${product.productId}" />"
                    ><i class="fa fa-info-circle" aria-hidden="true"></i></a>
                        <a href="<spring:url value="/admin/product/deleteProduct/${product.productId}" />"
                        ><i class="fa fa-times" aria-hidden="true"></i></a>
                        <a href="<spring:url value="/admin/product/editProduct/${product.productId}" />"
                        ><i class="fa fa-pencil-square-o" aria-hidden="true"></i></a>
                    </td>
                </tr>

            </c:forEach>
            </tbody>
        </table>
        <a href="<spring:url value="/admin/product/addProduct" />" class="btn btn-primary">Add Product</a>
    </div>
<br/>
<%@include file="/WEB-INF/views/template/footer.jsp" %>
