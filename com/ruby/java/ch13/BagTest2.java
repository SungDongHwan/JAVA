package com.ruby.java.ch13;
class Bag2 {
	private Object thing;

	public Bag2(Object thing) {//object 가 type 이고 thing 이 변수이므로 이것은 subclass 인 book. Pencilcase, Notebook을 모두 가질수 있다. 
		this.thing = thing; // thing 은 b2로 가질수 있지만 b2 = thing 을 쓸순 없다. 앞에서 배웠듯이 부모- 자식간의  is a 로 번역되는 = 을 통해서 알수 있다.
	}

	public Object getThing() {
		return thing;
	}

	public void setThing(Object thing) {
		this.thing = thing;
	}

	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}
}

class Book2 {
}

class PencilCase2 {
}

class Notebook2 {
}

public class BagTest2 {

	public static void main(String[] args) {
		Bag2 bag = new Bag2(new Book2());
		Bag2 bag2 = new Bag2(new PencilCase2());
		Bag2 bag3 = new Bag2(new Notebook2());

		bag.showType();
		bag2.showType();
		bag3.showType();
		
		bag = bag2;//error를 발생시키지 않지만 잘 못된 코드이다 
		/*
		Book book = bag.getThing();  -> 이는 오브젝트를 book으로 선언하는것이기때문에 부모class를 자식 class 로 집어넣는것은 불가능하다.이를 해결하기위해 밑에서 TypeCasting 이 실시되었다.
		PencilCase pc = bag2.getThing();
		Notebook nb = bag3.getThing();
		*/
		Book book = (Book)bag.getThing();
		PencilCase pc = (PencilCase)bag2.getThing();
		Notebook nb = (Notebook)bag3.getThing();
	}
}