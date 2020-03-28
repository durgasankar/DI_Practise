package com.bridgelabz.composition;

import com.bridgelabz.composition.model.Dimension;
import com.bridgelabz.composition.model.Resolution;
import com.bridgelabz.composition.service.Case;
import com.bridgelabz.composition.service.Moniter;
import com.bridgelabz.composition.service.MotherBoard;
import com.bridgelabz.composition.service.PC;

public class Controller {

	public static void main(String[] args) {
		Case newCase = new Case("220B", "Dell", "240", new Dimension(20, 20, 5));

		Moniter newMoniter = new Moniter("750DS1", "Lenovo", 20, new Resolution(1080, 1080));

		MotherBoard newMotherBoard = new MotherBoard("RJ-r20jc134", "HP", 8, 6, "450-TV");

		/**
		 * first power button is switched on after that program is getting loaded and
		 * then pixel is drawn at a particular coordinate.
		 */
		PC newPc = new PC(newCase, newMoniter, newMotherBoard);
		newPc.getTheCase().pressPowerBotton();
		newPc.getMotherboard().loadProgramme("Windows 10.0");
		newPc.getMoniter().drawPixelAt(20, 50, "Red");
	}

}
