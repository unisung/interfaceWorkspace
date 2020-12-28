package ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//서버
public class ServerEx {
	public static void main(String[] args) {
		//문자단위 입출력 스트림
	  BufferedReader in=null;
	  BufferedWriter out=null;
	  ServerSocket listener=null;//서버소켓
	  Socket socket=null;//소켓
	  Scanner scanner = new Scanner(System.in);
	  
	  try {
		      listener = new ServerSocket(9111);//포트번호로 서버소켓 생성
		      System.out.println("연결을 기다리고 있습니다.");
		      socket=listener.accept();//클라이언트로부터 연결 요청 대기
		      System.out.println("연결이 되었습니다.");
		      //통신데이타 이동 통로 생성 
		      in =new BufferedReader(new InputStreamReader(socket.getInputStream()));//단방향 입력스트림
		      out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));//단방향 출력스트림
		      // 데이타 전달 무한반복
		      while(true) {
		    	  String inputMessage = in.readLine();//클라이언트로 부터 라인단위로 읽기
		    	  if(inputMessage.equalsIgnoreCase("bye")) {
		    		  System.out.println("클라이언트에서 bye로 연결을 종료하였습니다.");
		    		  break;//연결종료
		    	  }
		    	  System.out.println("클라이언트:"+inputMessage);//모니터에 메세지 출력
		    	  System.out.print("보내기>>");//프롬프트
		    	  String outputMessage = scanner.nextLine();//키보드에서 한 행씩 읽기-nextLine()함수 - 입력문자열 "\r\n"제거됨.
		    	  //보내기
		    	  out.write(outputMessage+"\n");//한 줄 단위로 문자열 전달-한줄단위 구분자 "\n"추가
		    	  //buffer내용 밀어내기
		    	  out.flush();/////// 
		      }
		  
	  }catch(Exception e) {
		   System.out.println(e.getMessage());
	  }finally {
		  try {
			   scanner.close(); socket.close(); listener.close();
	  }catch(Exception e) {System.out.println("오류발생");}
	  }
	  
		
	}

}
