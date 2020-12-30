package ch05_swing_advanced;

import java.awt.Dimension;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

//�޴��� �����
public class MenuEx extends JFrame{
	public MenuEx() throws HeadlessException {
		setTitle("Menu �����");
		createMenu();//�޴�����, ������ �߰�
		
		setSize(new Dimension(250, 200));
		setVisible(true);
	}
	//�޴����� �޼ҵ�
	private void createMenu() {
		//�޴��� ���� ����
      JMenuBar mb = new JMenuBar();
      //�޴�����
      JMenu ScreenMenu = new JMenu("Screen");
      JMenu EditMenu = new JMenu("Edit");
      JMenu SouceMenu = new JMenu("Source");
      JMenu ProjectMenu = new JMenu("Project");
      JMenu RunMenu = new JMenu("Run");
      
      //menu�� item�߰�
      ScreenMenu.add(new JMenuItem("Load"));
      ScreenMenu.addSeparator();//�޴������� ���м�
      ScreenMenu.add(new JMenuItem("Hide"));
      ScreenMenu.add(new JMenuItem("ReShow"));
      ScreenMenu.addSeparator();
      ScreenMenu.add(new JMenuItem("Exit"));
      
      //�޴��ٿ� �޴� �߰�
      mb.add(ScreenMenu);
      mb.add(EditMenu);
      mb.add(SouceMenu);
      mb.add(ProjectMenu);
      mb.add(RunMenu);
      
      //�޴��ٸ� Frame�� ����
      setJMenuBar(mb);
		
	}
	public static void main(String[] args) {
	 new MenuEx();
	}
}
