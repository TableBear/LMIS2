<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="zh">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>用户登录</title>

<link rel="stylesheet" type="text/css" href="/LMIS2/css/loginstyles.css">

</head>
<body>
<div class="jq22-container" style="padding-top:10px">
	<div class="login-wrap">
		<div class="login-html">
			<input id="tab-1" type="radio" name="tab" class="sign-in" checked="checked"><label for="tab-1" class="tab">登录</label>
			<input id="tab-2" type="radio" name="tab" class="sign-up" ><label for="tab-2" class="tab">注册</label>
			<div class="login-form">
				<form method="post" action="${pageContext.request.contextPath }/login.action">
					<div class="sign-in-htm">
						<div class="group">
							<label for="username1" class="label">用户名</label>
							<input id="username1" name="username" type="text" class="input">
						</div>
						<div class="group">
							<label for="password1" class="label">密码</label>
							<input id="password1" name="password" type="password" class="input" data-type="password">
						</div>
						<div class="group">
							<input id="check" type="checkbox" class="check" checked>
							<label for="check"><span class="icon"></span>记住密码</label>
						</div>
						<div class="group">
							<input type="submit" class="button" value="登录">
						</div>
						<div class="hr"></div>
						<div class="foot-lnk">
							<a href="#forgot">忘记密码？</a>
						</div>
					</div>
				</form>

				<div class="sign-up-htm">
					<form method="post" action="${pageContext.request.contextPath }/register.action">
						<div class="group">
							<label for="username" class="label">用户名</label>
							<input id="username" name="username" type="text" class="input">
						</div>
						<div class="group">
							<label for="password2" class="label">密码</label>
							<input id="password2" name="password" type="password" class="input" data-type="password">
						</div>
						<div class="group">
							<label for="password3" class="label">确认密码</label>
							<input id="password3" type="password" class="input" data-type="password">
						</div>
						<div class="group">
							<label for="telephone" class="label">手机号码</label>
							<input id="telephone" name="telephone" type="text" class="input">
						</div>
						<div class="group">
							<input type="submit" class="button" value="提交注册">
						</div>
					</form>
					<div class="hr"></div>
					<div class="foot-lnk">
						<label for="tab-1"><a>Already Member?</a></label>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

</body>
</html>