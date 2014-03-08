package basicSlot;

import java.util.Scanner;

public class LuckySevenSlotTest {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int credits = 0;
		System.out.println("Would you like to play? (y/n) ");
		if (input.next().substring(0,1).equalsIgnoreCase("y")){

			System.out.println("Insert credits: (min 5) ");
			credits = input.nextInt();
			LuckySevenSlot mySlot = new LuckySevenSlot(credits);

			for (int i = 0; i < 100; i++) {
				mySlot.pullLever();
				System.out.print(mySlot.isHasWon() + "   ");
				System.out.println(mySlot.getCredits());
			}
		}

		else {
			System.out.println("Goodbye ");
			System.exit(0);
		}
	}
}
