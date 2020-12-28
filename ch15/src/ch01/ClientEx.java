package ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {
	public static void main(String[] args) {
		//���ڴ��� ����� ��Ʈ��
		  BufferedReader in=null;
		  BufferedWriter out=null;
		  Socket socket=null;//����
		  Scanner scanner = new Scanner(System.in);
		  try {
			  //���α׷� �����ϸ� socket�����Ǹ鼭 ����
			    socket=new Socket("127.0.0.1",9111);
			    //��ŵ���Ÿ �̵� ��� ���� 
	 in =new BufferedReader(new InputStreamReader(socket.getInputStream()));//�ܹ��� �Է½�Ʈ��
	out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));//�ܹ��� ��½�Ʈ��  
	 // ����Ÿ ���� ���ѹݺ�
    while(true) {
     System.out.print("������>>");//������Ʈ
     String outputMessage = scanner.nextLine();//Ű���忡�� �� �྿ �б�-nextLine()�Լ� - �Է¹��ڿ� "\r\n"���ŵ�.
     	  
  	  if(outputMessage.equalsIgnoreCase("bye")) {
  		  out.write(outputMessage+"\n");//�� �� ������ ���ڿ� ����-���ٴ��� ������ "\n"�߰�
  		  //buffer���� �о��
  		  out.flush();/////// "bye" ���� ��
  		  break;//��������, ����
  	  }
  	  //������
  	 out.write(outputMessage+"\n");//�� �� ������ ���ڿ� ����-���ٴ��� ������ "\n"�߰�
	  //buffer���� �о��
	  out.flush();/////// 
	  //�б�
	  String inputMessage = in.readLine();//Ŭ���̾�Ʈ�� ���� ���δ����� �б�
  	  System.out.println("Ŭ���̾�Ʈ:"+inputMessage);//����Ϳ� �޼��� ���
    }
		  }catch(Exception e) {
			  System.out.println(e.getMessage());
		  }finally {
			  try {
				  scanner.close(); socket.close(); 
			  }catch(Exception e) {System.out.println("�����߻�");}
		  }

	}

}
