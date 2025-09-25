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
        return this.centerStar;
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
    public boolean equals(Object order) {
        if (order == null) {
            return false;
        }
        if (order == this) {
            return true;
        }
        if (order.getClass() != this.getClass()) {
            return false;
        }
        Planet o = (Planet) order;
        if (this.getName().equals(o.getName()) && this.getX() == o.getX() && this.getY() == o.getY() && this.getZ() == o.getZ() && this.centerStar.equals(o.centerStar)) {
            return true;
        }
        return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.getName(), super.getX(), super.getY(), super.getZ(), this.centerStar);
    }
}