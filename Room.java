public class Room {

  private int bathroom;
  private int bed;

  public Room(int bathroom, int bed) {
    if (bathroom >= 3 || bed >= 3) {
      this.bathroom = -1;
      this.bed = -1;
    } else {
      this.bathroom = bathroom;
      this.bed = bed;
    }
  }

  public int getBathroom() {
    return bathroom;
  }

  public int getBed() {
    return bed;
  }

  public void printRoom() {
    if (bathroom == -1 || bed == -1) {
      System.out.println(
        "You exceeded the amount of beds or bathrooms you can have in a room."
      );
    } else {
      System.out.println(bathroom + " X Bathrooms");
      System.out.println(bed + " X Beds");
    }
  }
}
