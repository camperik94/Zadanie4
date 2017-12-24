import java.util.Scanner;

public class Zadanie {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double dochod = in.nextDouble();
		
		Podatek pod = new Podatek(dochod);
	
		
		System.out.println(pod.oblicz(dochod));
	}
}
