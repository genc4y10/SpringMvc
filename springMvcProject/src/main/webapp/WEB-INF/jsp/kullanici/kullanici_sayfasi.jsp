<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring"  uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Kullanici Sayfasi</title>
</head>
<body>
<spring:url value="/kullanici/add" var="addURL"/>
<a href="${addURL}">Kayit Ekle </a>
	<h1>Veritabanindaki Kullanicilar</h1>
	<table width="100%" border="1">
	<tr>
		<th>Isim</th>
		<th>Soyisim</th>
		<th>Adres</th>
		<th>Telefon</th>
		<th>E-posta</th>
		<th>Dogum tarihi</th>
		<th>Daha önce ticaretle ugrastiniz mi?</th>
		<th>Tercih sebebi?</th>
		<th>Daha önce ticaretle ugrastiniz mi?</th>
		<th>Yatirim miktariniz?</th>
		<th>Eklenecekler</th>
		<th colspan="2"> action </th>
	</tr>
	<c:forEach items="${list}" var="kullanici">
	<tr>
	<td> ${kullanici.isim}</td>
	<td> ${kullanici.soyisim}</td>
	<td> ${kullanici.adres}</td>
	<td> ${kullanici.telefon}</td>
	<td> ${kullanici.eposta}</td>
	<td> ${kullanici.dogumTarihi}</td>
	<td> ${kullanici.ticaretleUgrastinizMi}</td>
	<td> ${kullanici.tercihSebebi}</td>
	<td> ${kullanici.neredeDukkanAcmakIstersiniz}</td>
	<td> ${kullanici.yatirimMiktari}</td>
	<td> ${kullanici.eklenecekler}</td>
	
	</tr>
	</c:forEach>
	</table>
</body>
</html>