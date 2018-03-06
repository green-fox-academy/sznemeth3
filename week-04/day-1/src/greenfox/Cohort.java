package greenfox;

import java.util.ArrayList;

public class Cohort {
  private String name;
  private ArrayList<Student> students;
  private ArrayList<Mentor> mentors;

  public void addStudent(Student student) {
    students.add(student);
  }
  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }
  public void info() {
    System.out.println("The " + name + "cohort has " + students.size() + "students and " + mentors.size() + "mentors.");
  }

  public Cohort(String name) {
    this.name = name;
    this.students = new ArrayList<>();
    this.mentors = new ArrayList<>();
  }

  public static void main(String[] args) {
    ArrayList<Person> people = new ArrayList<>();

    Person mark = new Person("Mark", 46, "male");
    people.add(mark);
    Person jane = new Person();
    people.add(jane);
    Student john = new Student("John Doe", 20, "male", "BME");
    people.add(john);
    Student student = new Student();
    people.add(student);
    Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
    people.add(gandhi);
    Mentor mentor = new Mentor();
    people.add(mentor);
    Sponsor sponsor = new Sponsor();
    people.add(sponsor);
    Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX");
    people.add(elon);

    student.skipDays(3);

    for (int i = 0; i < 5; i++) {
      elon.hire();
    }

    for (int i = 0; i < 3; i++) {
      sponsor.hire();
    }

    for(Person person : people) {
      person.introduce();
      person.getGoal();
    }

    Cohort awesome = new Cohort("AWESOME");
    awesome.addStudent(student);
    awesome.addStudent(john);
    awesome.addMentor(mentor);
    awesome.addMentor(gandhi);
    awesome.info();
  }
}
