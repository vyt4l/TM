import java.util.Random;

class ex00 {

	//utils
	public static int[] random_tab(int n) {
		int[] tab = new int[n];
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			tab[i] = r.nextInt(100);
		}
		return tab;
	}

	public static void display_tab(int[] tab, String str) {
		IO.print(str);
		for (int i = 0; i < tab.length; i++) {
			IO.print(tab[i]);
			if (i != tab.length - 1) IO.print(", ");
		}
		IO.println();
	}

	public static void swap(int[] tab, int i, int y) {
		int swap = tab[i];
		tab[i] = tab[y];
		tab[y] = swap;
	}

	public static int find_min(int[] tab, int sorted_index) {
		int min = sorted_index;
		sorted_index++;
		while (sorted_index < tab.length) {
			if (tab[sorted_index] < tab[min]) {
				min = sorted_index;
			}
			sorted_index++;
		}
		return (min);
	}

	//insertion
	public static void insert_min(int[] tab, int min_index, int sorted_index) {
		int min_elem = tab[min_index];

		for (int i = min_index; i > sorted_index; i--) {
			tab[i] = tab[i - 1];
		}
		tab[sorted_index] = min_elem;
	}

	public static void insert_sort(int[] tab) {
		int min_index;
		int sorted_index = 0;
		while (sorted_index != tab.length) {
			min_index = find_min(tab, sorted_index);
			insert_min(tab, min_index, sorted_index);
			sorted_index++;
		}
	}

	//bubble
	public static void bubble_sort(int[] tab) {
		boolean swaped = true;

		do {
			swaped = false;
			for (int i = 0; i < tab.length - 1; i++) {
				if (tab[i] > tab[i + 1]) {
					swap(tab, i, i + 1);
					swaped = true;
				}
			}
		} while (swaped);
	}

	public static void select_sort(int[] tab) {
		int sorted_index = 0;
		for (; sorted_index < tab.length; sorted_index++) {
			swap(tab, find_min(tab, sorted_index), sorted_index);
		}
	}

	//extra check
	public static boolean is_sorted(int[] tab) {
		for (int i = 0; i < tab.length - 1; i++) {
			if (tab[i] > tab[i + 1]) {
				return (false);
			}
		}
		return (true);
	}

	interface SortFunction {
		void sort(int[] tab);
	}

	public static boolean test_sort(SortFunction sort) {
		int[] tab = random_tab(10);
		display_tab(tab, "unsorted :");
		sort.sort(tab);
		display_tab(tab, "sorted :");
		IO.println();
		if (is_sorted(tab)) {
			IO.println("OK");
			return (true);
		} else {
			IO.println("KO");
			return (false);
		}
	}

	// alphabetic as agrument == crash flemme dapprendre try exept
	public static void main(String[] argv) {
		if (argv.length < 1) {
			System.exit(1);
		}
		for (int i = 0; i < Integer.parseInt(argv[0]); i++) {
			if (!test_sort(ex00::bubble_sort)) {
				System.exit(1);
			}
		}
		System.exit(0);
	}
}
