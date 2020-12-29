package ch01_rpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class CalcClientEx {
	public static void main(String[] args) {
	//스트림 객체 선언
		BufferedReader in=null;
		BufferedWriter out=null;
		//클라이언트 소켓 선언
		Socket socket=null;
		//스캐너 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		try {
			     //클라이언트 소켓 생성
			socket = new Socket("localhost",9988);
			//스트림 객체 생성
			in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			//연산 입출력 처리
			while(true) {
				 System.out.println("계산식(빈칸으로 띄어 입력,예:24 + 42)>>");//프롬프트
				 //키보드로부터 수식 읽기
				 String outputMessage = scanner.nextLine();//한 줄 단위로 읽기 - nextLine()은 읽은 문자열에서 '\r\n'을 제거 후 리턴
				 //종료 여부확인
				 if(outputMessage.equalsIgnoreCase("bye")) {//bye전송
					  out.write(outputMessage+"\n");// 한줄 단위로 전송 "\n" 추가
					  //buffered스트림의 메모리 내용 비우기
					  out.flush();
					  //클라이언트 자신 종료 처리
					  break;
				 }
				 //종료메세지가 아닌 경우
				 out.write(outputMessage+"\n");//한 줄 단위로 전송 "\n"
				 //밀어내기
				 out.flush();
				 //결과받기
				 String inputMessage = in.readLine();//한 줄 단위로 읽기 readLine()
				 //연산결과 출력하기
				 System.out.println("계산 결과: "+inputMessage);
			}
		}catch(Exception e) {
			 System.out.println(e.getMessage());
		}finally {
			 try {
				  scanner.close();
				  if(socket!=null) socket.close();//클라이언트 소켓 닫기
			 }catch(Exception e) {
				 System.out.println("오류발생");
			 }
		}

	}
}
