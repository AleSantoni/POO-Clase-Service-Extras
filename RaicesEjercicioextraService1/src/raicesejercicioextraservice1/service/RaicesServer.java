/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raicesejercicioextraservice1.service;

import raicesejercicioextraservice1.entidad.Raices;

/**
 *
 * @author BeluS
 */
public class RaicesServer {
   
    //Método getDiscriminante(): devuelve el valor del discriminante (double).
    //El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
   public double getDiscriminante(Raices raiz){
    
       return   Math.pow(raiz.getB(), 2) - 4 * raiz.getA() * raiz.getC();
   } 
   /*
   Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra,
   el discriminante debe ser mayor o igual que 0.

   */
    public boolean tieneRaices(Raices raiz){
       return getDiscriminante(raiz)>=0;
      
    }
    /*
    Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
    para que esto ocurra, el discriminante debe ser igual que 0.
    */
    public boolean tieneRaiz(Raices raiz){
        return getDiscriminante(raiz)==0;
                }
        
    /*
    Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.

    */
    public void  obtenerRaices(Raices raiz){
           if (tieneRaices(raiz)) {
            double x1 = (-raiz.getB() + Math.sqrt(getDiscriminante(raiz))) / (2 * raiz.getA());
            double x2 = (-raiz.getB() - Math.sqrt(getDiscriminante(raiz))) / (2 * raiz.getA());
            System.out.println("Las raices son: " + x1 + " y " + x2);
        } else {
            System.out.println("No tiene raices reales.");
        }
    }
        /*
    Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. 
    Es en el caso en que se tenga una única solución posible.

    */
    public void obtenerRaiz(Raices raiz){
        if (tieneRaiz(raiz)){
                    double x = -raiz.getB() / (2 * raiz.getA());
            System.out.println("La unica raiz es: " + x);
        } else {
            System.out.println("No tiene raiz real unica.");
        }
            
        }
        /*
    Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las 
    posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), 
    según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
    */
        public void calcular(Raices raiz) {
        if (tieneRaices(raiz)) {
            obtenerRaices(raiz);
        } else if (tieneRaiz(raiz)) {
            obtenerRaiz(raiz);
        } else {
            System.out.println("No tiene solucion real.");
        }
    
        }

}
    

