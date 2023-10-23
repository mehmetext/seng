import java.util.Scanner;

public class Hafta3 {

	public static void main(String[] args) {
		int gunIndex = 0;
		switch (gunIndex) {
		case 0:
			System.out.println("Pazartesi");
			break;
		case 1:
			System.out.println("Salı");
			break;
		case 2:
			System.out.println("Çarşamba");
			break;
		case 3:
			System.out.println("Perşembe");
			break;
		case 4:
			System.out.println("Cuma");
			break;
		case 5:
			System.out.println("Cumartesi");
			break;
		case 6:
			System.out.println("Pazar");
			break;

		default:
			System.out.println("Geçersiz Gün");
			break;
		}
	}

	static void ForeachKullanimi() {
//		char[] ch = { 'K', 'o', 'n', 'y', 'a' };
//		for (char c : ch) {
//			System.out.print(c);
//		}

		String[] dizi = { "Ankara", "İstanbul", "İzmir", "Aksaray" };

		for (String string : dizi) {
			System.out.println(string);
		}

		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}

	}

	static void BasamakSayisi() {
		System.out.print("Sayi giriniz:");
		Scanner scanner = new Scanner(System.in);
		int sayi = scanner.nextInt();

		int basamakAdet = 0;

		while (sayi > 0) {
			basamakAdet++;
			sayi /= 10;
		}

		System.out.println("Basamak sayısı: " + basamakAdet);
	}

	static void MukemmelSayi2() {
		System.out.print("Sayi giriniz:");
		Scanner scanner = new Scanner(System.in);
		int sayi = scanner.nextInt();

		int toplam;
		System.out.print("Kaç tane:");
		int N = scanner.nextInt();

		do {
			sayi++;
			toplam = 0;

			for (int i = 1; i < sayi; i++) {
				if (sayi % i == 0)
					toplam += i;
			}

			if (sayi == toplam) {
				System.out.println(sayi + " mükemmeldir.");
				N--;
			}

		} while (N > 0);

	}

	static void MukemmelSayi() {
		System.out.print("Sayi giriniz:");
		Scanner scanner = new Scanner(System.in);
		int sayi = scanner.nextInt();

		int toplam = 0;

		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0)
				toplam += i;
		}

		if (sayi == toplam) {
			System.out.println(sayi + " mükemmeldir.");
		}
	}

	static void ContinueKullanimi() {
		int sayi = 50;

		for (int i = 2; i < sayi; i++) {

			if (i % 5 == 0)
				continue;

			AsalMi(i);
//			System.out.println(i);

		}
	}

	static void AsalMi(int sayi) {
//		int sayi = 4;

		boolean asalMi = true;

		for (int i = 2; i <= sayi / 2; i++) {
			if (sayi % i == 0) {
				asalMi = false;
				break;
			}
		}

		if (asalMi) {
			System.out.println(sayi + " Sayı asaldır");
		} else {
			System.out.println(sayi + " Sayı asal değildir");
		}
	}

	static void ForIslemler() {

		for (int i = 0; i <= 10; i += 2) {
			System.out.println(i);

			if (i == 10)
				i = -1;
		}

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print("\t" + (j * i));
			}
			System.out.println("");
		}

	}

}
