import java.util.Objects;

public class CelestialObject {
  private double x = 0.0;
  private double y = 0.0;
  private double z = 0.0;
  private String name = null;
  public static final double KM_IN_ONE_AU = 150_000_000;

  public CelestialObject() {
    x = 0.0;
    y = 0.0;
    z = 0.0;
    name = "Soleil";
  }

  public CelestialObject(String namee, double n1, double n2, double n3) {
    x = n1;
    y = n2;
    z = n3;
    name = namee;
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

  @Override
  public String toString() {
    return String.format("%s is positioned at (%.3f, %.3f, %.3f)", name, x, y, z);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
            return false;
    }
    CelestialObject other = (CelestialObject) obj;

    return (x == other.x) && (y == other.y) && (z == other.z) && !Objects.equals(name, other.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, z, name);
  }
}
