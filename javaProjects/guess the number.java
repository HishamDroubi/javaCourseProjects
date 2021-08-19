import java.util.*;
import javax.swing.JOptionPane;

public class cx {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "hello and welcome to my number guessing game.");
		String s = JOptionPane.showInputDialog(null, "pick a number to bulid the range");
		int range = Integer.parseInt(s);
		Random play = new Random();
		int t = 2 + play.nextInt(range - 3);
		String input;
		int c = 0;
		boolean b = true;
		do {
			c++;
			input = JOptionPane.showInputDialog(null, "guess a number between 1 and" + range);
			int d = Integer.parseUnsignedInt(input);
			if (d < t)
				if ((t - d) >= 10)
					JOptionPane.showMessageDialog(null, " number is too low,try again");
				else
					JOptionPane.showMessageDialog(null, "nuber is low,try again");
			else if (d > t)
				if ((d - t) >= 10)
					JOptionPane.showMessageDialog(null, " number is too high,try again");
				else
					JOptionPane.showMessageDialog(null, "nuber is high,try again");
			else {
				b = false;
				break;

			}

		} while (b);
		JOptionPane.showMessageDialog(null, " you win!it took you" + c + "tries");

	}

}