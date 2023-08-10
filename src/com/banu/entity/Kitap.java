package com.banu.entity;

public class Kitap {
	private String kitabAdi;
	private String yazar;
	private String ISBN_Number;
	private int yayinYili;
	private String tur;

	public Kitap() {

	}

	public Kitap(String kitabAdi, String yazar, String iSBN_Number, int yayinYili, String tur) {
		super();
		this.kitabAdi = kitabAdi;
		this.yazar = yazar;
		this.ISBN_Number = iSBN_Number;
		this.yayinYili = yayinYili;
		this.tur = tur;
	}

	public String getKitabAdi() {
		return kitabAdi;
	}

	public void setKitabAdi(String kitabAdi) {
		this.kitabAdi = kitabAdi;
	}

	public String getYazar() {
		return yazar;
	}

	public void setYazar(String yazar) {
		this.yazar = yazar;
	}

	public String getISBN_Number() {
		return ISBN_Number;
	}

	public void setISBN_Number(String iSBN_Number) {
		ISBN_Number = iSBN_Number;
	}

	public int getYayinYili() {
		return yayinYili;
	}

	public void setYayinYili(int yayinYili) {
		this.yayinYili = yayinYili;
	}

	public String getTur() {
		return tur;
	}

	public void setTur(String tur) {
		this.tur = tur;
	}

	@Override
	public String toString() {
		return "Kitap Adı= " + kitabAdi + "\nYazar= " + yazar + "\nISBN Number= " + ISBN_Number + "\nYayın Yılı= "
				+ yayinYili + "\nTür=" + tur;
	}

}
