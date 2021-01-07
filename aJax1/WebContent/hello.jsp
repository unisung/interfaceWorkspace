<%@ page language="java" contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
      /* 자바코드영역 */
      request.setCharacterEncoding("utf-8");
     String name=request.getParameter("name");
%>
안녕하세요,<%=name%>회원님!