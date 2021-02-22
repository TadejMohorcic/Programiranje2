
public class OdvodPolinoma {

	public static void main(String[] args) {
		double[] P1 = {1, 2, 3};
		double[] P2 = {4, -1, 2, 0, 1};
		double[] P3 = {1};
		double[] OP1 = odvod(P1, 1);
		double[] OP2 = odvod(P2, 2);
		double[] OP3 = odvod(P3, 1);
		izpis_polinoma(OP1);
		izpis_polinoma(OP2);
		izpis_polinoma(OP3);

	}
	
	public static double[] odvod(double[] p, int n) {
		if (n >= p.length) return new double[0];
		double[] op = new double[p.length - n];
		int f = 1;
		for (int i = 2; i <= n; i++) f *= i;
		for (int i = n; i < p.length; i++) {
			op[i - n] = f * p[i];
			f /= i - n + 1;
			f *= i + 1; 
		}
		return op;
	}
	
	public static double[] odvod(double[] p) {
		return odvod(p, 1);
	}
	
	public static void izpis_polinoma(double[] p) {
		System.out.print('{');
		for (int i = 0; i < p.length; i++) {
			if (i > 0) System.out.print(", ");
			System.out.print(p[i]);
		}
		System.out.print('}');
		System.out.println();
	}

}

// p = a0 + a1 * X + a2 * X^2 + a3 * X^3 + ... + aN * X^n
// p' = a1 + 2 * a2 * X + 3 * a3 * X^2 + ... + n * aN * X^(n - 1)
// p'' = 2 * a2 + 3 * 2 * a3 * X + ... + n * (n - 1) * aN * X^(n - 2)
// p''' = 3 * 2 * 1 * a3 + 4 * 3 * 2 * 1 * a4 * X + ... + n * (n - 1) * (n - 2) * aN * X^(n - 3)
// ...