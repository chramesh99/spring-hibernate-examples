package com.springdependencyinjectionexample;

public class Student {

	private Cheat cheat;

//	public Cheat getCheat() {
//		return cheat;
//	}
//
//	public void setCheat(Cheat cheat) {
//		this.cheat = cheat;
//	}

	public Student(Cheat cheat) {
		this.cheat = cheat;
	}

	public void activateCheat() {
		cheat.cheat();
	}
}
