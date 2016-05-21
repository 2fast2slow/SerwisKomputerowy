package model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


public class Naprawa {

	private long id;
	private Date dataPrzyjecia;
	private Date przewidywanaDataNaprawy;
	private double przewidywanyKoszt;
	private String opisUszkodzenia;
	private String komentarz;
	private double cenaNaprawy;
	private Klient klient;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDataPrzyjecia() {
		return dataPrzyjecia;
	}

	public void setDataPrzyjecia(Date dataPrzyjecia) {
		this.dataPrzyjecia = dataPrzyjecia;
	}

	public Date getPrzewidywanaDataNaprawy() {
		return przewidywanaDataNaprawy;
	}

	public void setPrzewidywanaDataNaprawy(Date przewidywanaDataNaprawy) {
		this.przewidywanaDataNaprawy = przewidywanaDataNaprawy;
	}

	public double getPrzewidywanyKoszt() {
		return przewidywanyKoszt;
	}

	public void setPrzewidywanyKoszt(double przewidywanyKoszt) {
		this.przewidywanyKoszt = przewidywanyKoszt;
	}

	public String getOpisUszkodzenia() {
		return opisUszkodzenia;
	}

	public void setOpisUszkodzenia(String opisUszkodzenia) {
		this.opisUszkodzenia = opisUszkodzenia;
	}

	public String getKomentarz() {
		return komentarz;
	}

	public void setKomentarz(String komentarz) {
		this.komentarz = komentarz;
	}

	public double getCenaNaprawy() {
		return cenaNaprawy;
	}

	public void setCenaNaprawy(double cenaNaprawy) {
		this.cenaNaprawy = cenaNaprawy;
	}

	private void insert(){
		NaprawaInsert doInsert = new NaprawaInsert();
		doInsert.wstawNaprawe(this);
	}


}
