
public class CollatzovoZaporedje {

	public static void main(String[] args) {
		System.out.println(dolzina(60));
		System.out.println(najvecji(60));
		System.out.println(naslednji(60));
		zaporedje(60);
		
	}
	
	// pomozna funkcija, ki najde naslednjega vendar je nisem uporabil, drugace gre na mesto kjer se najde naslednji člen.
	public static int naslednji(int n) {
		if (n % 2 == 0) return n /= 2;
		return n * 3 + 1;
	}
	
	public static int dolzina(int n) {
		int stevec = 1;
		while (n > 1) {
			if (n % 2 == 0) n /= 2;
			else n = 3 * n + 1;
			stevec++;
		}
		return stevec;
	}
	
	public static int najvecji(int n) {
		int najvecji = n;
		while (n > 1) {
			if (n % 2 == 0) n /= 2;
			else n = 3 * n + 1;
			if (n > najvecji) najvecji = n;
		}
		return najvecji;
	}
	
	public static void zaporedje(int n) {
		System.out.print(n);
		while (n > 1) {
			if (n % 2 == 0) n /= 2;
			else n = 3 * n + 1;
			System.out.print(" " + n);
		}
	}
}
