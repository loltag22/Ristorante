
public class MainClass {

	public static void main(String[] args) {
		
		Ristorante r = new Ristorante();
		
		String a1 = r.disponiArea(1);
		String a2 = r.disponiArea(2);
		String a3 = r.disponiArea(3);
		String a4 = r.disponiArea(4);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		System.out.println(r.associaArea(1, 4));
		
	}

}
