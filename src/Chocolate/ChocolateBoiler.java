/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chocolate;

/**
 * Code used for SYST17796 final exam Part D.
 * This class represents a ChocolateBoiler. 
 * A class that is responsible for making chocolates.
 * It has the fill, drain and boil methods which are required 
 * to prepare chocolate.
 * @author sheetal, 2019
 */
public class ChocolateBoiler {
        public boolean empty;
	public boolean boiled;
  
	public ChocolateBoiler() {
		empty = true;
		boiled = false;
                System.out.println("Creating an instance of Chocolate Boiler");
	}

        //A method to fill the boiler with a milk/chocolate mixture
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			
		}
	}
 
        //A method to drain the boiled milk and chocolate
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			empty = true;
		}
	}
        
        //Method to bring the contents to a boil
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			boiled = true;
		}
	}

    /**
     * @return the empty
     */
    public boolean isEmpty() {
        return empty;
    }

    /**
     * @return the boiled
     */
    public boolean isBoiled() {
        return boiled;
    }
  
	
}
