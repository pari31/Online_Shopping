<div class="container">
	<div class="row">

		<!-- To display the sidebar -->
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>

		<!-- To display the actual products -->
		<div class="col-md-9">

			<!-- Adding Bootstrap Breadcrumb component -->
			<div class="row">
				<div class="col-lg-12">
					<c:if test="${userClickAllProducts == true }">

<!-- 'breadcrumb' is a readymade bootstrap class used to give the effect like:Home/category/Mobile -->
						<ol class="breadcrumb">
							/

							<li><a href="${contextRoot}/home">Home</a>/</li>

							<li class="active">All Products</li>

						</ol>
					</c:if>

					<c:if test="${userClickCategoryProducts == true }">

						<ol class="breadcrumb">

							<li><a href="${contextRoot}/home">Home</a>/</li>

							<li class="active">Category</li>
							<li class="active">${category.categoryName}</li>
						</ol>
					</c:if>

				</div>


			</div>

		</div>

	</div>

</div>