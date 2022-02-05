function deleted(id) {
	swal({
		title: "Are you sure ?",
		text: "Once deleted, you will not be able to recover this file!",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
		.then((OK) => {
			if (OK) {
				$.ajax({
					url: "/delete/" + id,
					success: function(res) {
						console.log(res);
					}
				});
				swal("Poof! Your file has been deleted!", {
					icon: "success",
				}). then ((OK)=>{
					if(OK){
						location.href="/list";
					}
				});
			} else {
				swal("Your file is safe!");
			}
		});
}