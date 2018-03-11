package valuta;

public class Valuta {
	private String ime, skraceno;
	private Kurs[] kursevi;
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getSkraceno() {
		return skraceno;
	}
	public void setSkraceno(String skraceno) {
		this.skraceno = skraceno;
	}
	public Kurs[] getKursevi() {
		return kursevi;
	}
	public void setKursevi(Kurs[] kursevi) {
		this.kursevi = kursevi;
	}
	
	
}
