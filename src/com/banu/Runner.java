package com.banu;

import com.banu.entity.Kitap;
import com.banu.entity.Kitaplik;
import com.banu.repository.DosyaGoruntule;
import com.banu.repository.IGoruntule;
import com.banu.repository.KonsolGoruntule;

public class Runner {

	public static void main(String[] args) {
		Kitap kitap1 = new Kitap("İstanbulun En Güzel Abisi", "Ahmet Ümit", "163546345", 2005, "Polisiye");
		Kitaplik kitaplik = new Kitaplik();
		kitaplik.ekle(kitap1);
		Kitap kitap2 = new Kitap("Gece Yarısı Kütüphanesi", "Matt Haig", "68746345", 2021, "Dünya Roman");
		kitaplik.ekle(kitap2);
		Kitap kitap3 = new Kitap("Var mısın? - Güçlü Bir Yaşam İçin Öneriler", "Doğan Cüceloğlu", "12165645", 2021,
				"Kişisel Gelişim");
		kitaplik.ekle(kitap3);
		Kitap kitap4 = new Kitap("Bir İdam Mahkumunun Son Günü ", "Victor Hugo", "7473546345", 2013, "Dünya Kilasik");
		kitaplik.ekle(kitap4);

//		kitaplik.kitapAra("İstanbulun En Güzel Abisi");

//		kitaplik.sil("Gece Yarısı Kütüphanesi");
		kitaplik.goruntule();
		/**
		 * Görüntüle interfacei kitaplık içinde de kullanılmıştır. konsola kütüphanedi
		 * kitapları ve bilgilerini yazdırır
		 */
		IGoruntule goruntule;
		goruntule = new DosyaGoruntule();
		goruntule.goruntule();
		goruntule = new KonsolGoruntule();
		goruntule.goruntule();

	}

}
