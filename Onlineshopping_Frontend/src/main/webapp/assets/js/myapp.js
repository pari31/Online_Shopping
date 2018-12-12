

$(function(){
	
	/* Solving the Active Menu problem */
	switch(menu){
	
	case 'About Us':
		$('#about').addClass('active');//fetching jquery element from navbar.jsp using the jquery selector'#'
		break;
		
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	
	default:
		$('#home').addClass('active');
	break;
	
	}
});

	
	
	
	
	
	
	
