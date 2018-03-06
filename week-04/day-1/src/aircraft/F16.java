package aircraft;

public class F16 extends Aircraft {

  public F16() {
    setType("F16");
    setMaxAmmo(8);
    setBaseDamage(30);
    setCurrentAmmo(0);
  }

  public Integer refill(int ammo) {
    setCurrentAmmo(getCurrentAmmo() + ammo);
    if (getCurrentAmmo() > getMaxAmmo()) {
      int remaining = getCurrentAmmo() - getMaxAmmo();
      setCurrentAmmo(getMaxAmmo());
      return remaining;
    }
    return 0;
  }

  public void getStatus() {
    System.out.println("Type: " + getType() + ", Ammo: " + getCurrentAmmo() + ", Base damage" + getBaseDamage() + ", All damage: "
            + getBaseDamage() * getCurrentAmmo());
  }
}
