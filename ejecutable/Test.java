package ejecutable ;

import modelo.Coordenada;

public class Test{

   public static void main(String[] args) {
        Coordenada c1=new Coordenada(1,2);
        Coordenada c2=new Coordenada(3,4);
        Coordenada c3=new Coordenada(1,2);


        System.out.println("c1 y c2: "+c1.equals(c2));
        System.out.println("c1 y c3: " +c1.equals(c3));
        System.out.println(c1);
        System.out.println("Distancia: "+ c1.distancia(c2));
   }
}