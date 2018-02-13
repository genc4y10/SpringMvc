<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring"  uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Kullanici Form</title>
</head>
<body>
<spring:url value="/kullanici/save" var="saveURL"/>
	<form:form modelAttribute="kullaniciform" method="POST" action="${saveURL}">
	<table>
	<tr>
		<td>Isim</td>
		<td> <form:input path="isim"/>
	</tr>
	<tr>
		<td>Soyisim</td>
		<td> <form:input path="soyisim"/>
	</tr>
	<tr>
		<td>Telefon</td>
		<td> <form:input path="telefon"/>
	</tr>
	<tr>
		<td>E-posta</td>
		<td> <form:input path="eposta"/>
	</tr>
	<tr>
		<td>Dogum Tarihi</td>
		<td> <form:input path="dogumTarihi"/>
	</tr>
	<tr>
		<td>Daha once ticaretle ugrastiniz mi?</td>
		<td> <form:input path="ticaretleUgrastinizMi"/>
	</tr>
	<tr>
		<td>Tercih sebebiniz?</td>
		<td> <form:input path="tercihSebebi"/>
	</tr>
	<tr>
		<td>Nerede dukkan acmak istersiniz?</td>
		<td> <form:input path="neredeDukkanAcmakIstersiniz"/>
	</tr>
	<tr>
		<td>Yatirim miktariniz?</td>
		<td> <form:input path="yatirimMiktari"/>
	</tr>
	<tr>
		<td>Eklenecekleriniz</td>
		<td> <form:input path="eklenecekler"/>
	</tr>
	<tr>
		<td><button type="submit">Kaydet</button>
	</tr>
	
	</table>
	</form:form>
</body>
</html>