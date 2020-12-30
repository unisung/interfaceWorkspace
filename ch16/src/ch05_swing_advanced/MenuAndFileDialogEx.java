package ch05_swing_advanced;

import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MenuAndFileDialogEx extends JFrame {
  private JLabel imageLabel = new JLabel();
  
	public MenuAndFileDialogEx() throws HeadlessException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.add(imageLabel);
		createMenu();
		setSize(350,200);
		setVisible(true);
}
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem openItem = new JMenuItem("Open");
		
		//이벤트 리스너 추가
		openItem.addActionListener(new OpenActionListener());
		//메뉴바 붙이기
		fileMenu.add(openItem);
		mb.add(fileMenu);
		setJMenuBar(mb);
	}

class OpenActionListener implements ActionListener{
	//파일 탐색기 객체
	private JFileChooser chooser;
	//생성자	
	public OpenActionListener() {     chooser = new JFileChooser(); }
	@Override
	public void actionPerformed(ActionEvent e) {
	 //확장자 필터추가
		FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg","gif");
	  chooser.setFileFilter(filter);
		
	  int ret = chooser.showOpenDialog(null);
	  if(ret!=JFileChooser.APPROVE_OPTION) {
		  JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다.","경고",JOptionPane.WARNING_MESSAGE);
		  return;
	  }
	  
	  String filePath=chooser.getSelectedFile().getPath();
	  imageLabel.setIcon(new ImageIcon(filePath));
	  pack();//이미지크기에 맞춰 프레임을 조절
	}
}
 public static void main(String[] args) {	new MenuAndFileDialogEx(); }
}
