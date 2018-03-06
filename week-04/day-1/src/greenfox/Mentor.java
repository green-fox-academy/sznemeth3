package greenfox;

public class Mentor extends Person {
  private String level;

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }
  public void introduce() {
    System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() +  "year old " + this.getGender() + level.toString() + " mentor.");
  }

  public Mentor() {
    super();
    this.level = "intermediate";
  }

  public Mentor(String name, Integer age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }
}
