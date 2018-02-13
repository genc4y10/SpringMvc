package springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.kullaniciDao;
import springmvc.model.kullanici;

@Service
public class kullaniciServisArayuzu implements kullaniciServis{
	
	kullaniciDao kullaniciDao;
	
	@Autowired
	public void setKullaniciDao(kullaniciDao kullaniciDao) {
		this.kullaniciDao = kullaniciDao;
	}

	public void kullaniciEkle(kullanici kullanici) {
		kullaniciDao.kullaniciEkle(kullanici);
		
	}

	public List<kullanici> tumKullanicileriListele() {
		// TODO Auto-generated method stub
		return kullaniciDao.tumKullanicileriListele();
	}

	
}
