import java.util.ArrayList;
import java.util.Scanner;

public class hotel {

  private static final int ROOM_COST_DOLLARS = 200;
  private static final int YENEKA_COST_DOLLARS = 150;

  public static void main(String[] args) throws Exception {
    Scanner scnr = new Scanner(System.in);
    ArrayList<room> bookedRooms = new ArrayList<>();
    ArrayList<yeneka> totalYenekas = new ArrayList<>();

    System.out.println("Hello welcome to Christian's Hotel");
    System.out.println();
    System.out.println("Each Room Cost $" + ROOM_COST_DOLLARS + " & each yeneka cost $" +YENEKA_COST_DOLLARS);
    System.out.println();

    System.out.println("How many rooms can I get for you today?");
    int numRooms = scnr.nextInt();

    bookRooms(scnr, bookedRooms, numRooms);

    System.out.println("How many Yenekas can I get for you today?");
    int numYeneka = scnr.nextInt();
    scnr.nextLine();

    yenekas(scnr, totalYenekas, numYeneka);

    printBookedRooms(bookedRooms);
    printYenekas(totalYenekas);
    System.out.println();

    System.out.println("Total cost: $" +((numRooms * ROOM_COST_DOLLARS) + (numYeneka * YENEKA_COST_DOLLARS)));
  }

  private static void bookRooms(
    Scanner scnr,
    ArrayList<room> bookedRooms,
    int numRooms
  ) {
    for (int i = 0; i < numRooms; i++) {
      System.out.println("Room " + (i + 1) + ": ");
      System.out.println("Enter number of beds: ");
      int numBeds = scnr.nextInt();

      System.out.print("Enter number of Bathrooms: ");
      int numBathrooms = scnr.nextInt();

      bookedRooms.add(new room(numBathrooms, numBeds));
      System.out.println("Room booked!");
      System.out.println();
    }
  }

  private static void printBookedRooms(ArrayList<room> bookedRooms) {
    for (int i = 0; i < bookedRooms.size(); i++) {
      System.out.println("Room " + (i + 1) + ":");
      bookedRooms.get(i).printRoom();
      System.out.println();
    }
  }

  private static void yenekas(
    Scanner scnr,
    ArrayList<yeneka> totalYenekas,
    int numYenekas
  ) {
    for (int i = 0; i < numYenekas; i++) {
      System.out.println("Yeneka " + (i + 1) + ":");
      System.out.print("Enter race: ");
      String race = scnr.nextLine();

      System.out.print("Enter description: ");
      String description = scnr.nextLine();

      System.out.print("Enter eye colour: ");
      String eyeColour = scnr.nextLine();

      totalYenekas.add(new yeneka(race, description, eyeColour));
      System.out.println("Yeneka booked!");
      System.out.println();
    }
  }

  private static void printYenekas(ArrayList<yeneka> totalYenekas) {
    for (int i = 0; i < totalYenekas.size(); i++) {
      System.out.println("Yeneka " + (i + 1) + ":");
      totalYenekas.get(i).printYeneka();
      System.out.println();
    }
  }
}
