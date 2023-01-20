package com.ruby.java.test1;

public class Armor {
	 private String name;
	 private int height;
	 private String Color;
	 private boolean isFly;
	 
	 public void setHeight (int value) {
	 height = value;
 }
	 public void setName () {
		 String Value = "mark6";
		 name = Value;
		 
	 }
	 public boolean takeoff() {
		 System.out.println("엔진 시동");
		 return false;
	 }
}
