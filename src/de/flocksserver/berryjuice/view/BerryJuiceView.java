package de.flocksserver.berryjuice.view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class BerryJuiceView extends JFrame {
	private static final long serialVersionUID = 7814838553957885784L;
	private JButton zeigeZutatenButton = new JButton("Zeige Zutaten");
	private JTable rezeptTable;
	private JScrollPane scrollpane;
	private JLabel einheitHeande = new JLabel();
	private JLabel einheitStueck = new JLabel();
	private String[] columnNames = { "Anzahl", "Einheit", "Farbe", "Zutat" };
	private String[][] rowData = { { "", "", "", "" } };

	public BerryJuiceView() {
		super("Gummibaerensaft Formel");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initComponents(false);
	}

	public void initComponents(boolean data) {
		if (data) {
			rezeptTable = new JTable(rowData, columnNames);
			scrollpane = new JScrollPane(rezeptTable);
			this.add(scrollpane, BorderLayout.PAGE_START);
			this.add(einheitHeande, BorderLayout.LINE_START);
			this.add(einheitStueck, BorderLayout.CENTER);
		}
		this.add(zeigeZutatenButton, BorderLayout.PAGE_END);
		this.pack();
		this.setVisible(true);
	}

	public void setZeigeZutatenListener(ActionListener listener) {
		this.zeigeZutatenButton.addActionListener(listener);
	}
	public void setRowData(String[][] rowData) {
		this.rowData = rowData;
	}
	public JLabel getEinheitHeande() {
		return einheitHeande;
	}
	public JLabel getEinheitStueck() {
		return einheitStueck;
	}
}
