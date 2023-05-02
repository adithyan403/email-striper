import javax.swing.*;
import java.awt.*;
public class main extends JFrame{
	public main(){
		setTitle("Email Stripper");
		setSize(400,300);
		setLayout(new BorderLayout());
		JLabel label=new JLabel("            Welcome \n Input the email in the text box");

		add(label,BorderLayout.NORTH);
		JButton button=new JButton("Click TO Convert");
		add(button,BorderLayout.SOUTH);
		JTextField text=new JTextField(5);
		add(text);
		text.setPreferredSize(new Dimension(200, 30));
		text.setBackground(Color.blue);
		setVisible(true);

	}
	public static void main(String[] args) {
		new main();
	}


}
