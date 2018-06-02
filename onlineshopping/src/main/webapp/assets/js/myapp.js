$(function() {
	// solving the active menu problem
	switch (menu) {
	case 'About US': // here it comes from the controller class title as
		// About US
		$('#about').addClass('active');/*
										 * here #about tag is meant for the
										 * fetch the details of ABOUT which is
										 * declear as id=about in our navbar.jsp
										 * page
										 */
		break;

	case 'Contact US':
		$('#contact').addClass('active');
		break;

	case 'All Products':
		$('#listProducts').addClass('active');
		break;

	default:
		if (menu == "Home")
			break;
		$('#listProducts').addClass('active');
		$('#a_' + menu).addClass('active');
		break;
	}
	
	
	//code for jquery datatable
	//create a dataser
	
	var products = [
	                ['1','ABC'],
	                ['2','DEF'],
	                ['3','GHI'],
	                ['4','KLM'],
	                ['5','NOP'],
	                ['6','QRS'],
	                ['7','TUV'],
	                ['8','WXY'],
	                ['9','ZAB']
	                
	                ];
	
		var $table=$('#productListTable');
		
		//execute the below code only if we have this table
		if($table.length)
			{
				//console.log('inside the table!!!!!');
			
			$table.DataTable({
				lengthMenu :[[3,5,10,-1],['3 records', '5 records', '10 records', 'All']],
				pageLength :5,
				data :products
			});
			}
});