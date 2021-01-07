/**
 * 
 */
var httpRequest = null;
//MLHttpRequest객체 생성 함수
function getMLHttpRequest()
{
	if(window.ActiveXObject)
	{
		return new ActiveXObject("Msxml2.XMLHTTP");
	}
	else if(window.XMLHttpRequest)
	{
		return new XMLHttpRequest();
	}
	else
	{
		return null;
	}
}
//send함수
function sendRequest(url,params,callback,method)
{
	//XMLHttpRequest객체 생성
	httpRequest = getMLHttpRequest();
	//전송방식 설정
	//javascript의 문자열의 true/false 여부 - '값'이 있으면 true, "값이 없으면 false, -객체기반",'값'-객체 존재
	var httpMethod = method? method:'get';//값이 있으면 true->'get'/'post'중에 하나 선택, 아니면 기본값 'get'선택
	if(httpMethod!= 'get' && httpMethod!='POST')httpMethod = 'get';
	var httpParams = (params == null || params == '')?null:params;//파라미터가 있으면 파라미터, 없으면 null을 httpParams로 넘김
	var httpUrl = url;
	//전송방식이 'get'방식이면서, 파라미터가 있는 경우
	if(httpMethod =='get' && httpParams!=null)
	{
		httpUrl = httpUrl + "?" + httpParams;
	}
	//연결 설정
	httpRequest.open(httpMethod, httpUrl, true);//open(요청방식,요청경로,비동기여부)
	//head설정
	httpRequest.setRequestHeader('Content-Type','application/x-www-form-urlencoded');
	//상태값 체크 속성에 callback처리
	httpRequest.onreadystatechange = callback;
	//요청처리
	httpRequest.send(httpMethod == 'post' ? httpParams:null);//전송방식이 'post'이면 body에 파라미터 전송, 'get'이면 null처리
}