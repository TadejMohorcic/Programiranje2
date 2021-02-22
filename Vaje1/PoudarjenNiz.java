
public class PoudarjenNiz {

	public static void main(String[] args) {
		System.out.println(poudari_vse("Zadnja Novica"));
		System.out.println(poudari_zvezdica("Zadnja *novica* danes je *lol*!"));

	}
	
	public static String poudari_vse(String niz) {
		String s = "";
		for (int i = 0; i < niz.length(); i++) {
			char znak = niz.charAt(i);
			if (i > 0) s+= " ";
			s += Character.toUpperCase(znak);
		}
		return s;
	}
	
	public static String poudari_zvezdica(String niz) {
		String s = "";
		boolean krepko = false;
		for (int i = 0; i < niz.length(); i++) {
			char znak = niz.charAt(i);
			if (znak == '*') krepko = !krepko;
			else if (krepko) s += Character.toUpperCase(znak);
			else s += znak;
		}
		return s;
	}

}
