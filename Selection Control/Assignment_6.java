package selectionControl;

//You have x number of $5 notes and y number of $1 notes. You want to purchase an item for amount z.
//The shopkeeper wants you to provide exact change. You want to pay using a minimum number of notes. 
//How many $5 notes and $1 notes will you use?
//Implement a program to find out how many $5 notes and $1 notes will be used. 
//If an exact change is not possible, then display -1.

 
//public class Assignment_6 {
//	public static void main(String[] args) {
//
////		if((fiveNote * 5)<purchaseAmt) {
////			fiveNoteNeeded  = fiveNote;
////			purchaseAmt = purchaseAmt - (fiveNote *5);
////			if(purchaseAmt >=1 && purchaseAmt <= oneNote) {
////				oneNoteNeeded = purchaseAmt;
////				purchaseAmt -= oneNoteNeeded;
////				System.out.println("$1 notes needed = " + oneNoteNeeded);
////				System.out.println("$5 notes needed = "+ fiveNoteNeeded);
////			}
////			else {
////				System.out.println("-1");
////			}
////
////		}else {
////			System.out.println("-1");
////		
////		}
//		
//	}
//}

public class Assignment_6 {
    public static void main(String[] args) {
        int oneNote = 2;
        int fiveNote = 4;
        int purchaseAmt = 21;

        int fiveNoteNeeded = Math.min(fiveNote, purchaseAmt / 5); 
        boolean found = false;

        while (fiveNoteNeeded >= 0) {
            int remaining = purchaseAmt - (fiveNoteNeeded * 5);

            if (remaining <= oneNote && remaining >= 0) { 
                System.out.println("$5 notes needed = " + fiveNoteNeeded);
                System.out.println("$1 notes needed = " + remaining);
                found = true;
                break;
            }

            fiveNoteNeeded--; 
        }

        if (!found) {
            System.out.println("-1");
        }
    }
}

