<h1 class="my-4">Scorp Mart</h1>
<div class="list-group">
	<c:forEach items="${categories}" var="category">
		<a href="${contextRoot}/show/category/${category.id}/products" class="list-group-item" id="a-${category.name}">${category.name}</a>
	</c:forEach>
</div>