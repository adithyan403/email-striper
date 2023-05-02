import javax.swing.*;
import java.awt.*;
public class main extends JFrame{
	public main(){
		setTitle("Email Stripper");
		setSize(400,300);
		setLayout(new BorderLayout());
		JLabel label=new JLabel("Welcome \n Input the email in the text box");

		add(label,BorderLayout.NORTH);
		setVisible(true);

	}
	public static void main(String[] args) {
		new main();
	}


}
