package aircraft;

public class F35 extends Aircraft {

  public F35() {
    setType("F35");
    setMaxAmmo(12);
    setBaseDamage(50);
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
