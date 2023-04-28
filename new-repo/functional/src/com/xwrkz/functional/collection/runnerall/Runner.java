package com.xwrkz.functional.collection.runnerall;

import com.xwrkz.functional.collection.imp.EatUtil;
import com.xwrkz.functional.collection.imp.GamUtil;
import com.xwrkz.functional.collection.imp.PlayUtil;
import com.xwrkz.functional.collection.imp.RunnEvUtil;
import com.xwrkz.functional.collection.imp.ShootUtil;
import com.xwrkz.functional.collection.imp.Util;
import com.xwrkz.functional.collection.inter.Eater;
import com.xwrkz.functional.collection.inter.Gambler;
import com.xwrkz.functional.collection.inter.Hunter;
import com.xwrkz.functional.collection.inter.Player;
import com.xwrkz.functional.collection.inter.RunnerEvent;
import com.xwrkz.functional.collection.inter.Shooter;

public class Runner {

	public static void main(String[] args) {
		// imp
		Hunter hunter = (t) -> {
			System.out.println("running fun method:" + t);
		};
		Util.test(hunter);
		System.out.println("           ");

//EATER
		Eater eater = ((item, qantity) -> {
			System.out.println("running eater(item):" + item + "   quantity:" + qantity);
			System.out.println("lower case:" + item.toLowerCase());
			System.out.println("upper case:" + item.toUpperCase());
			return qantity + item;
		});
		EatUtil.items(eater);
		System.out.println("           ");

// GAMBLER
		Gambler gambler = ((prin) -> {
			System.out.println("running gambler:" + prin);
			if (prin > 500 && prin < 1000) {
				System.out.println("running gambler:" + prin);
				return 0;
			} else if (prin > 1000) {
				System.out.println("running gambler:" + prin);
				return 100;
			}
			return 1;
		});
		System.out.println(GamUtil.gam(gambler));
		System.out.println("         ");

//PLAYER
		Player player = ((name, state) -> {
			System.out.println("running player name:" + name + "  state:" + state);
			System.out.println("uppercase player name:" + name.toUpperCase());
			System.out.println("lowercase player name:" + name.toLowerCase());
			return name + state;
		});
		PlayUtil.play(player);
		System.out.println("           ");

// SHOOTER
		Shooter shooter = ((type) -> {
			System.out.println("running shooter:" + type);
			return false;
		});
		ShootUtil.gun(shooter);
		System.out.println("           ");
//RUNNER
		RunnerEvent runnerEvent = ((dis) -> {
			System.out.println("running runner:" + dis);
			return false;
		});
		RunnEvUtil.win(runnerEvent);
	}

}
