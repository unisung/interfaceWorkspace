<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String[] titles = {
		 "서재응 완벽투구… 게레로 3구 삼진",
		 "리틀 감독 '서재응 12일부터 고정 선발'",
		 "박찬호 김선우 시범경기 등판 호투"
		 };
  for(int i=0;i<titles.length;i++){
%>
<%=titles[i]%><!-- 표현식expression --><br>
<%}%>