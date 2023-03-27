public class yeneka {

  private String race;
  private String description;
  private String eyeColour;

  public yeneka(String race, String description, String eyeColour) {
    String anyCase = race.toLowerCase();

    switch (anyCase) {
      case "black":
      case "latina":
      case "arab":
      case "asian":
      case "european":
        this.race = anyCase;
        break;
      default:
        System.out.println("DONKEY");
    }
    this.description = description;
    this.eyeColour = eyeColour;
  }

  public String getRace() {
    return race;
  }

  public String getDescription() {
    return description;
  }

  public String getEyeColour() {
    return eyeColour;
  }

  public void printYeneka() {
    System.out.println("Race " + this.race);
    System.out.println("Description " + description);
    System.out.println("Eye colour " + eyeColour);
  }
}
