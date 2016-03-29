<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Senior Secondary Certificate Details</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/general.css" />
</head>
<body>
	<jsp:include page="../../includes/header.jsp" />
	<button id="updateDetails">Update Details</button>
	<div>
		<h2>Senior Secondary Certificate Details:</h2>
		<form action="${pageContext.request.contextPath}/profile/updateSSCDetails" method="post" >
			<p><input type="hidden" name="rollNumber" value="${rollNumber}"/></p>
			<p>School Name: <input type="text" name="schoolName" value="${SSCDetails.schoolName}" disabled/></p>
			<p>Board: <input type="text" name="board" value="${SSCDetails.board}" disabled/></p>
			<p>Year: <input type="text" name="year" value="${SSCDetails.year}" disabled/></p>
			<p>Aggregate: <input type="text" name="aggregate" value="${SSCDetails.aggregate}" disabled/></p>
			<p>Subjects: <input type="checkbox" name="subjects" value="English" disabled
						 	<c:forEach var="subject" items="${SSCDetails.subjects}">
						 		<c:if test="${subject == 'English' }">
						 			<c:out value="checked" />
						 		</c:if>
						 	</c:forEach>
						 />English
						 <input type="checkbox" name="subjects" value="Hindi" disabled
						 	<c:forEach var="subject" items="${SSCDetails.subjects}">
						 		<c:if test="${subject == 'Hindi' }">
						 			<c:out value="checked" />
						 		</c:if>
						 	</c:forEach>
						 />Hindi
			 			 <input type="checkbox" name="subjects" value="Sanskrit" disabled
			 			 	<c:forEach var="subject" items="${SSCDetails.subjects}">
						 		<c:if test="${subject == 'Sanskrit' }">
						 			<c:out value="checked" />
						 		</c:if>
						 	</c:forEach>
			 			 />Sanskrit
						 <input type="checkbox" name="subjects" value="Science" disabled
						 	<c:forEach var="subject" items="${SSCDetails.subjects}">
						 		<c:if test="${subject == 'Science' }">
						 			<c:out value="checked" />
						 		</c:if>
						 	</c:forEach>
						 />Science
						 <input type="checkbox" name="subjects" value="Social Science"disabled
						 	<c:forEach var="subject" items="${SSCDetails.subjects}">
						 		<c:if test="${subject == 'Social Science' }">
						 			<c:out value="checked" />
						 		</c:if>
						 	</c:forEach>
						 />Social Science
						 <input type="checkbox" name="subjects" value="Mathematics" disabled
						 	<c:forEach var="subject" items="${SSCDetails.subjects}">
						 		<c:if test="${subject == 'Mathematics' }">
						 			<c:out value="checked" />
						 		</c:if>
						 	</c:forEach>
						 />Mathematics
			 			 <input type="checkbox" name="subjects" value="IT" disabled
			 			 	<c:forEach var="subject" items="${SSCDetails.subjects}">
						 		<c:if test="${subject == 'IT' }">
						 			<c:out value="checked" />
						 		</c:if>
						 	</c:forEach>
			 			 />IT
			 </p>
			<input type="submit" value="Submit" id="submit" disabled/>
		</form>
	</div>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/updateDetails.js"></script>
</body>
</html>