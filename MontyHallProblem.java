public class MontyHallProblem {
  public static void main(String[] args) {
    int numDoors = 100;
    int repetitions = 100;
    int wouldHaveWon = 0;

    for (int i = repetitions; i > 0; i--) {
      int correctDoor = (int) (Math.random() * numDoors);

      // System.out.println("The random correct door has now been chosen out of the "
      // + numDoors + " options. It is door number " + correctDoor + ".\n");

      int chosenDoor = (int) (Math.random() * numDoors);

      // System.out.println("Now, " + (numDoors - 1) + " doors have been removed from
      // play. The remaining doors are:\n");

      if (chosenDoor == correctDoor) {
        int otherDoor;
        do {
          otherDoor = (int) (Math.random() * numDoors);
        } while (otherDoor != chosenDoor);
        //System.out.println("Chosen door: #" + chosenDoor + " (correct)\n" + "Other door: #" + otherDoor + " (incorrect)");
        //System.out.println("They should NOT have switched doors!");
      } else {
        //System.out.println("Chosen door: #" + chosenDoor + " (incorrect)\n" + "Other door: #" + correctDoor + " (correct)");
        //System.out.println("They SHOULD have switched doors!");
        wouldHaveWon ++;
      }
      System.out.println("\n");
    }
    
    System.out.println("The contestant would have won upon switching doors " + wouldHaveWon + " out of " + repetitions + " times!");
  }
}
