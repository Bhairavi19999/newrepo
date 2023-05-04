package com.xworkz.musuems.thing;

import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Camera {

	private Guide guide;

	public Camera(Guide guide) {
		this.guide = guide;
		System.out.println("running guide in camera");

	}

	@Override
	public String toString() {
		return "Camera [guide=" + guide + "]";
	}

}
