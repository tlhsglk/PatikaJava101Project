import java.util.Scanner;

public class UcgenAlanHesaplama {

	public static void main(String[] args) {

		float a, b, c, u, alan;

		Scanner scanner = new Scanner(System.in);

		System.out.print("1. Kenar Uzunluğunu Girin: ");
		a = scanner.nextFloat();

		System.out.print("2. Kenar Uzunluğunu Girin: ");
		b = scanner.nextFloat();

		System.out.print("3. Kenar Uzunluğunu Girin: ");
		c = scanner.nextFloat();

		scanner.close();

		u = (a + b + c) / 2;

		alan = (float) Math.sqrt(u * (u - a) * (u - b) * (u - c));

		System.out.println("Üçgenin Çevresi: " + (2 * u));
		System.out.println("Üçgenin Alanı: " + alan);

	}

}
