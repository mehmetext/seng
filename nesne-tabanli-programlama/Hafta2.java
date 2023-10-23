
public class Hafta2 {

	/**
	 * @author mehmet
	 */

	// Yorum satırı falan filan
	public static void main(String[] args) {
		System.out.println("Hello, world!");

		System.err.println("Hata gösterimi");

		System.out.println("Hafta2.main()");

		byte byteDegisken = 128 - 1; // -128 ile 127 arası
		System.out.println(byteDegisken);

		short shortDegisken = 32768 - 1; // -32768 ile 32767 arası

		int intDegisken = 1234323132;

		long longDegisken = 1231241241;

		float floatDegisken = 10.1234567890f; // f var
		System.out.println(floatDegisken);

		double doubleDegisken = 10.12345678901234567890; // f yok
		System.out.println(doubleDegisken);

		char charDegisken = 'A';
		System.out.println(charDegisken);

		boolean boolDegisken = false; // true

		System.out.println("doubleDegisken: " + doubleDegisken);

	}

}
