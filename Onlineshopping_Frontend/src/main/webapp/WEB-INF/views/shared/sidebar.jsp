<p class="lead">SocketsOnline</p>


<div class="list-group">
<!-- Iterating through the collection which is coming inside the model  -->
<c:forEach items="${categories}"  var="category">
<a href="${contextRoot}/show/category/${category.categoryId}/products" id="a_${category.categoryName}" class="list-group-item">${category.categoryName}</a> 
</c:forEach>
</div>