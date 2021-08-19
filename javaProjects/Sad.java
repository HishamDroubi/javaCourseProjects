import java.util.*;
import javax.swing.JOptionPane;

public class Sad {

	public static void main(String[] args) {
		String r=  JOptionPane.showInputDialog("enter tour name");
		String z = JOptionPane.showInputDialog("Enter Number of Rounds");
		int n = z.charAt(0)-48;
		
		int c1 = 0, c2 = 0;
		String p1,p2;
		char a,b;
		Random play=new Random();
		int d;
		for (int i = 1; i <= n; i++) {
			p1 = JOptionPane.showInputDialog(" enter your choice");
			 a = p1.charAt(0);
			 d=1+play.nextInt(3);
			 if(d==0)
				 b='h';
			 else if(d==1)
				 b='w';
			 else
			 b='m';
				 
			 JOptionPane.showMessageDialog(null, "the computer choice is "+b);

			if (a == b)
				JOptionPane.showMessageDialog(null, "no winner");

			else if (a == 'w' && b == 'h' || a == 'h' && b == 'm' || a == 'm' && b == 'w') {
				JOptionPane.showMessageDialog(null, "the winner in this round is "+r);
				c1++;
			}

			else if (b == 'w' && a == 'h' || b == 'h' && a == 'm' || b == 'm' && a == 'w') {
				JOptionPane.showMessageDialog(null, "the winner in this round is the computer");
				c2++;
			}

			else {
				JOptionPane.showMessageDialog(null, "check your input");
				i--;
			}
		}
		if (c1 > c2)
			JOptionPane.showMessageDialog(null, "the winner in the game is "+r);

		if (c2 > c1)
			JOptionPane.showMessageDialog(null, "the winner in the game is the computer");

		else
			JOptionPane.showMessageDialog(null, "ther is no winner in this game");

	}

}
