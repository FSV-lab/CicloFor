

package ciclofor;


public class CicloFor {

    
    public static void main(String[] args) {
       
        for (int i = 0; i < 5; i++) {
            System.out.println("C"+i);
        }
        for (int i = 0 ,j=7000; i < 5; i++ ,j=j/10) {
            System.out.println("el valor de j"+ j);
        }
    }
    
}

//Es posible usar el ciclo for para dibujar o repetir algo hasta determianda numero de veces
//En el segundo ciclo for podemos agregar una variable  y dividirla por un numero se factorizaria.