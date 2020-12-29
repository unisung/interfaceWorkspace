package ch01_rpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

//연산 처리 서버
public class CalcServerEx {
	public static void main(String[] args) {
	 //입/출력 스트림 객체 생성
		BufferedReader in=null;
		BufferedWriter out =null;
		//서버소켓 객체 생성
		ServerSocket listener=null;
		//통신용 소켓 객체 생성
		Socket socket=null;
		
		try {
			      //서버소켓 생성
			  listener = new ServerSocket(9988);//ServetSocket(포트번호)
			  System.out.println("연결을 기다리고 있습니다.");
			  //클라이언트 접속시 소켓 생성
			  socket = listener.accept();
			  System.out.println("연결되었습니다.");
			  //입/출력 스트림 생성
			  in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			  out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			  //데이타 입/출력 처리
			  while(true) {
				  //입력데이타를 라인단위로 읽기
				   String inputMessage = in.readLine();
				   //종료 신호가 오면 종료 처리
				   if(inputMessage.equalsIgnoreCase("bye")) {
					   System.out.println("클라이언트에서 연결을 종료하였습니다.");
					   break;//반복문을 벗어남 - 종료
				   }
				   //정상처리
				   System.out.println(inputMessage);//화면에 메세지 출력
				   
				   //연산처리- 연산처리 메소드 호출
				   String res=calc(inputMessage);
				   
				   //output스트림으로 전달 처리
				   out.write(res+"\n");//결과를 한줄 단위로 전송처리
				   //Buffered스트림의 메모리내용 밀어내기 처리 
				   out.flush();
			  }
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				    if(socket !=null) socket.close();//통신소켓 닫기
				    if(listener !=null) listener.close();//서버 소켓 닫기
			}catch(Exception e) {
				System.out.println("오류발생");
			}
		}
		

	}
//연산처리 procedure
	private static String calc(String inputMessage) {
		System.out.println("수식:"+inputMessage);
	    //입력받은 문자열에서 피연산자와 연산자 분리 처리
		StringTokenizer st = new StringTokenizer(inputMessage," ");//StringTokenizer(분리할 문자열,분리에 사용될 구분자)
		//피연산자와 연산자의 갯수가 모두 3개가 아니면 연산불가로 오류 출력
		if(st.countTokens()!=3) return "error";
		//연산결과 처리 메세지 
		String res="";
		//첫번째 피연산자
		int op1 = Integer.parseInt(st.nextToken());//StringTokenizer에서 첫번째 토큰 추출
		//연산자 
		String opcode = st.nextToken();
		//두번째 피 연산자
		int op2 = Integer.parseInt(st.nextToken());
		//연산자에 따라 연산처리
		switch(opcode) {//1.7 이후 switch(문자열) 가능
		case "+": res=Integer.toString(op1+op2);
			            break;
		case "-":  res=Integer.toString(op1-op2); 
			           break;
		case "*": res=Integer.toString(op1*op2); 
			          break;
		default: res="error";
		
		}
		//결과 리턴
		return res;
	}

}
