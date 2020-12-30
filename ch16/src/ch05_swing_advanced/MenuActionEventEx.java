package ch05_swing_advanced;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import ch05_swing_advanced.MenuActionEventEx.MenuActionListener;

//�޴��� �����
public class MenuActionEventEx extends JFrame{
	//�� �̹��� ���̺� ����
	 private JLabel imageLabel = new JLabel();
	 
	public MenuActionEventEx() throws HeadlessException {
		setTitle("Menu�� Action ������ �����");
		createMenu();//�޴�����, ������ �߰�
		//�����̳� ���
		getContentPane().add(imageLabel, BorderLayout.CENTER);//ȭ�� �߾ӿ� �̹��� �� ��ġ
		
		setSize(new Dimension(250, 200));
		setVisible(true);
	}
	//�޴����� �޼ҵ�
	private void createMenu() {
		//�޴��� ���� ����
      JMenuBar mb = new JMenuBar();
      //�޴� ������ �迭
      JMenuItem[] menuItem = new JMenuItem[4];
      String[] itemTitle = {"Load","Hide","ReShow","Exit"};
      
      //�޴�����
      JMenu ScreenMenu = new JMenu("Screen");
      //������ ����
      MenuActionListener listener = new MenuActionListener();
      for(int i=0;i<menuItem.length;i++) {
    	   menuItem[i] = new JMenuItem(itemTitle[i]);
    	   menuItem[i].addActionListener(listener);//������ ����
    	   ScreenMenu.add( menuItem[i]);
      }
      JMenu EditMenu = new JMenu("Edit");       JMenu SouceMenu = new JMenu("Source"); JMenu ProjectMenu = new JMenu("Project");
      JMenu RunMenu = new JMenu("Run");
      
      //�޴��ٿ� �޴� �߰�
      mb.add(ScreenMenu);      mb.add(EditMenu);      mb.add(SouceMenu);      mb.add(ProjectMenu);      mb.add(RunMenu);
      
      //�޴��ٸ� Frame�� ����
      setJMenuBar(mb);
	}
	//�޴��̺�Ʈ ó�� ������
	public class MenuActionListener  implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();//�̺�Ʈ �߻��� ��ü�� ���ڿ� ���
            switch(cmd) {
            case "Load": 
            	                if(imageLabel.getIcon()!=null) return;//�̹� �ε��Ǿ����� ����
            	                imageLabel.setIcon(new ImageIcon("E:\\Users\\Administrator\\git\\interfaceWorkspace\\ch16\\src\\images\\img.jpg"));
            	                break;
            case "Hide":  imageLabel.setVisible(false);
                                break;
            case "ReShow":
            	                  imageLabel.setVisible(true);
            	                break;
            case "Exit": System.exit(0);//������ ���� ���α׷� ���� ����
                               break;
            }
		}
	}	
	
	public static void main(String[] args) {
	 new MenuActionEventEx();
	}
}
