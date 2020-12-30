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

//메뉴바 만들기
public class MenuActionEventEx extends JFrame{
	//빈 이미지 레이블 선언
	 private JLabel imageLabel = new JLabel();
	 
	public MenuActionEventEx() throws HeadlessException {
		setTitle("Menu에 Action 리스너 만들기");
		createMenu();//메뉴생성, 프레임 추가
		//컨테이너 얻기
		getContentPane().add(imageLabel, BorderLayout.CENTER);//화면 중앙에 이미지 라벨 배치
		
		setSize(new Dimension(250, 200));
		setVisible(true);
	}
	//메뉴생성 메소드
	private void createMenu() {
		//메뉴바 영역 생성
      JMenuBar mb = new JMenuBar();
      //메뉴 아이템 배열
      JMenuItem[] menuItem = new JMenuItem[4];
      String[] itemTitle = {"Load","Hide","ReShow","Exit"};
      
      //메뉴생성
      JMenu ScreenMenu = new JMenu("Screen");
      //리스너 생성
      MenuActionListener listener = new MenuActionListener();
      for(int i=0;i<menuItem.length;i++) {
    	   menuItem[i] = new JMenuItem(itemTitle[i]);
    	   menuItem[i].addActionListener(listener);//리스너 부착
    	   ScreenMenu.add( menuItem[i]);
      }
      JMenu EditMenu = new JMenu("Edit");       JMenu SouceMenu = new JMenu("Source"); JMenu ProjectMenu = new JMenu("Project");
      JMenu RunMenu = new JMenu("Run");
      
      //메뉴바에 메뉴 추가
      mb.add(ScreenMenu);      mb.add(EditMenu);      mb.add(SouceMenu);      mb.add(ProjectMenu);      mb.add(RunMenu);
      
      //메뉴바를 Frame에 부착
      setJMenuBar(mb);
	}
	//메뉴이벤트 처리 리스너
	public class MenuActionListener  implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();//이벤트 발생한 객체의 문자열 얻기
            switch(cmd) {
            case "Load": 
            	                if(imageLabel.getIcon()!=null) return;//이미 로딩되었으면 리턴
            	                imageLabel.setIcon(new ImageIcon("E:\\Users\\Administrator\\git\\interfaceWorkspace\\ch16\\src\\images\\img.jpg"));
            	                break;
            case "Hide":  imageLabel.setVisible(false);
                                break;
            case "ReShow":
            	                  imageLabel.setVisible(true);
            	                break;
            case "Exit": System.exit(0);//로직에 의한 프로그램 정상 종료
                               break;
            }
		}
	}	
	
	public static void main(String[] args) {
	 new MenuActionEventEx();
	}
}
