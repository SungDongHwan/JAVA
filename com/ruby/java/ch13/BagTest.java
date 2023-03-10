package com.ruby.java.ch13;

class Bag<T> {
	private T thing;

	public Bag(T thing) {
		this.thing = thing;
	}

	public T getThing() {
		return thing;
	}

	public void setThing(T thing) {
		this.thing = thing;
	}

	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}
}

class Book {
}

class PencilCase {
}

class Notebook {
}

public class BagTest {

	public static void main(String[] args) {
		Bag<Book> bag = new Bag<>(new Book());
		Bag<PencilCase> bag2 = new Bag<>(new PencilCase());
		Bag<Notebook> bag3 = new Bag<>(new Notebook());

		bag.showType();
		bag2.showType();
		bag3.showType();
		
	//bag = bag2; 에러메세지는 Bag<Book> 의 타입과 Bag<pencilcase>의 타입이 서로 다르닥 오류가 뜬다. 이는 instantinted type 이라고 한다.  
	}
}