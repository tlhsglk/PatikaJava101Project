import java.util.Scanner;

public class TaksimetreProgrami {

	public static void main(String[] args) {

		/*
		 * Taksimetre KM başına 2.20 TL(perKm) tutmaktadır.
		 * Minimum ödenecek tutar 20 TL(minPrice) dir.
		 * 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
		 * Taksimetre açılış ücreti 10 TL(startPrice) dir.
		 */

		Scanner scanner = new Scanner(System.in);

		double km;
		double startPrice = 10, minPrice = 20, perKm = 2.20;

		System.out.print("Mesafeyi (KM) yazın: ");
		km = scanner.nextDouble();

		double total = startPrice + (km * perKm);
		total = (total <= minPrice) ? minPrice : total;

		scanner.close();
		System.out.println("Toplam Tutar: " + total + " TL");

	}

}
