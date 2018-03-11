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
	@Override
	public String toString() {
		return "Valuta [ime=" + ime + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((skraceno == null) ? 0 : skraceno.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (skraceno == null) {
			if (other.skraceno != null)
				return false;
		} else if (!skraceno.equals(other.skraceno))
			return false;
		return true;
	}
	
	
}
