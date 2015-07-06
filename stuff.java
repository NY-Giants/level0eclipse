import javax.swing.JOptionPane;

public class stuff {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String user=JOptionPane.showInputDialog("Can you code?");
if (user.equals( "yes") ){
	JOptionPane.showMessageDialog(null, "You will rule ze world");
}	// 2. If they say "yes", tell them they will rule the world.
else{
		JOptionPane.showMessageDialog(null, "Then good luck washing"
				+ " dishes for me. Plus you will fail at school and have to pay me a billion dollars for employment."
				+ " Bwa ha ha ha ha. LOL :o. Message send failure. I dont no why I keep typing this crazy stuff");
}
		// 3. Otherwise, wish them good luck washing dishes.

	}
}



