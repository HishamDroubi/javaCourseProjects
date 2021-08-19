public static boolean wood(String s) {
		String x;
		boolean b = false;
		for (int i = 2; i <= s.length() / 2; i++) {
			if (s.length() % i == 0) {
				b = false;
				for (int j = 0; j < s.length() - i; j += i) {
					x = s.substring(j, j + i);
					if (x.compareTo(s.substring(j + i, j + i + i)) == 0 && (b || j == 0))
						b = true;
				}
			}
		}
		return b;
	}