/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chocolate;

/**
 * Code used for SYST17796 final exam Part D.
 * This class represents a ChocolateController. 
 * A class that is responsible for creating object of ChocolateBoiler.
 * @author sheetal, 2019
 */
public class ChocolateController {
    public static void main(String args[]) {
		ChocolateBoiler boiler = new ChocolateBoiler();
		boiler.fill();
		boiler.boil();
		boiler.drain();

	}
}
