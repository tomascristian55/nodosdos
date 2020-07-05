package nodosdos;

import java.util.Scanner;

public class listasd {
     nodod primero = new nodod(); //inicio de la lista
    nodod ultimo = new nodod(); //final de la lista
    Scanner teclado = new Scanner(System.in); //leer por consola
    
    public listasd(){
        primero = null;
        ultimo = null;
    }
    
    public void insertarnodo(){ //metodo para insertar un nodo
        nodod nuevo = new nodod ();
        System.out.println("ingrese un dato para el nuevo nodo");
        nuevo.dato = teclado.nextInt();  //se leera y guardara en 'dato'
        if(primero == null){ //validar si la lista esta vacia o no se ha creado
            primero = nuevo;
            primero.siguiente = null; //el 1er num apunta al siguiente que es 0
            ultimo = nuevo; //el valor agregaro se convertira en el ultimo
            
        }//como el num agregado ya no es null entonces..
        else{
            ultimo.siguiente = nuevo;
            nuevo.siguiente = null;
            ultimo = nuevo;
        }
        System.out.println("el nodo ha sido ingresado\n");
    }
    
    public void imprimirlista(){
        nodod actual = new nodod(); //new nodo que permita recorrer la lista
        actual = primero; //que comienze a recorrer desde el inicio
        if(primero != null){ //verificar que existan nodos, para el recorrido
            while(actual !=  null){
                System.out.println(" "+ actual.dato);
                actual = actual.siguiente;
            }
        }
        else{ //si no existen nodos, entonces...
            System.out.println("la lista esta vacia\n");
        }
    }
    
    public void eliminarnodo(){
        System.out.println("ingrese el dato que desea eliminar");
        int nodoelim = teclado.nextInt();
        nodod actual = new nodod();
        nodod anterior = new nodod();
        actual = primero;
        anterior = null;
        while(actual != null){
            if(actual.dato == nodoelim){
                if(actual == primero){
                    primero = primero.siguiente;   
                }else{
                    anterior.siguiente = actual.siguiente;
                }
            }
            anterior = actual;
            actual = actual.siguiente;
        }
        System.out.println("el nodo ha sido eliminado\n");
    }
    public void buscarnodo() {                 
        nodod actual=new nodod();
        actual=primero;
        boolean encontrado=false;
        System.out.println("ingrese el dato que desea buscar buscar");
        int nodobuscado = teclado.nextInt();
        if(primero!=null){
            while(actual != null && encontrado != true){
                if (actual.dato == nodobuscado){
                    System.out.println("\n nodo con el dato " + nodobuscado +  ".....encontrado \n");
                    encontrado = true;
                }
             actual=actual.siguiente;
            }
            if(!encontrado){
              System.out.println("\n nodo no encontrado \n");
            }
        }else{
           System.out.println("pila se encuentra vacia\n");
      }
    
    }
    
}
