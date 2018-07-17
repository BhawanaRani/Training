package com.training.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	
	@Value("${mobile.camera.type}")
	private String type;

	
	
	public Camera() {
		System.out.println("creating Camera");
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Camera [type=" + type + "]";
	}
	
	
	
	

}
