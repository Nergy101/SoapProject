package com.koop.services;

public class Betaling {
	private int id;
	private String name;
	private String adres;
	private int bedrag;

	public Betaling() {
	}

	public Betaling(String name, String adres, int bedrag) {
		this.name = name;
		this.adres = adres;
		this.bedrag = bedrag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public int getBedrag() {
		return bedrag;
	}

	public void setBedrag(int bedrag) {
		this.bedrag = bedrag;
	}
}
