<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>

	<head>
	    <meta charset="UTF-8">
	    <tiles:getAsString name="title"></tiles:getAsString>
	    
	    <link href="/css/customer/layout.css" type="text/css" rel="stylesheet" />
	    <style>
	    
	        #visual .content-container{	
	            height:inherit;
	            display:flex; 
	            align-items: center;
	            
	            background: url("../../images/customer/visual.png") no-repeat center;
	        }
	    </style>
	</head>
	
	<body>
	    <!-- header 부분 -->
		<tiles:insertAttribute name="header"/>
		
		<!-- visual 부분 -->
		<tiles:insertAttribute name="visual"/>
		
		<!-- body 부분 -->
		<div id="body">
			<div class="content-container clearfix">
			
				<!-- aside 부분 -->
				<tiles:insertAttribute name="aside"/>
				
				
				<!-- main 부분 -->
				<tiles:insertAttribute name="body"/>	
				
			</div>
		</div>
		
		<!-- footer 부분 -->
		<tiles:insertAttribute name="footer"/>
	</body>
    
</html>