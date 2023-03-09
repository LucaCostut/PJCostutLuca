package Lab1;

import java.util.Arrays;

class Parabola {
    private  double a;
    private  double b;
    private  double c;
    public Parabola (double a,double b,double c)
    {
        super();
        this.a = a;
        this.b = b;
        this.c = c;

    }
    public String toString(){
        return String.format("f(x) = %.2f x^2 + %.2f x + %.2f", a, b, c);
    }
    public static double[] mijloc (Parabola p1,Parabola p2)
    {
        double a1 = p1.a;
        double b1 = p1.b;
        double c1 = p1.c;
        double a2 = p2.a;
        double b2 = p2.b;
        double c2 = p2.c;


        double x1 = -b1/(2*a1);
        double x2 = -b2/(2*a2);
        double y1 = -1 * (b1 * b1 - 4 * a1 * c1) / (4 * a1);
        double y2 =  -1 * (b2 * b2 - 4 * a2 * c2) / (4 * a2);
        
        double xMij = (x1+x2)/2;
        double yMij = (y1+y2)/2;
        
        double[] mijloc = {xMij,yMij};
        
        
        System.out.println("Midpoint coordinates: " + Arrays.toString(mijloc));
        return mijloc;
    }
    public static double lungime (Parabola p1,Parabola p2)
    {
        double a1 = p1.a;
        double b1 = p1.b;
        double c1 = p1.c;
        double a2 = p2.a;
        double b2 = p2.b;
        double c2 = p2.c;


        double x1 = -b1/(2*a1);
        double x2 = -b2/(2*a2);
        double y1 = -1 * (b1 * b1 - 4 * a1 * c1) / (4 * a1);
        double y2 =  -1 * (b2 * b2 - 4 * a2 * c2) / (4 * a2);
        double distance =(double) Math.hypot(x2 - x1, y2 - y1);
        return distance;
    }
}
