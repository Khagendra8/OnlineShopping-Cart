<div class="container">

	<div class="row">


		<!-- Would be to display sidebar -->
		<div class="col-md-3">

			<%@include file="./shared/sidebar.jsp"%>

		</div>

		<!-- to display the actual products -->
		<div class="col-md-9">

			<!-- Added breadcrumb component like home/Category/Mobile-->
			<div class="row">

				<div class="col-lg-12">

					<c:if test="${userClickAllProducts == true}">
					
						
						<ol class="breadcrumb">


							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">/All Products</li>


						</ol>
					</c:if>
					
					
					<c:if test="${userClickCategoryProducts == true}">
						
						<ol class="breadcrumb">


							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">/Category</li>
							<li class="active">/${category.name}</li>


						</ol>
					</c:if>
					
					<div class="row">
						<div class="col-xs-12">
							<table id="productListTable" class="table table-striped table-border">
								<thead>
									<th>ID</th>
									<th>Name</th>			
									
								</thead>
							</table>
						</div>
					</div>

				</div>


			</div>