package Udla.quishpe.s;

import java.util.LinkedList;
import java.util.Queue;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class QueueExample {
    public static void main(String[] args) {

        Queue<Integer> queue=new LinkedList<>();

        for (int i = 0; i <= 5; i++) {

            queue.add(i);
            // Press Mayús+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
        }
        int head = queue.remove();
        System.out.println("head ELIMINADO "+head  );
        System.out.println("La queda "+ queue);

        //Eliminar la cabeza del queue
        // int head= queue.poll();


        int size=queue.size();
        System.out.println("Tiene  "+size+"  elemetos");

        System.out.println("El HEAD DE LA COlA AHORA ES "+queue.peek()); //

        System.out.println("El HEAD DE LA COlA AHORA ES "+queue.poll()); //
        System.out.println("La lista queda "+queue); //


    }

    public void mostarUlitmovalor(){



        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println("Tope de la lsita "+queue);



    }

}