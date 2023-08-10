<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>관리자</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=10" />
<meta http-equiv="imagetoolbar" content="no" />
<link href="../css/contents.css" rel="stylesheet" type="text/css" />

	<script>
		let obj = document.frm;
		function sendData() {
			obj = document.frm;
			if (!obj.title.value||!obj.writer.value) {
				clearValue()
			}
			obj.submit();

		}

		function clearValue(){
			alert('title writer pass Check')
			obj.title.value = '';
			obj.writer.value = '';
			obj.writer.focus();
		}






	</script>


	<%
		String id = (String) session.getAttribute("id");
		if(id == null || id.equals("")) response.sendRedirect("adminLogin.jsp");

	%>

	<script>
		document.location.href = 'logoutAction.jsp';

	</script>



</head>
<body >
	<div id="wrapper">
		<div id="header">
			<div class="topInfoWrap">
				<div class="topInfoArea clfix">
					<div class="loginWrap">
						<span class="fir">2022.05.17</span>
						<span>13:30:22</span>
						<span><em><%= session.getAttribute("id")%></em>님 좋은 하루 되세요</span>
						<a href="" class="btnLogout"><img src="../img/common/btn_logout.gif" alt="로그아웃" /></a>
					</div>
				</div>
			</div>
			<div class="gnbSubWrap">
				
			</div>
		</div>	
		<div id="container">
			<div id="contentsWrap" class="contentsWrap">
				<div class="contents">
					<h1 class="title">게시판 등록</h1>
					<div class="btnSet clfix mgb15">
						<span class="fr">
							<span class="button" onclick="sendData()"><a href="#">저장</a></span>
							<span class="button"><a href="#">수정</a></span>
							<span class="button"><a href="#">목록</a></span>
							<span class="button"><a href="#">삭제</a></span>
						</span>
					</div>


					<form action="editPost.jsp" method="post" name = "frm">


					
					<table class="bbsWrite">
						<colgroup>
							<col width="90" />
							<col />
						</colgroup>

						<tbody>
						<tr>
							<th scope="row">작성자</th>
							<td><input type="text" name="writer" class="inputText" size="30" /></td>
						</tr>
						<tr>
							<th scope="row">제목</th>
							<td><input type="text" name="title" class="inputText" size="50" /></td>
						</tr>
						<tr>
							<th scope="row">내용</th>
							<td class="editer">
								<textarea name="contents"></textarea>
							</td>
						</tr>
						<tr>
							<th scope="row">이미지첨부</th>
							<td>
							<input type="file" name="file" class="inputText" size="50" />
							</td>
						</tr>
						</tbody>
					</table>
					</form>



				</div>
			</div>
		</div>
	</div>
</body>
</html>