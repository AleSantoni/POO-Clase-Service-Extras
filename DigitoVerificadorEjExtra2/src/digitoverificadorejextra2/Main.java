
package digitoverificadorejextra2;

import NIF.Nif;
import NifService.NifServer;


public class Main {

    public static void main(String[] args) {
        
        
        NifServer nif=new NifServer();
        Nif nif1=nif.crearNif();
        nif.mostrar(nif1);
        

    }
    
}
