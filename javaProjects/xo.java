import java.util.Scanner;

public class cvb2 {

	public static void main(String[] args) {
		char[][] map = new char[][] { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' } };
		int i;
		for (i = 1; i <= 9; i++) {
			print(map);
			play(map, i);
			if (check(map)) {
				print(map);
				if (i % 2 == 1)
					System.out.println("player 1 win");
				else
					System.out.println("player 2 win");
				break;
			}
		}
		if (i == 10)
			System.out.println("draw");
	}

	public static void play(char[][] map, int i) {
		char h;
		if (i % 2 != 0) {
			System.out.println("player 1 turn");
			h = 'x';
		} else {
			System.out.println("player 2 turn");
			h = 'o';
		}

		Scanner in = new Scanner(System.in);
		boolean b ;
		int counter = 0;
		int r, c;
		do {
			b=false;
			if (counter > 0&&b)
				System.out.println("illegal play ...enter again");
			System.out.println("enter row");
			r = in.nextInt();
			System.out.println("enter colum");
			c = in.nextInt();
			if (r < 1 || r > 3 || c < 1 || c > 3 || map[r - 1][c - 1] == 'o' || map[r - 1][c - 1] == 'x')
				b = true;
			counter++;
		} while (b);
		map[r - 1][c - 1] = h;

	}

	public static void print(char[][] map) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++)
				System.out.print(map[i][j] + " ");
			System.out.println();
		}
	}

	public static boolean check(char[][] map) {
		boolean b = true;
		for (int i = 0; i < 3; i++)
			for (int j = 0; j <2; j++)
				if (map[i][j] != map[i][j + 1] && (map[i][j] == 'x' || map[i][j] == 'o'))
					b = false;
		if (b)
			return b;
		b = true;
		for (int i = 0; i <2; i++)
			for (int j = 0; j < 3; j++)
				if (map[i][j] != map[i + 1][j] && (map[i][j] == 'x' || map[i][j] == 'o'))
					b = false;
		if (b)
			return b;
		b = true;
		for (int i = 0; i <2; i++)
			if (map[i][i] != map[i + 1][i + 1] && (map[i][i] == 'x' || map[i][i] == 'o'))
				b = false;
		if (b)
			return b;
		b = true;
		for (int i = 0; i < 2; i++)
			if (map[i][i] != map[i][map.length - i - 1] && (map[i][i] == 'x' || map[i][i] == 'o'))
				b = false;

		return b;

	}

}