package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblNaziv;
	private JLabel lblNaziv_1;
	private JTextField sifra;
	private JTextField naziv;
	private JLabel lblProdajniKurs;
	private JTextField prodajni;
	private JTextField kupovni;
	private JLabel lblKupovniKurs;
	private JLabel lblSrednjKurs;
	private JTextField srednji;
	private JLabel lblSkraceniNaziv;
	private JTextField skraceni;
	private JButton btnNewButton;
	private JButton btnOdustani;
	private MenjacnicaGUI mg;
	
	public DodajKursGUI(MenjacnicaGUI m) {
		setResizable(false);
		setTitle("Dodaj kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNaziv());
		contentPane.add(getLblNaziv_1());
		contentPane.add(getSifra());
		contentPane.add(getNaziv());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getProdajni());
		contentPane.add(getKupovni());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getLblSrednjKurs());
		contentPane.add(getSrednji());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getSkraceni());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnOdustani());
		mg=m;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Sifra");
			lblNaziv.setBounds(10, 25, 46, 14);
		}
		return lblNaziv;
	}
	private JLabel getLblNaziv_1() {
		if (lblNaziv_1 == null) {
			lblNaziv_1 = new JLabel("Naziv");
			lblNaziv_1.setBounds(222, 25, 46, 14);
		}
		return lblNaziv_1;
	}
	private JTextField getSifra() {
		if (sifra == null) {
			sifra = new JTextField();
			sifra.setBounds(10, 50, 202, 20);
			sifra.setColumns(10);
		}
		return sifra;
	}
	private JTextField getNaziv() {
		if (naziv == null) {
			naziv = new JTextField();
			naziv.setBounds(222, 50, 212, 20);
			naziv.setColumns(10);
		}
		return naziv;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(10, 81, 93, 14);
		}
		return lblProdajniKurs;
	}
	private JTextField getProdajni() {
		if (prodajni == null) {
			prodajni = new JTextField();
			prodajni.setBounds(10, 106, 202, 20);
			prodajni.setColumns(10);
		}
		return prodajni;
	}
	private JTextField getKupovni() {
		if (kupovni == null) {
			kupovni = new JTextField();
			kupovni.setBounds(222, 106, 212, 20);
			kupovni.setColumns(10);
		}
		return kupovni;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(222, 81, 116, 14);
		}
		return lblKupovniKurs;
	}
	private JLabel getLblSrednjKurs() {
		if (lblSrednjKurs == null) {
			lblSrednjKurs = new JLabel("Srednj kurs");
			lblSrednjKurs.setBounds(10, 137, 108, 14);
		}
		return lblSrednjKurs;
	}
	private JTextField getSrednji() {
		if (srednji == null) {
			srednji = new JTextField();
			srednji.setBounds(10, 162, 202, 20);
			srednji.setColumns(10);
		}
		return srednji;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setBounds(222, 137, 116, 14);
		}
		return lblSkraceniNaziv;
	}
	private JTextField getSkraceni() {
		if (skraceni == null) {
			skraceni = new JTextField();
			skraceni.setBounds(222, 162, 212, 20);
			skraceni.setColumns(10);
		}
		return skraceni;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Dodaj");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String tekst=sifra.getText()+" "+skraceni.getText()+
							" "+prodajni.getText()+" "+srednji.getText()+" "+kupovni.getText()+" "+naziv.getText();
					mg.getStatusArea().append("Dodat kurs "+tekst+"\n");
					dispose();
				}
			});
			btnNewButton.setBounds(10, 193, 202, 68);
		}
		return btnNewButton;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					dispose();
				}
			});
			btnOdustani.setBounds(222, 193, 212, 68);
		}
		return btnOdustani;
	}
}
