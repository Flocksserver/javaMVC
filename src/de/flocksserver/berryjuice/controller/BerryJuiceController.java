package de.flocksserver.berryjuice.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import de.flocksserver.berryjuice.model.BerryJuiceModel;
import de.flocksserver.berryjuice.view.BerryJuiceView;

/**
 * 
 * 
 * @author marcel
 *
 */
public class BerryJuiceController {
	private BerryJuiceModel model;
	private BerryJuiceView view;
	
	public BerryJuiceController() {
		model = new BerryJuiceModel();
		view = new BerryJuiceView();
		
		view.setZeigeZutatenListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setRowData(model.getGummiberryZutaten());
				view.getEinheitHeande().setText(model.getAnzahlEinheitHeande());
				view.getEinheitStueck().setText(model.getAnzahlEinheitStueck());
				view.initComponents(true);
			}
		});
	}
}
