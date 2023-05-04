package com.xworkz.musuems.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class EntryFee {
	@Autowired
	private SensoreDoor sensoreDoor;

	public EntryFee(SensoreDoor sensoreDoor) {
		this.sensoreDoor = sensoreDoor;
		System.out.println("running SensoreDoor  in entryfee");
	}

	@Override
	public String toString() {
		return "EntryFee [sensoreDoor=" + sensoreDoor + "]";
	}

}
