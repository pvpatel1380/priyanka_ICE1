/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author priyanka patel
 * student id-991631059
 */
public class CardTrick 
{
    public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            magicHand[i] = new Card(SUITS[(int)(Math.random()*4)],(int)(Math.random()*13)+1 );
           // Card c = new Card();
            
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        for (int i=0; i<magicHand.length; i++)
	{
            System.out.println ( magicHand[i].toString() );
        }
        Scanner input = new Scanner (System.in);

		System.out.println("Choose type of Card (diamonds,spades,club and hearts)");
		String userSuit = input.nextLine();
		System.out.println("Choose a Card Number(1-13)");
		int userValue = input.nextInt();
                
        Card userCard = new Card(userSuit,userValue);

		for(int i=0; i<magicHand.length;i++)
		{
			magicHand[i] = userCard;

		}
            
		if(magicHand[0] == userCard)
		{
			System.out.println("Congrats your card matched");
		}
		else if(magicHand[1] == userCard)
		{
			System.out.println("Congrats your card matched");
		}
		else if(magicHand[2] == userCard)
		{
			System.out.println("Congrats your card matched");
		}
		else if(magicHand[3] == userCard)
		{
			System.out.println("Congrats your card matched");
		}
		else if(magicHand[4] == userCard)
		{
			System.out.println("Congrats your card matched");
		}
		else if(magicHand[5] == userCard)
		{
			System.out.println("Congrats your card matched");
		}
		else if(magicHand[6] == userCard)
		{
			System.out.println("Congrats your card matched");
		}
		else
		{
			System.out.println("Sorry your card doesn't matched");
		}
                
                userCard.toString();
                System.out.println("Your card:");
                System.out.println("Suit:"+userSuit );
                System.out.println("Value:"+userValue );
      


    }

}


        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    
    

