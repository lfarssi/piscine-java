public class Star extends CelestialObject {
    private double magnitude;
     public Star(){
            super();
            this.magnitude = 0.000;
        }
    public Star(String name, double x, double y, double z,double magnitude){
            super(name, x, y, z);
            this.magnitude = magnitude;
        }
    public double getMagnitude(){
        return this.magnitude;
    }
    public void setMagnitude(double  m){
        this.magnitude= m;
        
    }
    @Override
    public String toString() {
        return String.format("%s shines at the %.3f magnitude", super.getName(), this.magnitude);
    }
    @Override
    public boolean equals(CelestialObject other) {
        return super.equals(other);
    }
}
