package ch01_rpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

//���� ó�� ����
public class CalcServerEx {
	public static void main(String[] args) {
	 //��/��� ��Ʈ�� ��ü ����
		BufferedReader in=null;
		BufferedWriter out =null;
		//�������� ��ü ����
		ServerSocket listener=null;
		//��ſ� ���� ��ü ����
		Socket socket=null;
		
		try {
			      //�������� ����
			  listener = new ServerSocket(9988);//ServetSocket(��Ʈ��ȣ)
			  System.out.println("������ ��ٸ��� �ֽ��ϴ�.");
			  //Ŭ���̾�Ʈ ���ӽ� ���� ����
			  socket = listener.accept();
			  System.out.println("����Ǿ����ϴ�.");
			  //��/��� ��Ʈ�� ����
			  in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			  out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			  //����Ÿ ��/��� ó��
			  while(true) {
				  //�Էµ���Ÿ�� ���δ����� �б�
				   String inputMessage = in.readLine();
				   //���� ��ȣ�� ���� ���� ó��
				   if(inputMessage.equalsIgnoreCase("bye")) {
					   System.out.println("Ŭ���̾�Ʈ���� ������ �����Ͽ����ϴ�.");
					   break;//�ݺ����� ��� - ����
				   }
				   //����ó��
				   System.out.println(inputMessage);//ȭ�鿡 �޼��� ���
				   
				   //����ó��- ����ó�� �޼ҵ� ȣ��
				   String res=calc(inputMessage);
				   
				   //output��Ʈ������ ���� ó��
				   out.write(res+"\n");//����� ���� ������ ����ó��
				   //Buffered��Ʈ���� �޸𸮳��� �о�� ó�� 
				   out.flush();
			  }
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				    if(socket !=null) socket.close();//��ż��� �ݱ�
				    if(listener !=null) listener.close();//���� ���� �ݱ�
			}catch(Exception e) {
				System.out.println("�����߻�");
			}
		}
		

	}
//����ó�� procedure
	private static String calc(String inputMessage) {
		System.out.println("����:"+inputMessage);
	    //�Է¹��� ���ڿ����� �ǿ����ڿ� ������ �и� ó��
		StringTokenizer st = new StringTokenizer(inputMessage," ");//StringTokenizer(�и��� ���ڿ�,�и��� ���� ������)
		//�ǿ����ڿ� �������� ������ ��� 3���� �ƴϸ� ����Ұ��� ���� ���
		if(st.countTokens()!=3) return "error";
		//������ ó�� �޼��� 
		String res="";
		//ù��° �ǿ�����
		int op1 = Integer.parseInt(st.nextToken());//StringTokenizer���� ù��° ��ū ����
		//������ 
		String opcode = st.nextToken();
		//�ι�° �� ������
		int op2 = Integer.parseInt(st.nextToken());
		//�����ڿ� ���� ����ó��
		switch(opcode) {//1.7 ���� switch(���ڿ�) ����
		case "+": res=Integer.toString(op1+op2);
			            break;
		case "-":  res=Integer.toString(op1-op2); 
			           break;
		case "*": res=Integer.toString(op1*op2); 
			          break;
		default: res="error";
		
		}
		//��� ����
		return res;
	}

}
