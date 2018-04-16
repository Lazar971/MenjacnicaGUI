package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.event.HierarchyBoundsAdapter;
import java.awt.event.HierarchyEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private MenjacnicaGUI menjacnica;
	private JLabel lblKupovniKurs;
	private JTextField textField;
	private JComboBox valuta;
	private JLabel lblValuta;
	private JTextField textField_1;
	private JLabel lblProdajniKurs;
	private JLabel lblIznos;
	private JLabel lblVrstaTransakcije;
	private JTextField iznos;
	private JRadioButton rdbtnKupovina;
	private JRadioButton rdbtnProdaja;
	private JSlider slider;
	private JButton btnIzvrsiZamenu;
	private JButton btnOdustani;
	private ButtonGroup grupa=new ButtonGroup();
	
	public IzvrsiZamenuGUI(MenjacnicaGUI m) {
		setResizable(false);
		setTitle("Izvrsi zamenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getTextField());
		contentPane.add(getValuta());
		contentPane.add(getLblValuta());
		contentPane.add(getTextField_1());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblIznos());
		contentPane.add(getLblVrstaTransakcije());
		contentPane.add(getIznos());
		contentPane.add(getRdbtnKupovina());
		contentPane.add(getRdbtnProdaja());
		contentPane.add(getSlider());
		contentPane.add(getBtnIzvrsiZamenu());
		contentPane.add(getBtnOdustani());
		menjacnica=m;
		
	}

	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(10, 11, 86, 14);
		}
		return lblKupovniKurs;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setEditable(false);
			textField.setBounds(10, 36, 159, 20);
			textField.setColumns(10);
		}
		return textField;
	}
	private JComboBox getValuta() {
		if (valuta == null) {
			valuta = new JComboBox();
			valuta.setModel(new DefaultComboBoxModel(new String[] {"EUR", "USD", "CHF"}));
			valuta.setBounds(179, 36, 60, 20);
		}
		return valuta;
	}
	private JLabel getLblValuta() {
		if (lblValuta == null) {
			lblValuta = new JLabel("Valuta");
			lblValuta.setBounds(179, 11, 46, 14);
		}
		return lblValuta;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setBounds(249, 36, 185, 20);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(249, 11, 109, 14);
		}
		return lblProdajniKurs;
	}
	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setBounds(10, 99, 46, 14);
		}
		return lblIznos;
	}
	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setBounds(223, 99, 123, 14);
		}
		return lblVrstaTransakcije;
	}
	private JTextField getIznos() {
		if (iznos == null) {
			iznos = new JTextField();
			iznos.setBounds(10, 124, 185, 20);
			iznos.setColumns(10);
			
		}
		return iznos;
	}
	private JRadioButton getRdbtnKupovina() {
		if (rdbtnKupovina == null) {
			rdbtnKupovina = new JRadioButton("Kupovina");
			rdbtnKupovina.setBounds(223, 120, 109, 23);
			grupa.add(rdbtnKupovina);
		}
		return rdbtnKupovina;
	}
	private JRadioButton getRdbtnProdaja() {
		if (rdbtnProdaja == null) {
			rdbtnProdaja = new JRadioButton("Prodaja");
			rdbtnProdaja.setBounds(223, 145, 109, 23);
			grupa.add(rdbtnProdaja);
		}
		return rdbtnProdaja;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					Integer i=slider.getValue();
					iznos.setText(i.toString());
				}
			});
			slider.setPaintLabels(true);
			slider.setMinorTickSpacing(5);
			slider.setMajorTickSpacing(10);
			slider.setPaintTicks(true);
			
			
			slider.setBounds(10, 187, 424, 45);
		}
		return slider;
	}
	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s;
					if(rdbtnKupovina.isSelected()) 
						 s="Kupljeno "+iznos.getText()+" "+valuta.getSelectedItem().toString()+"\n";
					else
						s=	"Prodato "+iznos.getText()+" "+valuta.getSelectedItem().toString()+"\n";
					menjacnica.getStatusArea().append(s);
					dispose();
					
				}
			});
			btnIzvrsiZamenu.setBounds(26, 238, 143, 23);
		}
		return btnIzvrsiZamenu;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(273, 238, 143, 23);
		}
		return btnOdustani;
	}
}
