<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>dsadas</h1>
   <form action="j-spring-security-check" method="post">
      <table>
         <tr>
            <td> 用户名：</td>
            <td><input type="text" name="j_username"/></td>
         </tr>
         <tr>
            <td> 密码：</td>
            <td><input type="password" name="j_password"/></td>
         </tr>
         <tr>
            <td colspan="2" align="center">
                <input type="submit" value=" 登录 "/>
                <input type="reset" value=" 重置 "/>
            </td>
         </tr>
      </table>
   </form>
</body>
</html>