<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>
	$(document).ready(function () {
		$("#login_btn").on('click', function() {
			loginChk();
		})
		
		//이력 보기 클릭 시 이벤트 발생
		$("#login_log_btn").on('click', function() {
			loginLog();
		});
	});
		
	function loginChk() {
	    $.ajax({
	        url: "loginChk",
	        type: "POST",
	        data: {
	        	id:$("#id").val(),
	        	pw:$("#pw").val()
	        },
	        success: function(data){
	            alert(data.Msg);
	        }
	  	});
	}
	
	function loginLog() {
		if ($("#id").val() == "") {
			alert("아이디를 입력하세요.");
			return;
		}
		
		$.ajax({
	        url: "loginLog",
	        type: "POST",
	        data: {
	        	id:$("#id").val()
	        },
	        success: function(data){
	           if (data.Code == 0 ) {
		        	for (i=0; i<data.data.length; i++ ) {
		            	var tag = "<tr>" + 
			   	                   		"<td>" + data.data[i].member_num + "</td>" + 
			   	                   		"<td>" + data.data[i].id + "</td>" +
			   	                   		"<td>" + data.data[i].pw + "</td>" +
			   	                   		"<td>" + data.data[i].regDate + "</td>" +
		   	                   	  "</tr>"   
		   	                   	  
		   	                   	  
		   	            $("#login_log_tb").append(tag);
		            }
	           } else {
	        	   alert(data.Msg);
	           }
	        }
	  	});
	}
</script>
<style>
	#login_log table td, th {
		width:100px;
		border: 1px solid #444444;
	    border-collapse: collapse;
	}
</style>
</head>
<body>
	<table>
		<tr>
			<td>아이디 : </td>
			<td><input type="text" id="id"></td>
		</tr>
		<tr>
			<td>비밀번호:</td>
			<td><input type="password" id="pw"></td>
		</tr>
		<tr>
			<td><div id="login_btn" style="background-color:#ddd; cursor:pointer;">로그인</div>
		</tr>
	</table>
	
	<div id="login_log_btn" style="margin-top:100px; cursor:pointer; background-color:#ddd; width:100px;">이력보기</div>
	<div id="login_log" style="padding-top:20px;">
		<table id ="login_log_tb">
			<tr> 
				<th>번호</th> 
				<th>아이디</th>
				<th>비밀번호</th>
				<th>가입날짜</th>
	        </tr> 
		</table>
	</div>
</body>
</html>