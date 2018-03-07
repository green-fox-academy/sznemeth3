package greenfox;

public class Student extends Person implements Cloneable {
  private String previousOrganization;
  private int skippedDays;

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }
  public void introduce() {
    System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() + "year old" + this.getGender() + "from" + previousOrganization
            + "who skipped " + skippedDays + "days from the course already.");
  }
  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }

  public Student(String name, Integer age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    skippedDays = 0;
  }

  public Student() {
    previousOrganization = "The School of life";
    skippedDays = 0;
  }

  public Object clone() throws CloneNotSupportedException{
    return super.clone();
  }
}
