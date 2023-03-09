package Lab1;

import java.util.ArrayList;
import java.util.List;

class Lab3Ex1 {
    public static void main(String[] args)
    {
        List <Parabola> parabole =new ArrayList<Parabola>();
        parabole.add(new Parabola(1, 2, 3));
        parabole.add(new Parabola(3, 4, 5));
        parabole.add(new Parabola(6, 7, 8));
        parabole.add(new Parabola(9, 10, 11));
        System.out.println("Mijloc:");
        System.out.println(Parabola.mijloc(parabole.get(0), parabole.get(1)));
        System.out.println("Lungime:");
        System.out.println(Parabola.lungime(parabole.get(0), parabole.get(1)));
    }
    
}
