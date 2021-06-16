package UASAnalog;

public class Pembayaran {
	String nama,nominal;
	String berapabulan;
	
	@Override
	public String toString() {
		return "Pembayaran [nama=" + nama + ", nominal=" + nominal + ", berapa bulan=" + berapabulan  + "]";
	}
	public Pembayaran(String nama, String nominal, String berapabulan) {
		this.nama = nama;
		this.nominal = nominal;
		this.berapabulan = berapabulan;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getNominal() {
		return nominal;
	}
	public void setNominal(String nominal) {
		this.nominal = nominal;
	}
	public String getBerapabulan() {
		return berapabulan;
	}
	public void setBerapabulan(String berapabulan) {
		this.berapabulan = berapabulan;
	}
	
 
	

}
