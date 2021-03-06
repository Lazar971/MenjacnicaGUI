package valuta;

import java.util.GregorianCalendar;

public class Kurs {
	private GregorianCalendar datum;
	private double kupovni, srednji, prodajni;
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		if(datum==null)throw new RuntimeException("Los datum");
		this.datum = datum;
	}
	public double getKupovni() {
		return kupovni;
	}
	public void setKupovni(double kupovni) {
		if(kupovni<=0)throw new RuntimeException("Los kupovni");
		this.kupovni = kupovni;
	}
	public double getSrednji() {
		return srednji;
	}
	public void setSrednji(double srednji) {
		if(srednji<=0)throw new RuntimeException("Los srednji");
		this.srednji = srednji;
	}
	public double getProdajni() {
		return prodajni;
	}
	public void setProdajni(double prodajni) {
		if(prodajni<=0)throw new RuntimeException("Los prodajni");
		this.prodajni = prodajni;
	}
	@Override
	public String toString() {
		return "Kurs [datum=" + datum + ", kupovni=" + kupovni + ", srednji=" + srednji + ", prodajni=" + prodajni
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
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
		Kurs other = (Kurs) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		return true;
	}

	
	
}
