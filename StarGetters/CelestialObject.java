public class CelestialObject {
    private double x = 0.0;
    private double y = 0.0;
    private double z = 0.0;
    private String name =null;
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
    public  double getX(){
      return x;
    }
    public double setX(double n1){
        x = n1;
      return x;
      }
       public  double getY(){
      return y;
    }
    public double setY(double n1){
        y = n1;
      return y;
      }
        public  double getZ(){
      return z;
    }
    public double setZ(double n1){
        z = n1;
      return z;
      }
        public  String getName(){
      return name;
    }
    public String setName(String n1){
        name = n1;
      return name;
      }
}
