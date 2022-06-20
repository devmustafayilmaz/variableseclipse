
public class VeriTipiDonusumleri {

	public static void main(String[] args) {
		
		int yas= 26;
		System.out.println(yas);
		String yas1= Integer. toString(yas);
		System.out.println(yas1);
		String yas2= String.valueOf(yas);
		
		
		/* Integer veri yapısını String veri yapısına dönüştürme işleminde 
		 * valueOf ve toString veri dönüşüm işlemlerini kullanırız. ikisini de kullanabiliriz. birleştirme işleminde ise 
		 * '+' operatörü kullanılır */
		
		
		System.out.println(yas);
		String yas3="5"+yas;
		System.out.println(yas3);
		String dogumYili="1993";
		System.out.println(dogumYili+3);
		
		
		/* Eğer string bir yapıyı integer a dönüştürmewk istiyorsak parseInt
		 * yapısını kullanacağız ve string yapılarında herhangi bir matematik
		 * işlemi yapamazken integer veri tipinde yaparız.*/
		 
		 
		int dogumYili1=Integer.parseInt(dogumYili);
		System.out.println(dogumYili1+3);
		
		int aileSiraNo = 5;
		double aileSiraNo1 = (double)aileSiraNo;
		double aileSiraNo2 = Double.valueOf(aileSiraNo);
		System.out.println(aileSiraNo);
		System.out.println(aileSiraNo);
		System.out.println(aileSiraNo);
		
		byte sira=1;
		int yil = 1993;
		short sinif = 3;
		long tckn = 25426820034L;
		float kilo = 76.5F;
		double boy = 182.4;
		char karakterimiz = 'a';
		long classs= 3L;

		String stringsira = String.valueOf(sira);
		String stringyil = String.valueOf(yil);
		String stringsinif = String.valueOf(sinif);
		String stringtckn = String.valueOf(tckn);
		String stringkilo = String.valueOf(kilo);
		String stringboy = String.valueOf(boy);
		String stringkarakterimiz = String.valueOf(karakterimiz);
		System.out.println(stringsira);
		System.out.println(stringyil);
		System.out.println(stringsinif);
		System.out.println(stringtckn);
		System.out.println(stringkilo);
		System.out.println(stringboy);
		System.out.println(stringkarakterimiz);
		System.out.println(classs);
		
		
		
		
		
	}

}
