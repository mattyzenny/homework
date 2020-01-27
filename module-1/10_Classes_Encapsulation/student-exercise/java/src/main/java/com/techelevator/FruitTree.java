package com.techelevator;

public class FruitTree {

//INSTANCE VARIABLES//
	private String typeOfFruit;
	private int piecesOfFruitLeft;
	
	
	
	
//CONSTRUCTOR//
	public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
		this.typeOfFruit = typeOfFruit;
		this.piecesOfFruitLeft = startingPiecesOfFruit;
	}
	
	
	
	//METHOD//
	public boolean pickFruit(int numberOfPiecesToRemove) {
		if (piecesOfFruitLeft >= numberOfPiecesToRemove) {
			piecesOfFruitLeft = piecesOfFruitLeft - numberOfPiecesToRemove;
			return true;
		}
		else {
			return false;
		}
	
	}
	
	
	
	
	
	
	
	
	//GETTERS/SETTERS//
	public String getTypeOfFruit() {
		
		return typeOfFruit;
	}
	public int getPiecesOfFruitLeft() {
		return piecesOfFruitLeft;
	}
	
}
