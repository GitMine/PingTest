package com.xx.xx.cow;

class Cow {
	int age;

	public Cow(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	Cow giveBirth() {

		return new Cow(0);

	}

}
