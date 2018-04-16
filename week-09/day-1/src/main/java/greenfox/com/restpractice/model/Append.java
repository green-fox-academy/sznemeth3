package greenfox.com.restpractice.model;

public class Append {
  private String appended;

  public Append(String appended) {
    this.appended = appended + 'a';
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
