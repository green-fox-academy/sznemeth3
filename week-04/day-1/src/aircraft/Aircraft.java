package aircraft;

public class Aircraft {

  private Integer maxAmmo;
  private Integer baseDamage;
  private String type;
  private Integer currentAmmo;

  public Integer getCurrentAmmo() {
    return currentAmmo;
  }

  public void setCurrentAmmo(Integer currentAmmo) {
    this.currentAmmo = currentAmmo;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Integer getMaxAmmo() {
    return maxAmmo;
  }

  public void setMaxAmmo(Integer maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public Integer getBaseDamage() {
    return baseDamage;
  }

  public void setBaseDamage(Integer baseDamage) {
    this.baseDamage = baseDamage;
  }

  public Aircraft(Integer maxAmmo, Integer baseDamage) {
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
  }

  public Aircraft() {
  }

  public Integer fight(int currentAmmo) {
    int damage;
    damage = currentAmmo * baseDamage;
    return damage;
  }

  public Integer refill(int ammo) {
    int remaining;
    remaining = maxAmmo - ammo;
    return remaining;
  }
  public void getStatus() {
    System.out.println("This is a base aircraft");
  }
}
