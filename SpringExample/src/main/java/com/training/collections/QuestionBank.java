package com.training.collections;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {
private String questions;
private List<String> options;
public QuestionBank() {
	options=new ArrayList<String>();
}
public String getQuestions() {
	return questions;
}
public void setQuestions(String questions) {
	this.questions = questions;
}
public List<String> getOptions() {
	return options;
}
public void setOptions(List<String> options) {
	this.options = options;
}
@Override
public String toString() {
	return "QuestionBank [questions=" + questions + ", options=" + options + "]";
}



}
