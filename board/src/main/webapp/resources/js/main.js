$(function(){
	
	// writeform, 글쓰기
	$('#btn_write').on('click', function(){
		if($('#title').val() == "") {
			alert("제목을 입력하세요.");
			$('#title').focus();
			return;
		}
		if($('#writer').val() == "") {
			alert("글쓴이를 입력하세요.");
			$('#writer').focus();
			return;
		}
		if($('#content').val() == "") {
			alert("내용을 입력하세요.");
			$('#content').focus();
			return;
		}
		if($('#pwd').val() == "") {
			alert("비밀번호를 입력하세요.");
			$('#pwd').focus();
			return;
		}
		$('#writeform').submit();
	});
	
});