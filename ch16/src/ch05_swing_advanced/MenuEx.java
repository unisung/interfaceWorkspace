package ch05_swing_advanced;

import java.awt.Dimension;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

//메뉴바 만들기
public class MenuEx extends JFrame{
	public MenuEx() throws HeadlessException {
		setTitle("Menu 만들기");
		createMenu();//메뉴생성, 프레임 추가
		
		setSize(new Dimension(250, 200));
		setVisible(true);
	}
	//메뉴생성 메소드
	private void createMenu() {
		//메뉴바 영역 생성
      JMenuBar mb = new JMenuBar();
      //메뉴생성
      JMenu ScreenMenu = new JMenu("Screen");
      JMenu EditMenu = new JMenu("Edit");
      JMenu SouceMenu = new JMenu("Source");
      JMenu ProjectMenu = new JMenu("Project");
      JMenu RunMenu = new JMenu("Run");
      
      //menu에 item추가
      ScreenMenu.add(new JMenuItem("Load"));
      ScreenMenu.addSeparator();//메뉴아이템 구분선
      ScreenMenu.add(new JMenuItem("Hide"));
      ScreenMenu.add(new JMenuItem("ReShow"));
      ScreenMenu.addSeparator();
      ScreenMenu.add(new JMenuItem("Exit"));
      
      //메뉴바에 메뉴 추가
      mb.add(ScreenMenu);
      mb.add(EditMenu);
      mb.add(SouceMenu);
      mb.add(ProjectMenu);
      mb.add(RunMenu);
      
      //메뉴바를 Frame에 부착
      setJMenuBar(mb);
		
	}
	public static void main(String[] args) {
	 new MenuEx();
	}
}
