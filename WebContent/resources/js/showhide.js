jQuery(function() {

    jQuery('#login-form-link').click(function(e) {
		jQuery("#login-form").delay(100).fadeIn(100);
 		jQuery("#register-form").fadeOut(100);
		jQuery('#register-form-link').removeClass('active');
		jQuery(this).addClass('active');
		e.preventDefault();
	});
	jQuery('#register-form-link').click(function(e) {
		jQuery("#register-form").delay(100).fadeIn(100);
 		jQuery("#login-form").fadeOut(100);
		jQuery('#login-form-link').removeClass('active');
		jQuery(this).addClass('active');
		e.preventDefault();
	});

});