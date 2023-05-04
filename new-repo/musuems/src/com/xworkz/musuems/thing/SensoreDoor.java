package com.xworkz.musuems.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class SensoreDoor {
	@Autowired
	private Camera camera;

	public SensoreDoor(Camera camera) {
		this.camera = camera;
		System.out.println("running camera in sensoredoor");
	}

	@Override
	public String toString() {
		return "SensoreDoor [camera=" + camera + "]";
	}

}
