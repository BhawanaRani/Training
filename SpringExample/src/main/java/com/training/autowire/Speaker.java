package com.training.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Speaker {
@Value("${mobile.speaker.type}")
private String type;
@Value("${mobile.speaker.volume}")
private int volume;



public Speaker() {
	System.out.println("creating speaker");
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getVolume() {
	return volume;
}
public void setVolume(int volume) {
	this.volume = volume;
}
@Override
public String toString() {
	return "Speaker [type=" + type + ", volLevles=" + volume + "]";
}



}
