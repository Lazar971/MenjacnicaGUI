package interfejs;

import java.util.GregorianCalendar;

import valuta.Valuta;

public interface IMenjacnica {
	public void dodajKurs(Valuta v,GregorianCalendar dan);
	public void obrisiKurs(Valuta v,GregorianCalendar dan);
	public void pronadjiKurs(Valuta v,GregorianCalendar dan);
}
