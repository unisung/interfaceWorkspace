package ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//����
public class ServerEx {
	public static void main(String[] args) {
		//���ڴ��� ����� ��Ʈ��
	  BufferedReader in=null;
	  BufferedWriter out=null;
	  ServerSocket listener=null;//��������
	  Socket socket=null;//����
	  Scanner scanner = new Scanner(System.in);
	  
	  try {
		      listener = new ServerSocket(9111);//��Ʈ��ȣ�� �������� ����
		      System.out.println("������ ��ٸ��� �ֽ��ϴ�.");
		      socket=listener.accept();//Ŭ���̾�Ʈ�κ��� ���� ��û ���
		      System.out.println("������ �Ǿ����ϴ�.");
		      //��ŵ���Ÿ �̵� ��� ���� 
		      in =new BufferedReader(new InputStreamReader(socket.getInputStream()));//�ܹ��� �Է½�Ʈ��
		      out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));//�ܹ��� ��½�Ʈ��
		      // ����Ÿ ���� ���ѹݺ�
		      while(true) {
		    	  String inputMessage = in.readLine();//Ŭ���̾�Ʈ�� ���� ���δ����� �б�
		    	  if(inputMessage.equalsIgnoreCase("bye")) {
		    		  System.out.println("Ŭ���̾�Ʈ���� bye�� ������ �����Ͽ����ϴ�.");
		    		  break;//��������
		    	  }
		    	  System.out.println("Ŭ���̾�Ʈ:"+inputMessage);//����Ϳ� �޼��� ���
		    	  System.out.print("������>>");//������Ʈ
		    	  String outputMessage = scanner.nextLine();//Ű���忡�� �� �྿ �б�-nextLine()�Լ� - �Է¹��ڿ� "\r\n"���ŵ�.
		    	  //������
		    	  out.write(outputMessage+"\n");//�� �� ������ ���ڿ� ����-���ٴ��� ������ "\n"�߰�
		    	  //buffer���� �о��
		    	  out.flush();/////// 
		      }
		  
	  }catch(Exception e) {
		   System.out.println(e.getMessage());
	  }finally {
		  try {
			   scanner.close(); socket.close(); listener.close();
	  }catch(Exception e) {System.out.println("�����߻�");}
	  }
	  
		
	}

}
