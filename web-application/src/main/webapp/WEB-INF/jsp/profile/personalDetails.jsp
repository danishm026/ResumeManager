<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/general.css" />
<title>Profile</title>
</head>
<body>
	<jsp:include page="../includes/header.jsp" />
	<button id="updateDetails">Update Details </button>
	<div>
		<a href="profile/academic/SSCDetails">SSC Details</a>
	</div>
	<div>
		<h2>Personal Details:</h2>
		<form action="UpdatePersonalDetails" method="post">
            <input type="hidden" name="rollNumber" value="${rollNumber}" />
            <p>
              First Name: <input type="text" name="firstName" value="${personalDetails.firstName}" disabled/>
              <button class="editField" class="small-icon-wrapper"><img src="${pageContext.request.contextPath}/resources/icons/edit.png" class="small-icon"/></button>
            </p>
            <p>
            Middle Name: <input type="text" name="middleName" value="${personalDetails.middleName}" disabled/>
            <button class="editField" class="small-icon-wrapper"><img src="${pageContext.request.contextPath}/resources/icons/edit.png" class="small-icon"/></button>
            </p>
            <p>
            Last Name: <input type="text" name="lastName" value="${personalDetails.lastName}" disabled/>
            <button class="editField" class="small-icon-wrapper"><img src="${pageContext.request.contextPath}/resources/icons/edit.png" class="small-icon"/></button>
            </p>
                <p>
            Guardian Name: <input type="text" name="guardianName" value="${personalDetails.guardianName}" disabled/>
            <button class="editField" class="small-icon-wrapper"><img src="${pageContext.request.contextPath}/resources/icons/edit.png" class="small-icon"/></button>
            </p>
            <p>
                    Job Interest: <input type="checkbox" name="jobInterest" value="Coding" disabled
                        <c:forEach var="interest" items="${personalDetails.jobInterest}">
                        <c:if test="${interest == 'Coding'}" >
                        	<c:out value="checked" />
                        </c:if>
                    </c:forEach>
                    />Coding
                                  <input type="checkbox" name="jobInterest" value="Analyst" disabled
                    <c:forEach var="interest" items="${personalDetails.jobInterest}">
                    	<c:if test="${interest == 'Analyst'}" >
                        	<c:out value="checked" />
                        </c:if>
                    </c:forEach>	
                                   />Analyst
                                  <input type="checkbox" name="jobInterest" value="Technical" disabled 
                    <c:forEach var="interest" items="${personalDetails.jobInterest}">
                    	<c:if test="${interest == 'Technical'}" >
                        	<c:out value="checked" />
                        </c:if>
                    </c:forEach>
                                  />Technical
                                  <input type="checkbox" name="jobInterest" value="Non-Technical" disabled 
                    <c:forEach var="interest" items="${personalDetails.jobInterest}" >
                    	<c:if test="${interest == 'Non-Technical'}">
							<c:out value="checked" />
                    	</c:if>
                    </c:forEach>
                                  />Non-Technical
                <button class="editField" class="small-icon-wrapper"><img src="${pageContext.request.contextPath}/resources/icons/edit.png" class="small-icon"/></button>
            </p>
                <h2>Contact Details:</h2>
            <p>
            Permanent Address: <input type="text" name="permanentAddress" value="${personalDetails.permanentAddress}" disabled/>
            <button class="editField" class="small-icon-wrapper"><img src="${pageContext.request.contextPath}/resources/icons/edit.png" class="small-icon"/></button>
            </p>
            <p>
            Current Address: <input type="text" name="currentAddress" value="${personalDetails.currentAddress}" disabled/>
            <button class="editField" class="small-icon-wrapper"><img src="${pageContext.request.contextPath}/resources/icons/edit.png" class="small-icon"/></button>
            </p>
            <p>
            Student Mobile Number: <input type="text" pattern="[789]{1}[0-9]{9}" name="studentMobileNumber" value="${personalDetails.studentMobileNumber}" disabled/>
            <button class="editField" class="small-icon-wrapper"><img src="${pageContext.request.contextPath}/resources/icons/edit.png" class="small-icon"/></button>
            </p>
            <p>
            Guardian Mobile Number: <input type="text" pattern="[789]{1}[0-9]{9}" name="guardianMobileNumber" value="${personalDetails.guardianMobileNumber}" disabled/>
            <button class="editField" class="small-icon-wrapper"><img src="${pageContext.request.contextPath}/resources/icons/edit.png" class="small-icon"/></button>
            </p>
            <p>
            Email: <input type="email" name="email" value="${personalDetails.email}" disabled />
            <button class="editField" class="small-icon-wrapper"><img src="${pageContext.request.contextPath}/resources/icons/edit.png" class="small-icon"/></button>
            </p>
            <p>
            Date of Birth: <input type="date" name="dob" value="${personalDetails.dob}" disabled />
            <button class="editField" class="small-icon-wrapper"><img src="${pageContext.request.contextPath}/resources/icons/edit.png" class="small-icon"/></button>
            </p>
            <p>
            Place of Birth: <input type="text" name="placeOfBirth" value="${personalDetails.placeOfBirth}" disabled />
            <button class="editField" class="small-icon-wrapper"><img src="${pageContext.request.contextPath}/resources/icons/edit.png" class="small-icon"/></button>
            </p>
            <p>
                    Sex: <input type="radio" name="sex" value="M" disabled
	                    	<c:if test="${personalDetails.sex=='M'}">
								<c:out value="checked" />
							</c:if>
                    />Male
                         <input type="radio" name="sex" value="F" disabled
                         	<c:if test="${personalDetails.sex=='F'}">
                         		<c:out value="checked" />
                         	</c:if>
                         />Female
                 <button class="editField" class="small-icon-wrapper"><img src="${pageContext.request.contextPath}/resources/icons/edit.png" class="small-icon"/></button>
            </p>
            <p>
                    Category: <input type="radio" name="category" value="General" disabled
                    			<c:if test="${personalDetails.category == 'General' }">
                    				<c:out value="checked" />
                    			</c:if>
                    		  />General
                              <input type="radio" name="category" value="OBC" disabled
                              	<c:if test="${personalDetails.category == 'OBC' }">
                    				<c:out value="checked" />
                    			</c:if>
                              />OBC
                              <input type="radio" name="category" value="SC" disabled
                              	<c:if test="${personalDetails.category == 'SC' }">
                    				<c:out value="checked" />
                    			</c:if>
                              />SC
                              <input type="radio" name="category" value="ST" disabled
                              	<c:if test="${personalDetails.category == 'ST' }">
                    				<c:out value="checked" />
                    			</c:if>
                              />ST
                  <button class="editField" class="small-icon-wrapper"><img src="${pageContext.request.contextPath}/resources/icons/edit.png" class="small-icon"/></button>
            </p>
            <p>
                    Marrital Status: <select name="maritalStatus" disabled>
                                        <option value="Single"
                                        	<c:if test="${personalDetails.maritalStatus =='Single'}">
                                        		<c:out value="selected" />
                                        	</c:if>
                                        >Single</option>
                                        <option value="Maried" 
                                        	<c:if test="${personalDetails.maritalStatus =='Maried'}">
                                        		<c:out value="selected" />
                                        	</c:if>
                                        >Married</option>
                                     </select>
                     <button class="editField" class="small-icon-wrapper"><img src="${pageContext.request.contextPath}/resources/icons/edit.png" class="small-icon"/></button>
            </p>
            <p>Citizenship: <select name="citizenship" disabled>
                                             <option value="Indian"
                                             	<c:if test="${personalDetails.citizenship =='Indian'}">
                                        			<c:out value="selected" />
                                        		</c:if>
                                             >Indian</option>
                                             <option value="Foreigner"
                                             	<c:if test="${personalDetails.citizenship =='Foreigner'}">
                                        			<c:out value="selected" />
                                        		</c:if>
                                             >Foreigner</option>
                                        </select>
                          <button class="editField" class="small-icon-wrapper"><img src="${pageContext.request.contextPath}/resources/icons/edit.png" class="small-icon"/></button>
            </p>
            <p>
                <input type="submit" value="Submit" id="submit" disabled/>
            </p>
		</form>
	</div>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/updateDetails.js"></script>
</body>
</html>
