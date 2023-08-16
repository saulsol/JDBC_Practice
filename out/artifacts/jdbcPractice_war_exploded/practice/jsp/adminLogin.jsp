<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
 <title>관리자</title>
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
 <meta http-equiv="X-UA-Compatible" content="IE=10" />
 <meta http-equiv="imagetoolbar" content="no" />
 <meta name="copyright" content="Copyright 2009 @ high1 all rights reserved" />
 <link href="../css/contents.css" rel="stylesheet" type="text/css" />
 <script>
  var loginCheck=function(){
   if(!document.login.id.value||!document.login.pass.value){
    alert('id or pass Check!');
    document.login.id.value='';
    document.login.pass.value='';
    document.login.id.focus();
    return false;
   }
   document.login.submit();
  }
 </script>
</head>
<body>
<form name="login" method="post" action="/ServletLogPractice">
 <div id="loginWrapper">
  <div class="loginForm">
   <fieldset>
    <legend>관리자 시스템 로그인</legend>
    <dl>

     <dt><img src="../img/common/th_id.gif" alt="아이디" /></dt>
     <dd><input type="text" name="id" class="text" id="user_id" /></dd>

     <dt><img src="../img/common/th_pw.gif" alt="비밀번호" /></dt>
     <dd><input type="password" name="pass" class="text" id="user_passwd" /></dd>
    </dl>
    <div class="btn">
     <img onclick="loginCheck()" id="btnSubmit" src="../img/button/btn_login.gif" alt="LOGIN" title="LOGIN"  />
    </div>

    <div class="saveId"><input type="checkbox" id="checker" name="checker" />
     <img src="../img/common/save_id.gif" alt="아이디 저장" />
    </div>
   </fieldset>
  </div>
 </div>
</form>
</body>
</html>