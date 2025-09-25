import java.util.Objects;

public class Planet extends CelestialObject {
    private Star centerStar;

    public Planet() {
        super();
        this.centerStar = new Star();
    }

    public Planet(String name, double x, double y, double z, Star star) {
        super(name, x, y, z);
        this.centerStar = star;
    }

    public Star getCenterStar() {
        return centerStar;
    }

    public void setCenterStar(Star center) {
        this.centerStar = center;
    }

    @Override
    public String toString() {
        double distanceInAU = CelestialObject.getDistanceBetween(this, this.centerStar);
        return String.format("%s circles around %s at the %.3f AU", getName(), centerStar.getName(), distanceInAU);
    }

    @Override
    public boolean equals(CelestialObject other) {
        if (other == null) {
            return false;
        }
        if (!(other instanceof Planet)) {
            return false;
        }
        Planet o = (Planet) other;
        return super.equals(o) && Objects.equals(centerStar, o.centerStar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getName(), super.getX(), super.getY(), super.getZ(), this.centerStar);
    }
}