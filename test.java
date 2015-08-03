import java.util.Random;

import javax.swing.JOptionPane;


public class test {
public static void main(String[] args)
{
	for(int i = 0; i<=100; i++){
int randy = new Random().nextInt(1000);
System.out.println(randy);
if(randy %2 == 0){
JOptionPane.showMessageDialog(null,"yes");
}
else{ 
	JOptionPane.showMessageDialog(null, "no");
}
	}
}
}
