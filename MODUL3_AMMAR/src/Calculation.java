public class Calculation implements Runnable {
   
    public double side, area, radius;
    public double phi = 3.14;
    
    public void setSquare(double panjang)  {
        if (panjang >= 1){
            this.side = panjang;
            this.area = panjang * panjang;
          } else {
            throw new IllegalArgumentException("Side cannot 0");
          }
        }
    
        public double getSquare() {
            return area;
          }
    
        public void setCircle(double r)  {
            this.radius = r;
            this.area = phi * r * r;
          }
    
          public double getCircle() {
            return area;
          }
    
          public void setTrapezoid(double a, double b, double t)  {
           this.area = 0.5 * (t * (a + b));
          }
    
          public double getTrapezoid() {
            return area;
          }
    
        @Override
        public void run() {
            System.out.println();
            System.out.println("Program will start in");
            for (int i = 3; i >= 1; i--) {
                System.out.println("Starting with thread " + i);
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
