/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_eduardovaldez;

import java.util.Scanner;

/**
 *
 * @author guali
 */
public class Lab2P1_EduardoValdez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Ejercicio 1: 1");
         System.out.println("Ejercicio 2: 2");
         System.out.println("Ejercicio 3: 3");
         System.out.println("Salir del programa:4");
         System.out.println("Ingrese el numero del ejercicio al que quiera acceder");
         int opcion = scanner.nextInt();
         
         while (opcion>0 || opcion <5)
             if(opcion == 1){
                System.out.println("Ingrese longitud a");
                int longa = scanner.nextInt();
                System.out.println("Ingrese longitud b");
                int longb = scanner.nextInt();
                System.out.println("Ingrese longitud c");
                int longc = scanner.nextInt();
                if(longa>0 & longb>0 & longc>0){
                        if(longa+longb>longc & longb+longc>longa & longc+longa>longb){
                           System.out.println("las longitudes si forman un triangulo");
                        }else{
                                   System.out.println("las longitudes no forman un triangulo");                    
                    }
       
             }else{
                    System.out.println("Las longitudes no pueden ser negativas");
                }

         }
             else if (opcion == 2){
             char resp = 's';
             while (resp == 's' || resp == 'S'){
             System.out.println("Ingrese la figura a la que le quiere calcular el area");
             System.out.println("Triangulo: 1");
             System.out.println("Rectangulo: 2");
             System.out.println("Circulo: 3");
             System.out.print("Figura: ");
             int figura = scanner.nextInt();
             if (figura == 1){
                 System.out.print("Ingrese la base: ");
                 int base = scanner.nextInt();
                 System.out.print("Ingrese la altura: ");
                 int altura = scanner.nextInt();
                 double area = 0.5*base*altura;
                 System.out.println("el area del triangulo es: "+ area);
                 
                    }else if (figura == 2){
                        System.out.print("Ingrese la base: ");
                        int base = scanner.nextInt();
                        System.out.print("Ingrese la altura: ");
                        int altura = scanner.nextInt();
                        double area = base*altura;
                        System.out.println("el area del rectangulo es: "+ area);
          
                        }else if (figura == 3){
                            System.out.print("ingrese el radio: ");
                            int radio = scanner.nextInt();
                            double area = Math.PI * Math.pow(radio, 2);
                            System.out.println("El area del circulo es: " + area);
                                    
                        }System.out.println("desea calcular otra area[s/n]: ");
                        resp = scanner.next().charAt(0);
                        }  
         }
             else if (opcion == 3){
                 System.out.print("Ingrese un numero: ");
                 int numero = scanner.nextInt();
                 boolean par = false;
                 boolean primo = false;
                 int contdiv = 0;
                 int cont = 1;
                 if (numero % 2 == 0){
                     par = true;
                 }
                 while (cont<=numero){
                     if(numero % cont == 0){
                        contdiv ++; 
                 }
                 cont ++;
                 
             }
                if (contdiv == 2){
                    primo = true;            
    }
                if (par==true & primo==true){
                    System.out.println("El numero es par y primo");
                }else if (par==true & primo==false){
                        System.out.println("El numero es par");
                    }else if (par == false & primo == true){
                        System.out.println("el numero es impar y primo");    
                }else if (par == false & primo ==false){
                    System.out.println("el numero es impar");
                }
                    
}
             else if (opcion == 4){
                 System.out.println("salio del programa");
                 opcion = 0;
             }
    }
}
    
  
    

