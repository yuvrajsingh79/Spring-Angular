$(function() {
	// solving the active menu
	switch (menu) {
	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'Products':
		$('#listproducts').addClass('active');
		// $('#a-'+menu).addClass('active');
		break;
	default:
		$('#listproducts').addClass('active');
		$('#a-'+menu).addClass('active');
		break;
	}

});