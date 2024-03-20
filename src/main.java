import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.QUESTION_MESSAGE);
		/*while(true) {
		JOptionPane.showMessageDialog(null, "Your computer has a virus!!!", "title", JOptionPane.WARNING_MESSAGE);
		}*/
		//JOptionPane.showMessageDialog(null, "Call tech suport NOW OR ELSE", "title", JOptionPane.ERROR_MESSAGE);
        
		/*int answer = JOptionPane.showConfirmDialog(null, "bro, do you even code ?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
		String name = JOptionPane.showInputDialog("What is your name ?: ");
		System.out.println("Hello "+name);*/
		
		String[] response = {"No, you're awesome!", "thank you", "*blush*"};
		ImageIcon icon = new ImageIcon("asd.jpg");
		JOptionPane.showOptionDialog(null, "you are awesome !!!", "secret message", 1, JOptionPane.INFORMATION_MESSAGE, icon, response, 0);
	}

}
