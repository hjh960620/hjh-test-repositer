
function test(){
	alert("11111");
}

function errTest(){
	$.ajax({
		url:"/errTest",
		type:"GET",
		dataType:"json",
		contentType:"application/json",
		success:function(res){
			alert(res.msg)
		},
		error:function(res){
			
		}
	})
}