package greenfox.com.restpractice.model;

public class Input {
  private Long received;
  private Long result;

  public Input(Long input) {
    this.received = input;
    this.result = input * 2;
  }

  public Input() {
  }

  public Long getReceived() {
    return received;
  }

  public void setReceived(Long received) {
    this.received = received;
  }

  public Long getResult() {
    return result;
  }

  public void setResult(Long result) {
    this.result = result;
  }
}
