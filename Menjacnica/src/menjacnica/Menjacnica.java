package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejs.IMenjacnica;
import valuta.Kurs;
import valuta.Valuta;

public class Menjacnica implements IMenjacnica {
	private LinkedList<Valuta>valute;
	@Override
	public void dodajKurs(Valuta v, Kurs k) {
		for(Valuta i:valute) {
			if(i.equals(v)) {
				i.getKursevi().add(k);
			}
		}

	}

	@Override
	public void obrisiKurs(Valuta v, GregorianCalendar dan) {
		// TODO Auto-generated method stub

	}

	@Override
	public Kurs pronadjiKurs(Valuta v, GregorianCalendar dan) {
		// TODO Auto-generated method stub
		return null;
	}

}
