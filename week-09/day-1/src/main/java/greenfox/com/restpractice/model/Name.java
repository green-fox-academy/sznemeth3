package greenfox.com.restpractice.model;

public class Name {
  private String welcome_message;

  public Name(String name, String title) {
    this.welcome_message = "Oh, hi there " +name+ ", my dear " + title + "!";
  }

  public Name() {
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }
}
