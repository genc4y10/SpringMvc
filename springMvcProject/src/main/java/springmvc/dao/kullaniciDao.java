package springmvc.dao;
import springmvc.model.kullanici;
import java.util.*;
public interface kullaniciDao {
	
		public List<kullanici> tumKullanicileriListele();
		
		public void kullaniciEkle(kullanici kullanici);
		
		
}
