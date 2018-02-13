package springmvc.service;

import java.util.List;

import springmvc.model.kullanici;

public interface kullaniciServis {
	public void kullaniciEkle(kullanici kullanici);
	public List<kullanici> tumKullanicileriListele();
}
