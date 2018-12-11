	$("#btn-login").click(function(){
	 		var params={
	 				username:$("#username").val(),
	 				password:$("#password").val()
	 		};
	 		var url = "/service/user/doLogin";
	 		$.post(url,params,function(result){
	 			if(result.status==200){	
	 				location.href="/index.html?t="+Math.random();
	 			}else{
	 				
	 				alert("账号密码错误！")
	 			}
	 		})
	 	});

	
	/* $("#btn-login").click(function(){
		var username=$("#username").val();
		var password=$("#password").val();
		
		$.ajax({
			url:"http://localhost:8091/service/user/doLogin",
			type:"post",
			data:{username:username,password:password},
			success:function(data){
				console.log(data)
			}		
		})
	}); */