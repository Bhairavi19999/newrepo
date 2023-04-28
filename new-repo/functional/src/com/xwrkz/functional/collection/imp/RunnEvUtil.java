package com.xwrkz.functional.collection.imp;

import com.xwrkz.functional.collection.inter.RunnerEvent;

public class RunnEvUtil {
	public static boolean win(RunnerEvent runnerEvent) {
		return runnerEvent.event(10.2);
	}

}
