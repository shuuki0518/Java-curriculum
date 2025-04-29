package sushiMain;

import sushiLogic.sushiDousa;

public class sushiJikkou {

	public static void main(String[] args) {
		
		 sushiDousa msg = new sushiDousa();

	     System.out.println(msg.getAisatsu());
	     System.out.println(msg.getTasteComment());
	     System.out.println(msg.getCategoryComment());
	     System.out.println(msg.getCurrentDateTime());
		
	}

}
