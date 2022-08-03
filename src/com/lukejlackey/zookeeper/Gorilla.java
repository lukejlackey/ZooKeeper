package com.lukejlackey.zookeeper;

public class Gorilla extends Mammal{
	public Gorilla() {
		super();
	}
	
	public void throwSomething() {
		this.setEnergyLevel(this.getEnergyLevel()-5);
		System.out.println("*throws something*");
		System.out.println("OOooOOOo OoOOoo OoooOo!");
	}
	
	public void eatBananas() {
		this.setEnergyLevel(this.getEnergyLevel()+10);
		System.out.println("*eats bananas*");
		System.out.println("Ooooooo!");
	}
	
	public void climb() {
		this.setEnergyLevel(this.getEnergyLevel()-10);
		System.out.println("*climbs*");
		System.out.println("Ooo Ooo.");
	}
}
