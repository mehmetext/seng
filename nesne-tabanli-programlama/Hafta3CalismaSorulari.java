import java.util.Arrays;

public class Hafta3CalismaSorulari {

	public static void main(String[] args) {
		SiraliYazdir(4);
	}

	static void SiraliYazdir(int sayi) {
		int temp = 0;
		for (int i = 1; i <= sayi; i++) {
			for (int j = 1; j <= i; j++) {
				temp++;
				System.out.print(temp + " ");
			}
			System.out.println();
		}
	}

	static void KaprekarSabiti(int sayi) {
		if (sayi < 1000 || sayi > 9999) {
			System.out.println("Lütfen 4 basamaklı bir sayı gir.");
			return;
		}

		while (sayi != 6174) {

			int basamak1 = sayi / 1000;
			int basamak2 = sayi % 1000 / 100;
			int basamak3 = sayi % 100 / 10;
			int basamak4 = sayi % 10 / 1;

			int[] basamaklar = { basamak1, basamak2, basamak3, basamak4 };

			Arrays.sort(basamaklar);

			int kucuk = basamaklar[0] * 1000 + basamaklar[1] * 100 + basamaklar[2] * 10 + basamaklar[3];
			int buyuk = basamaklar[3] * 1000 + basamaklar[2] * 100 + basamaklar[1] * 10 + basamaklar[0];

			sayi = buyuk - kucuk;

			System.out.println(buyuk + " - " + kucuk + " = " + sayi);

			if (sayi == 0) {
				System.out.println("Sayı sabit. Kaprekar bulunamaz.");
				break;
			}
		}
	}

	static void FermatSayi(int n) {
		System.out.println(Math.pow(2, Math.pow(2, n)) + 1);
	}

	static void HarshadSayi(int sayi) {
		int temp = sayi;
		int toplam = 0;

		while (temp > 0) {
			toplam += temp % 10;
			temp /= 10;
		}

		if (sayi % toplam == 0) {
			System.out.println(sayi + " sayısı Harshad sayıdır.");
		} else {
			System.out.println(sayi + " sayısı Harshad sayı değildir.");
		}
	}

	static void AsalCarpanlariBul(int sayi) {
		int sayac = 0;
		for (int i = 2; i <= sayi / 2; i++) {
			if (AsalMi(i) && sayi % i == 0) {
				System.out.print(i + " ");
				sayac++;
			}
		}
		System.out.print("- Sonuç: " + sayac);
	}

	static void EskenarUcgenCiz() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10 - i; j++)
				System.out.print("  ");
			for (int j = 0; j < i * 2 - 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void DikUcgenCiz() {
		for (int i = 1; i < 11; i++) {
			for (int j = 0; j < 11 - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void KareCiz() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static int Asal3ncuSayi(int sayi) {

		int sayac = 0;

		for (int i = sayi - 1; i > 1; i--) {
			if (AsalMi(i))
				sayac++;

			if (sayac == 3)
				return i;
		}

		return 0;
	}

	static boolean AsalMi(int sayi) {
		if (sayi < 2)
			return false;

		for (int i = 2; i <= sayi / 2; i++) {
			if (sayi % i == 0)
				return false;
		}

		return true;
	}

	static int ikilikToOnluk(String sayi) {

		sayi = new StringBuilder(sayi).reverse().toString();
		int katsayi = 1;
		int sonuc = 0;

		for (int i = 0; i < sayi.length(); i++) {
			if (sayi.charAt(i) == '1') {

				sonuc += katsayi;

			}

			katsayi *= 2;
		}

		return sonuc;
	}

	static String onlukToIkilik(int sayi) {

		if (sayi < 1)
			return "0";

		String ikilik = "";

		while (sayi > 0) {

			ikilik += sayi % 2;

			sayi /= 2;

		}

		return new StringBuilder(ikilik).reverse().toString();
	}

	static int fibHesapla(int position) {
		if (position < 1)
			return 0;
		else if (position < 3)
			return 1;

		int fib1 = 1;
		int fib2 = 1;
		int total = 0;

		// Buradaki 3, yukarıdaki position'dan geliyor.
		for (int i = 3; i < position; i++) {
			total = fib1 + fib2;
			fib1 = fib2;
			fib2 = total;
		}

		return total;
	}

}
