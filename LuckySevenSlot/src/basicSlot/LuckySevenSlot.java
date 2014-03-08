package basicSlot;

import java.util.Scanner;

public class LuckySevenSlot {
	Scanner input = new Scanner(System.in);
	
	final private int MIN_BET = 5;
	private boolean isOn = false;
	private boolean hasCredits = false;
	private int credits;
	private boolean hasWon = false;
	private final int[] PAYSCALE = {25, 50, 100};
	private final int[] REEL1 = {1, 2, 1, 3, 1};
	private final int[] REEL2 = {2, 2, 3, 1};
	private final int[] REEL3 = {1, 3, 2};
	private final char[] SYMBOLS = {'=','$','7'};
	
	public LuckySevenSlot(int credits) {
		isOn = true;
		while(!hasCredits){
			if (credits >= MIN_BET) {
				hasCredits = true;
				this.credits = credits;
			}
			else {
				System.out.println("Minimum of 5 credits to continue: ");
				credits = input.nextInt();
			}
		}
	}

	public int[] getREEL1() {
		return REEL1;
	}

	public int[] getREEL2() {
		return REEL2;
	}

	public int[] getREEL3() {
		return REEL3;
	}

	public void pullLever(){ 
		int reelOne = (int)(Math.random() * 5);
		int reelTwo = (int)(Math.random() * 4);
		int reelThree = (int)(Math.random() * 3);
		checkWin(reelOne, reelTwo, reelThree);
		printReels(reelOne, reelTwo, reelThree);
	}

	private void checkWin(int one, int two, int three){
		if(REEL1[one] == REEL2[two] && REEL2[two] == REEL3[three]){
			hasWon = true;
			credits += PAYSCALE[REEL1[one] - 1];
			
		}
		else {
			hasWon = false;
			credits -= MIN_BET;
		}
	}
	
	private void printReels(int one, int two, int three) {
		System.out.println(SYMBOLS[REEL1[one]-1] + " " + SYMBOLS[REEL2[two] - 1] + " " + 
						   SYMBOLS[REEL3[three] - 1]);
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public boolean isHasCredits() {
		return hasCredits;
	}

	public void setHasCredits(boolean hasCredits) {
		this.hasCredits = hasCredits;
	}

	public boolean isHasWon() {
		return hasWon;
	}

	public void setHasWon(boolean hasWon) {
		this.hasWon = hasWon;
	}

	public int 
}
