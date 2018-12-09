	$("#btn-login").click(function(){
	 		var params={
	 				username:$("#username").val(),
	 				password:$("#password").val()
	 		};
	 		var url = "/ahu-web/service/user/doLogin";
	 		$.post(url,params,function(result){
	 			if(result.status==200){	
	 				location.href="/ahu-web/index.html?t="+Math.random();
	 			}else{
	 				console.log("xxx");
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