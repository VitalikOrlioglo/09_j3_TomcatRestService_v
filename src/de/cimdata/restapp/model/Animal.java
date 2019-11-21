package de.cimdata.restapp.model;

public class Animal {
	private String name;
	private String typ;
	private boolean canFly;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String name, String typ, boolean canFly) {
		super();
		this.name = name;
		this.typ = typ;
		this.canFly = canFly;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	
}
