$(document).ready(function(){

	// Profile picture functionalities
    $(".avatar").click(function(){
        var src = $(this).attr('src');        
        $("#profileImage").attr("src", src);
        $("#chosenAvatar").val(src);
        $("#picture").val('');
    });

    $("#profileImage").load(function() {        
        var selectedAvatar = $(this)[0].src,
    	avatar = $('.avatar');
	    for(i=0; i<avatar.length; i++ ) {
	    	//console.log(avatar[i].src);
	    	if( selectedAvatar == avatar[i].src ) {
		    	$(avatar[i]).addClass("selected-avatar");
		    } else {
		    	$(avatar[i]).removeClass("selected-avatar")
		    }
	    }	
    })

    // set uploaded profile picture
    function readURL(input) {
	    if (input.files && input.files[0]) {
	        var reader = new FileReader();
	        reader.onload = function (e) {
	            $('#profileImage').attr('src', e.target.result);
	        }
	        reader.readAsDataURL(input.files[0]);
	    }
	}
	$("#picture").change(function(){
	    readURL(this);
	});

	// End profile picture functionalities

});