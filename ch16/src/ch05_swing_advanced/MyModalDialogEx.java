package ch05_swing_advanced;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;
//���̾�α� 
public class MyModalDialogEx extends JFrame {
	private MyDialog2 dialog;
	//������
	public MyModalDialogEx() throws HeadlessException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn  = new JButton("Show Dialog");
		
		dialog = new MyDialog2(this, "Test Modal Dialog");
        
		//��ư�� �̺�Ʈ ó��
		btn.addActionListener(e-> {
			dialog.setVisible(true);
		    
			String text = dialog.getInput();
			if(text==null) return;
			//JButton btn2 = (JButton)e.getSource();
			btn.setText(text);
		});
		
		getContentPane().add(btn);
		setSize(250, 200);
		setVisible(true);
	}
      
	public static void main(String[] args) {
		 new MyModalDialogEx();
	}
}

class MyDialog2 extends JDialog{
	private JTextField tf = new JTextField(10);//���̰� 10�� ũ��
	private JButton okButton = new JButton("OK");
	
	public MyDialog2(Frame owner, String title) {
		super(owner, title);
		setLayout(new FlowLayout());
		add(tf);
		add(okButton);
		setSize(200, 100);
		
		//���̾�α��� ��ư�� �̺�Ʈ ó��
		okButton.addActionListener( e-> setVisible(false));
	}
	//�޼ҵ�
	public String getInput() {
		if(tf.getText().length()==0) return null;
		else return tf.getText();
	}
	
}