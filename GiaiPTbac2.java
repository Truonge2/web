package thucHanhTuan2;

import java.awt.BorderLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GiaiPTbac2 extends JFrame{
	
	
	private JPanel left;
	private JTextField leftTextField;
	private JPanel right;
	private JButton bXoaTrang;
	private JButton bTim;
	private JButton bThem;
	private JButton bXoa;
	private JButton bLuu;

	public GiaiPTbac2( ) {
		//tao frame
		setTitle("Giai Phuong trinh bac 2");
		setSize(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		left= new JPanel();
		left.add(new Label("Nhap ma so can tim:"));
		left.add(leftTextField = new JTextField(10));
		left.add(bTim = new JButton("Tim"));
		right= new JPanel();
		right.add(bThem= new JButton("Them"));
		right.add(bXoaTrang= new JButton("XoaTrang"));
		right.add(bXoa= new JButton("Xoa"));
		right.add(bLuu= new JButton("Luu"));
		JSplitPane splitPane= new JSplitPane(SwingConstants.VERTICAL,left,right);
		splitPane.setOrientation(SwingConstants.VERTICAL);
		add(splitPane,BorderLayout.NORTH);
		
		
	}
	
	public static void main(String arg[]) {
		new GiaiPTbac2().setVisible(true);
	}

}
