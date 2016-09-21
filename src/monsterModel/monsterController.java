package monsterModel;

import monsterModel.MarshmellowMonster;
import java.util.Scanner;


public class monsterController

{
	private MarshmellowMonster firstMonster;
	private Scanner keyboardInput;
	
	public monsterController()
	{
		firstMonster = new MarshmellowMonster("Derpanite ", 0, 4, 1, 4, false);
		keyboardInput = new Scanner(System.in);
	}
	
	public void start()
	{
		System.out.println("We made monsters today!");
		System.out.print("here is the one i made  " + firstMonster);
		
		System.out.println("Do you want me to change my name??");
		String answer = keyboardInput.nextLine();
		
		if (answer.equalsIgnoreCase("yes"));
		{
			System.out.println("what do you want the name to be??");
		}	String newName = keyboardInput.nextLine();
		firstMonster.setName(newName);
		
		{
		
			System.out.println(" I get to keep my name yay i like it :D");
		
		
	}
	
		System.out.println(firstMonster);
		System.out.println("I have 4 legs and  3 heads");}}
	

