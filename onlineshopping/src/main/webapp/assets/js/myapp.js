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
});