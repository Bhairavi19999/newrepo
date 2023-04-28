package com.xwrkz.functional.collection.imp;

import com.xwrkz.functional.collection.inter.Gambler;

public class GamUtil {
	public static double gam(Gambler gambler) {
		return gambler.lost(650);
	}

}
