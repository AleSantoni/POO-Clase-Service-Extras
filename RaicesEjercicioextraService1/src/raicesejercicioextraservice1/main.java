/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raicesejercicioextraservice1;

import raicesejercicioextraservice1.entidad.Raices;
import raicesejercicioextraservice1.service.RaicesServer;

/**
 *
 * @author BeluS
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     RaicesServer rs=new RaicesServer();
     Raices raiz =new Raices(1,-5,6);
     Raices raiz2=new Raices(1,0,1);
      Raices raiz3=new Raices(2,-4,2);

     rs.calcular(raiz);
     rs.calcular(raiz2);
     rs.calcular(raiz3);
     


     
    }
    
}
