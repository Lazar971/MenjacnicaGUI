package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejs.IMenjacnica;
import valuta.Kurs;
import valuta.Valuta;

public class Menjacnica implements IMenjacnica {
	private LinkedList<Valuta> valute;
	@Override
	public void dodajKurs(Valuta v, Kurs k) {
		for(int i=0;i<valute.size();i++) {
			if(valute.get(i).equals(v)) {
				valute.get(i).getKursevi().add(k);
				return;
			}
		}

	}

	@Override
	public void obrisiKurs(Valuta v, GregorianCalendar dan) {
		for(int i=0;i<valute.size();i++) {
			if(valute.get(i).equals(v)) {
				for(int j=0;j<valute.get(i).getKursevi().size();j++) {
					if(valute.get(i).getKursevi().get(j).getDatum().equals(dan)) {
						valute.get(i).getKursevi().remove(j);
						return;
						
					}
					
				}
			}
			
		}

	}

	@Override
	public Kurs pronadjiKurs(Valuta v, GregorianCalendar dan) {
		for(int i=0;i<valute.size();i++) {
			if(valute.get(i).equals(v)) {
				for(int j=0;j<valute.get(i).getKursevi().size();j++) {
					if(valute.get(i).getKursevi().get(j).getDatum().equals(dan)) {
						return valute.get(i).getKursevi().get(j);
						
						
					}
					
				}
			}
			
		}return null;
	}
}
