    import java.util.Objects;

    public class Planet extends CelestialObject {
    private Star centerStar;
    public Planet(){
        super();
        this.centerStar = new Star("Sun", 0.0, 0.0, 0.0, 0.000);
    }
    public Planet(String name, double x, double y, double z, Star centerStar){
            super(name, x, y, z);
            this.centerStar = centerStar;
    }
    public Star getCenterStar(){
        return this.centerStar;
    }
    public void setCenterStar(Star center){
        this.centerStar= center;
    }
        @Override
        public String toString() {
    if (this.centerStar == null) {
                return String.format("%s circles around no star at the %.3f AU", super.getName(), 0.000);
            }
            return String.format("%s circles around %s at the %.3f AU", super.getName(), this.centerStar.getName(), super.getDistanceBetweenInKm(this, this.centerStar) / super.KM_IN_ONE_AU);    
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
            return this.getName() == o.getName() &&
                this.getX() == o.getX() &&
                this.getY() == o.getY() &&
                this.getZ() == o.getZ() &&
                this.centerStar == o.centerStar;
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.getName(), super.getX(), super.getY(), super.getZ(), this.centerStar);
        }
    }
