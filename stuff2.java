import java.util.Random;

import javax.swing.JOptionPane;

public class stuff2 {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	int random = new Random().nextInt(4);
	System.out.println(random);
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
String user = JOptionPane.showInputDialog("ask a question for the magic eight ball");
	// 3. Print out this variable
if (random== 0){
	System.out.println("yes");
}
if (random== 1){
	System.out.println("no");
}
if (random== 2){
	System.out.println("ask google");
}
if (random== 3){
	System.out.println("yes, BARNEY has landed, run for your friekin lives");
}
	// 4. Get the user to enter a question for the 8 ball

	// 5. If the random number is 0

	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer

}
}

