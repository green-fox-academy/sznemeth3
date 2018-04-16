package greenfox.com.restpractice.model;

public class ErrorMsg {
  private String error;

  public ErrorMsg(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
