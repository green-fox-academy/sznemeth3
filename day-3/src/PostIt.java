public class PostIt {
  private String backgroundColor;
  private String text;
  private String textColor;

  public PostIt() {

  }

  @Override
  public String toString() {
    return "PostIt{" +
            "backgroundColor='" + backgroundColor + '\'' +
            ", text='" + text + '\'' +
            ", textColor='" + textColor + '\'' +
            '}';
  }

  public PostIt(String backgroundColor) {
    this.backgroundColor = backgroundColor;


  }

  public static void main(String[] args) {
    PostIt first = new PostIt();
    first.backgroundColor = "orange";
    first.text = "Idea 1";
    first.textColor = "blue";
    PostIt second = new PostIt("pink");
    second.text = "Awesome";
    second.textColor = "black";
    PostIt third = new PostIt("yellow");
    third.text = "SuperB";
    third.textColor = "green";
    System.out.println(first.toString());
  }
}
