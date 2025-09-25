public class CelestialObject {
    public double x = 0.0;
    public double y = 0.0;
    public double z = 0.0;
    public String name =null;
    public CelestialObject(){
      x = 0.0;
      y = 0.0;
      z = 0.0;
      name = "Soleil";
    }
    public CelestialObject( String namee, double n1, double n2, double n3){
        x=n1;
        y=n2;
        z=n3;
        name=namee;
    }
}
