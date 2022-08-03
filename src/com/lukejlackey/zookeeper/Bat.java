package com.lukejlackey.zookeeper;

public class Bat extends Mammal {
	
	public Bat() {
		this.setEnergyLevel(300);
	}
	
	public void fly() {
		this.setEnergyLevel(this.getEnergyLevel()-50);
		System.out.println("*takes off into air*");
		System.out.println("Squeakkkk!");
	}
	
	public void eatHumans() {
		this.setEnergyLevel(this.getEnergyLevel()+25);
		System.out.println("*eats delicious human*");
		System.out.println("*smack* *smack* *lick*");
	}
	
	public void attackTown() {
		this.setEnergyLevel(this.getEnergyLevel()-100);
		System.out.println("*attacks town*");
		System.out.println("Save the children!");
	}
}
