
$(function() {

	/* Solving the Active Menu problem */
	switch (menu) {

	case 'About Us':
		$('#about').addClass('active');// fetching jquery element from
										// navbar.jsp using the jquery
										// selector'#'
		break;

	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'All Products':
		$('#listProducts').addClass('active');
		break;
	default:
		$('#listProducts').addClass('active');
		$('#a_' + menu).addclass('active');
		break;

	}
});
