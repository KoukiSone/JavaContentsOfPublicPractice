<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>入力の確認</title>
</head>
<body>
<h1>入力の再確認</h1>
<p>
下記の入力でよろしいですか？<br>
<table border="1">
<tr>
	<td>ＩＤ：</td>
	<td>${RDU.id}</td>
</tr>
<tr>
	<td>名前：</td>
	<td>${RDU.name}</td>
</tr>
<tr>
	<td>フリガナ：</td>
	<td>${RDU.huri}</td>
</tr>
<tr>
	<td>年齢：</td>
	<td>${RDU.old}</td>
</tr>
<tr>
	<td>性別：</td>
	<td>${RDU.gender}</td>
</tr>
</table><br>
<a href="/final/newregister.html">戻る</a>
<a href="/final/C01?action=done">登録</a>
<!-- formのボタンでhrefと同じのを作れる -->
</body>
</html>