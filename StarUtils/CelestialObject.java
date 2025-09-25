import java.util.Objects;

public class CelestialObject {
  private double x = 0.0;
  private double y = 0.0;
  private double z = 0.0;
  private String name = null;
  public static final double KM_IN_ONE_AU = 150_000_000;

  public CelestialObject() {
    this.x = 0.0;
    this.y = 0.0;
    this.z = 0.0;
    this.name = "Soleil";
  }

  public CelestialObject(String namee, double n1, double n2, double n3) {
    this.x = n1;
    this.y = n2;
    this.z = n3;
    this.name = namee;
  }

  public double getX() {
    return x;
  }

  public void setX(double n1) {
    x = n1;
  }

  public double getY() {
    return y;
  }

  public void setY(double n1) {
    y = n1;
  }

  public double getZ() {
    return z;
  }

  public void setZ(double n1) {
    z = n1;
  }

  public String getName() {
    return name;
  }

  public void setName(String n1) {
    name = n1;
  }

  public static double getDistanceBetween(CelestialObject a, CelestialObject b) {
    double dis_x = a.x - b.x;
    double dis_y = a.y - b.y;
    double dis_z = a.z - b.z;
    return Math.sqrt(dis_x * dis_x + dis_y * dis_y + dis_z * dis_z);
  }

  public static double getDistanceBetweenInKm(CelestialObject a, CelestialObject b) {

    return getDistanceBetween(a, b) * KM_IN_ONE_AU;
  }

  public String toString() {
    return String.format("%s is positioned at (%.3f, %.3f, %.3f)", name, x, y, z);
  }

  public boolean equals(CelestialObject other) {
   
    if (other == null) {
            return false;
    }

    return (this.x == other.x) && (this.y == other.y) && (this.z == other.z) && (this.name ==other.name);
  }

  public int hashCode() {
    return Objects.hash(x, y, z, name);
  }
}
