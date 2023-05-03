import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
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
		button.addActionListener((e) -> {
			// Perform the action when the button is clicked
			try{
				String input=text.getText();
				System.out.println("Button clicked with input: "+input);
				String[] words=input.split("@");
				System.out.println(words[0]);
				System.out.println(words[1]);
				String s1=words[0];
				String s2=words[1];
				JOptionPane.showMessageDialog(null, "The first name  :"+s1+"\n"+"The Server used is :"+s2, "OUTPUT", JOptionPane.INFORMATION_MESSAGE);
			}
			catch(Exception e1){
				System.out.println("error");
				JOptionPane.showMessageDialog(null, "An error has occurred. Please enter the email correctly", "Error", JOptionPane.ERROR_MESSAGE);
			}
			
		});
		setVisible(true);

	}
	public static void main(String[] args) {
		new main();
	}


}
