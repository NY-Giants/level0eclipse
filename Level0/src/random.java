import java.util.Random;

import javax.swing.JOptionPane;

public class random {
	public static void main(String[] args) {
int Rand=new Random().nextInt(100);
System.out.println(Rand);
	
if(Rand<33)
{
	JOptionPane.showMessageDialog( null,"low");

}	
else if(Rand<67)
{
	JOptionPane.showMessageDialog(null, "mid");
}
else if(Rand<100)
{
JOptionPane.showMessageDialog(null, "high");
}

	}
	}																																			
	

