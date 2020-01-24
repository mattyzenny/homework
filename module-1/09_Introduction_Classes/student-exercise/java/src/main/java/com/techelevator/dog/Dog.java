package com.techelevator.dog;

public class Dog {

private boolean sleeping = false;

public String makeSound() {
//	Boolean Dog = Dog;
	if(!sleeping) {
		return "Woof!";
	}
		else 
{
			return "Zzzzz...";
	}
	
}
public void sleep() {
	sleeping = true;
	
	
}

public void wakeUp () {
	sleeping = false;
}






public boolean isSleeping() {
	return sleeping;
}
public void setSleeping(boolean sleeping) {
	this.sleeping = sleeping;
}
	
}
