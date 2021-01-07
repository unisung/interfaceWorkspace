<%@ page import = "java.util.ArrayList" %>
<%@ page import = "java.util.List" %>
<%@ page import = "java.util.Collections" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
	String[] keywords = {"AJAX","AJAX 실전 프로그래밍","자바","자바 프로그래밍",
			"자바서버 페이지","자바스터디","자바서비스","자바캔"};
	public List<String> search(String keyword)
	{
		List<String> result = new ArrayList<String>();
		keyword = keyword.toUpperCase();//대문자로 변경
		
		//빈 문자열이 쿼리스트링 파라미터로 넘어오면 -빈객체 리턴
		if(keyword == null || keyword.equals("")){
			return Collections.EMPTY_LIST;
		}
		//쿼리스트링 파라미터로 넘어온 값으로 시작되는 키워드를 추출하여 클라이언트로 출력
		for(int i = 0; i < keywords.length; i++)
		{
			if(keywords[i].startsWith(keyword))//startsWith(해당문장)으로 시작되면.
			{
				result.add(keywords[i]);
			}
		}
		return result;
	}
%>
<%
	request.setCharacterEncoding("utf-8");
	String keyword = request.getParameter("keyword");
	List<String> keywordList = search(keyword);
	
	out.print(keywordList.size());
	out.print("|");
	for(int i = 0; i < keywordList.size(); i++)
	{
		String key = (String) keywordList.get(i);
		out.print(key);
		if(i<keywordList.size()-1)
			out.print(",");
	}
%>
</body>
</html>