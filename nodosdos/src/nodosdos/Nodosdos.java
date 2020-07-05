
package nodosdos;

import java.util.Scanner;


public class Nodosdos {

    
    public static void main(String[] args) {
     
        listasd i = new listasd();
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        do{
        System.out.println("\nELIJA UNA OPCION");
        System.out.println("1. Insertar un nodo");
        System.out.println("2. mostrar lista");
        System.out.println("3. eliminar nodo");
        System.out.println("4. buscar nodo");
        System.out.println("5. salir\n");
            switch(opcion= sc.nextInt()){
             case 1:
                i.insertarnodo();
             break;
             case 2:
                i.imprimirlista();
                break;
             case 3:
                 i.eliminarnodo();
                 break;
             case 4:
                 i.buscarnodo();
                break;
            }
        }while(opcion != 5);
    }
    
}
