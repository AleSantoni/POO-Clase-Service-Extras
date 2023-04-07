

package NIF;

import java.util.logging.Logger;


public class Nif {
    private long dni;
    private char letra;

    public Nif() {
    }

    public Nif(long dni, char letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public long getDni() {
        return dni;
    }

    public char getLetra() {
        return letra;
    }
    
    
}
   
    
    

