import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class graphicalInput extends JFrame
	{
	private static final long serialVersionUID = 1L;
	static String name; 
	static int className;
	static JFrame frame = new JFrame();

	public static void main(String[] args)
	    {
	    	
	    	chooseAdventure();
	    	
	    //takes input
		name = JOptionPane.showInputDialog(
				"What is your name?");  
		JOptionPane.showMessageDialog(
				frame, 
				"Hi, " + name);
		
		//buttons
		Object[] options = {"Druid", "Ranger", "Monk"};
		className = JOptionPane.showOptionDialog(
				frame, 
				"What class would you like to be?",
				"Your Vocation",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, 
				options, 
				options[0]);  //makes first option the default
		 
		//responds to button choice above
		switch(className)
			{
			case 0:
				{
				JOptionPane.showMessageDialog(
						frame, 
						"Ah, a nature lover...God's first Bible...");
				break;
				}
			case 1:
				{
				JOptionPane.showMessageDialog(
						frame, 
						"Ah, another Aragorn wannabe, eh?");
				break;
				}
			case 2:
				{
				JOptionPane.showMessageDialog(
						frame, 
						"If I had to do it all over again... Trappist monk...");
				break;
				}
			}
		
		// drop-down menu
		final String[] genre = { "Dungeon", "Wilderness", "Sci-Fi", "Random" };
		final JFrame frame = new JFrame();
	    String adventureType = (String) JOptionPane.showInputDialog(frame, 
	            "What type of adventure would you like to experience?",
	            "Adventure Genre",
	            JOptionPane.QUESTION_MESSAGE, 
	            null, 
	            genre, 
	            genre[0]);
	    
	    //generic response to drop-down choice above
	    JOptionPane.showMessageDialog(
	    		frame, 
	    		"Oh dear, you have no idea what you've just done...");    
		      }
		//--------------------------------------------------------------------------------------------------------------------------------------------------------//
	
	
	
	
	
	    //--------------------------------------------------------------------------------------------------------------------------------------------------------//
public static void chooseAdventure()
	{
		Scanner userInput = new Scanner (System.in);
//System.out.println("Hello adventerer! Are you ready to begin your quest to get the enchanted sword?");
//		String response = userInput.nextLine();
//	System.out.println("Either way, you will go.");

	
		String beginning = JOptionPane.showInputDialog(
				"Hello adventerer! Are you ready to begin your quest to get the enchanted sword?");  
		JOptionPane.showMessageDialog(
				frame, 
				"Either way, you will go.");
		
	
	Object[] firstChoice = {"The cave", "The forest",};
	className = JOptionPane.showOptionDialog(
			frame, 
			"Your journey starts at a fork in the road, ahead of you are a cave and a forest path. Which way will you go?",
			"Your First Choice",
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null, 
			firstChoice, 
			(null));  //makes first option the default
		
//	System.out.println("Your journey starts at a fork in the road, ahead of you are a cave and a forest path. Which wy will you go?");
//	System.out.println("1. The cave");
//	System.out.println("2. The Forest");
//	int firstChoice = userInput.nextInt();
	
	switch(className)
	{
	case 0:
		{
			Object[] bigDog = {"Throw a rock at him", "Give him your lunch",};
			className = JOptionPane.showOptionDialog(
					frame, 
					"You enter the cave and see a big dog guarding a pedestal with a sword sticking out of it. He looks hungry... What do you do?",
					"Big Dog",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, 
					bigDog, 
					(null));
			//wse;fuihei;fcbhnfc
			switch(className)
			{
			case 0:
				//;ksdfhpsei;uffwi;ufnr 
				{
					JOptionPane.showMessageDialog(
				    		frame, 
				    		"He starts growling and attacks you.");  
				//sldfkjshfhsefuiphfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff
					//sd;fljhsdfkl;jsdfjnf
					//kl;sjbhfdjkbf
					
					int randomNumber = (int) (Math.random()*2);
								
								if (randomNumber==0)
									//slkdfjgsdljfdjlfb
									{
										   JOptionPane.showMessageDialog(
										    		frame, 
										    		"Try as you might, you cannot overcome him and your journey ends.");  
										
										System.exit(0);
									}
								
								else
									{
										JOptionPane.showMessageDialog(
									    		frame, 
									    		"You manage to fend him off with your sword, but not before you sustain bad injuries. You return home to heal and come back another day.");  
									
										System.exit(0);
									}
					
				}
				
			case 1:
				{
					JOptionPane.showMessageDialog(
				    		frame, 
				    		"The dog swiftly and happily eats your lunch. You walk up to the pedastal,"
				    		+ "and pull the enchanted sword from the stone. You return home with your weapon, and a newfound best friend.");  
				
					System.exit(0);
				}
				
			}
			
		}
		
	case 1:
		{
			Object[] forest = {"Fight the Bandits", "Sneak into the camp",};
			className = JOptionPane.showOptionDialog(
					frame, 
					"You walk into the forest and meet a camp of bandits with a treasure chest in one of their tents. What will you do?",
					"Bandits",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, 
					forest, 
					(null));
		
			switch(className)
			{
			case 0:
				{
					int randomNumber = (int) (Math.random()*2);
					
					if (randomNumber==0)
						{
							
							JOptionPane.showMessageDialog(
						    		frame, 
						    		"Try as you might, you cannot overcome the trio of bandits as they overwhelm and defeat you.");  
							
							System.exit(0);
						}
					
					else
						{
							JOptionPane.showMessageDialog(
						    		frame, "You manage to defeat 2 of the bandits, but the third lands an arrow in your knee, forcing retreat. "
						    				+ "You return home to heal and come back another day.");
							
							System.exit(0);
						}
					
				}
				
			case 1:
				{
					System.out.println("You sneak into the camp, crawling under boxes and sneaking behind tents.");
					int randomNumber = (int) (Math.random()*2);
					
					if (randomNumber==0)
						{
							JOptionPane.showMessageDialog(
						    		frame, "However, as you sneak into the tent with the chest, you nock over a can, making a loud noise. The bandits are alerted, and your journey quickly ends.");
							System.exit(0);
						}
					
					else
						{
							JOptionPane.showMessageDialog(
						    		frame, "You successfully open the chest and discover the enchanted sword, leaving the camp with great success.");
							System.exit(0);
						}
				}
		}
		
	}
	
//	if (firstChoice==1)
//		{
//			System.out.println("You enter the cave and see a big dog guarding a pedestal with a sword sticking out of it. He looks hungry... What do you do?");
//			System.out.println("1. Throw a rock at him");
//			System.out.println("2. Give him your lunch");
//			int first1Choice = userInput.nextInt();
//			if (first1Choice==1)
//				{
//					System.out.println("He starts growling and attacks you.");
//					int randomNumber = (int) (Math.random()*2);
//								
//								if (randomNumber==0)
//									{
//										System.out.println("Try as you might, you cannot overcome him and your journey ends.");
//									}
//								
//								else
//									{
//										System.out.println("You manage to fend him off with your sword, but not before you sustain bad injuries. You return home to heal and come back another day.");
//									}
//							
//						
//				}
//			else if (first1Choice==2)
//				{
//					System.out.println("The dog swiftly and happily eats your lunch. You walk up to the pedastal, "
//							+ "and pull the enchanted sword from the stone. You return home with your weapon, and a newfound best friend.");
//				}
//			else 
//				{
//					System.out.println("You picked a wrong number and combust from stupidity.");
//				}
//	----------------------------------------------------------------------------------------------------------------------------------------------------
//		}
//	else if (firstChoice==2)
//		{
//			System.out.println("You walk into the forest and meet a camp of bandits with a treasure chest in one of their tents. What will you do?");
//			System.out.println("1.Fight the Bandits");
//			System.out.println("2.Sneak into the camp");
//			int first2Choice = userInput.nextInt();
//			if (first2Choice==1)
//				{
//					System.out.println("You announce your presence and you wish to fight. Where do you start?");
//					System.out.println("1.Attack the ranged Bandit");
//					System.out.println("2.Attack the knife Bandit");
//					System.out.println("3.Attack the axe Bandit");
//					int banditAttack = userInput.nextInt();
//					
//					
//					
//					
//					
//					
//					
//					
//				}
//			else if (first2Choice==2)
//				{
//					System.out.println("You sneak into the camp, crawling under boxes and sneaking behind tents.");
//					int randomNumber = (int) (Math.random()*2);
//					
//					if (randomNumber==0)
//						{
//							System.out.println("However, as you sneak into the tent with the chest, you nock over a can, making a loud noise. The bandits are alerted, and your journey quickly ends.");
//						}
//					
//					else
//						{
//							System.out.println("You successfully open the chest and discover the enchanted sword, leaving the camp with great success.");
//						}
//				}
//		}	
	}
}
}

