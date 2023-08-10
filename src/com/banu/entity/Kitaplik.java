package com.banu.entity;

import com.banu.repository.IGoruntule;

public class Kitaplik implements IGoruntule {

	/**
	 * Kitaplık Sınıfı (Library Class): Kitapları içinde barındırmalı ve kitap
	 * eklemek, silmek, aramak gibi işlemleri yapabilmelidir.
	 */

	int uzunluk = 0;
	Kitap[] kitaplik;

	/**
	 * Kitap listesine kitap eklemek için kullanılan methoddur.
	 * 
	 * @param kitap, kitap nesnsi oluştururz ve bunu parametre olarak veririz.
	 */
	public void ekle(Kitap kitap) {
		Kitap[] tmp;
		if (kitaplik == null) {
			kitaplik = new Kitap[1];
			kitaplik[0] = kitap;
		} else {
			tmp = new Kitap[uzunluk + 1];
			for (int i = 0; i < uzunluk; i++) {
				tmp[i] = kitaplik[i];
			}
			tmp[uzunluk] = kitap;
			kitaplik = tmp;
		}
		uzunluk++;
	}

	/**
	 * Kütüphanede kitap araman için kullanılan method.
	 * 
	 * @param kitapIsmi -> aramak istediğiniz kitabın adı
	 */
	public void kitapAra(String kitapIsmi) {
		boolean kontrol = false;
		for (int i = 0; i < uzunluk; i++) {
			if (kitaplik[i].getKitabAdi().equalsIgnoreCase(kitapIsmi)) {
				System.out.println(kitaplik[i].toString());
				kontrol = true;
			}

		}
		if (!kontrol) {
			System.out.println("Aradığınız kitap yok veya yanlış yazdınız");
		}

	}

	/**
	 * Kütüphaneden kitap silmek için kullanılan method
	 * 
	 * @param kitapIsmi -> silinecek kitabın ismi
	 */
	public void sil(String kitapIsmi) {
		Kitap[] tmp = new Kitap[uzunluk - 1];
		int j = 0;
		for (int i = 0; i < uzunluk; i++) {
			if (!kitaplik[i].getKitabAdi().equalsIgnoreCase(kitapIsmi)) {
				tmp[i - j] = kitaplik[i];

			} else {
				j = 1;
			}
		}
		kitaplik = tmp;
		uzunluk--;
		System.out.println("Kitap silindi");

	}

	@Override
	/**
	 * IGoruntule interfacinden override edilmiştir. Kitaplığın içindeki kitapların
	 * bilgilerini ekrana yazae
	 */
	public void goruntule() {
		System.out.print("Başlık\t\t\t\t\t     |   Yazar\t\t   |  ISBN Number\t| Yayın Yılı\t| Tür\n");
		System.out.print("------\t\t\t\t\t         -----\t\t      -----------\t  ----------\t  ---");
		System.out.println();
		for (int i = 0; i < uzunluk; i++) {
			System.out.printf("%-48s %-20s %-19s %-15s %-6s", kitaplik[i].getKitabAdi(), kitaplik[i].getYazar(),
					kitaplik[i].getISBN_Number(), kitaplik[i].getYayinYili(), kitaplik[i].getTur());
			System.out.println();
		}

	}

}
