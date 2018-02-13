package springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.*;
import javax.swing.tree.RowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.*;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.*;
import springmvc.model.kullanici;
import org.springframework.jdbc.core.*;

@Repository
public class kullaniciDaoArayuz implements kullaniciDao {

	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Autowired
	public void setNamedParameterJdbcTemplate(
			NamedParameterJdbcTemplate namedParameterJdbcTemplate)
			throws DataAccessException {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	public List<kullanici> tumKullanicileriListele() {
		String sql = "SELECT isim,soyisim,adres,telefon,eposta,dogumTarihi,ticaretleUgrastinizMi,tercihSebebi,neredeDukkanAcmakIstersiniz,yatirimMiktari,eklenecekler FROM formcontext";
		List<kullanici> list = namedParameterJdbcTemplate.query(sql,
				getSqlParameterByModel(null), new UserMapper());
		return list;
	}

	private SqlParameterSource getSqlParameterByModel(kullanici kullanici) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		if (kullanici != null) {
			paramSource.addValue("isim", kullanici.getIsim());
			paramSource.addValue("soyisim", kullanici.getSoyisim());
			paramSource.addValue("adres", kullanici.getAdres());
			paramSource.addValue("telefon", kullanici.getTelefon());
			paramSource.addValue("eposta", kullanici.getEposta());
			paramSource.addValue("dogumTarihi", kullanici.getDogumTarihi());
			paramSource.addValue("ticaretleUgrastinizMi",
					kullanici.getTicaretleUgrastinizMi());
			paramSource.addValue("tercihSebebi", kullanici.getTercihSebebi());
			paramSource.addValue("neredeDukkanAcmakIstersiniz",
					kullanici.getNeredeDukkanAcmakIstersiniz());
			paramSource.addValue("yatirimMiktari",
					kullanici.getYatirimMiktari());
			paramSource.addValue("eklenecekler", kullanici.getYatirimMiktari());
		}
		return paramSource;

	}

	private static final class UserMapper implements
			org.springframework.jdbc.core.RowMapper<kullanici> {
		public kullanici mapRow(ResultSet rs, int rowNum) throws SQLException {
			kullanici k = new kullanici();
			k.setIsim(rs.getString("isim"));
			k.setSoyisim(rs.getString("soyisim"));
			k.setAdres(rs.getString("adres"));
			k.setTelefon(rs.getString("telefon"));
			k.setEposta(rs.getString("eposta"));
			k.setDogumTarihi(rs.getString("dogumTarihi"));
			k.setTicaretleUgrastinizMi(rs.getString("ticaretleUgrastinizMi"));
			k.setTercihSebebi(rs.getString("tercihSebebi"));
			k.setNeredeDukkanAcmakIstersiniz(rs
					.getString("neredeDukkanAcmakIstersiniz"));
			k.setYatirimMiktari(rs.getInt("yatirimMiktari"));
			k.setEklenecekler(rs.getString("eklenecekler"));

			return k;
		}
	}

	public void kullaniciEkle(kullanici kullanici) {
		String sql = "INSERT INTO formcontext(isim,soyisim,adres,telefon,eposta,dogumTarihi,ticaretleUgrastinizMi,tercihSebebi,neredeDukkanAcmakIstersiniz,yatirimMiktari,eklenecekler) VALUES(:isim, :soyisim, :adres, :telefon, :eposta, :dogumTarihi, :ticaretleUgrastinizMi, :tercihSebebi, :neredeDukkanAcmakIstersiniz, :yatirimMiktari, :eklenecekler) ";
		namedParameterJdbcTemplate.update(sql,
				getSqlParameterByModel(kullanici));

	}
}
