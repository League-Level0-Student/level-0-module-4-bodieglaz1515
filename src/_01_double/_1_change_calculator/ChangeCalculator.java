package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String meowAsString=JOptionPane.showInputDialog("how much nickles do you have");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
int meowAsInt= Integer.parseInt(meowAsString)*5;
		// Ask the user how many dimes they have, and convert their answer
String meowAsString2= JOptionPane.showInputDialog("how many dimes do you have");
int meowAsInt2= Integer.parseInt(meowAsString2)*10;
		// Ask the user how many quarters they have, and convert their answer
String meowAsString3= JOptionPane.showInputDialog("how many quarters do you have");
int meowAsInt3= Integer.parseInt(meowAsString3)*25;
		// Calculate how much money the user has.  Hint: Use a double variable 
int finalMoney = meowAsInt+meowAsInt2+meowAsInt3;
JOptionPane.showMessageDialog(null,"you have "+finalMoney/100.0+"$");
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

