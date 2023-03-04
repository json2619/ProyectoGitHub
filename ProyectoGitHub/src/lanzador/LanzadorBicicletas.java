package lanzador;

import bici.BiciMTB;
import suspensiones.Suspensiones;

public class LanzadorBicicletas {

	public static void main(String[] args) {

		BiciMTB miBici = new BiciMTB("TREK", "X Caliber 9", Suspensiones.DELANTERA, (byte) 1, true, 2000.50f, (short) 0,
				false);
		BiciMTB miBici2 = new BiciMTB("TREK", "X Caliber 9", Suspensiones.DOBLE, (byte) 1, true, 1500.50f, (short) 0,
				false);
		BiciMTB miBici3 = new BiciMTB("TREK", "X Caliber 10", Suspensiones.DOBLE, (byte) 1, true, 1700.50f, (short) 10,
				false);
		System.out.println(miBici.toString());
		miBici.acelerar();
		miBici.estropear();
		miBici.acelerar();
		miBici.reparar();
		miBici.acelerar();
		miBici.acelerar();

	}

}
