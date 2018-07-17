package com.training.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	
	private Camera camera;
	private Speaker speaker;
	private Screen screen;
	protected Camera getCamera() {
		return camera;
	}
	
	@Autowired
	public void setCamera(Camera camera) {
		this.camera = camera;
	}
	
	public Speaker getSpeaker() {
		return speaker;
	}
	@Autowired
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	public Screen getScreen() {
		return screen;
	}
	@Autowired
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	@Override
	public String toString() {
		return "Mobile [camera=" + camera + ", speaker=" + speaker + ", screen=" + screen + "]";
	}
	
	
	
	
}
