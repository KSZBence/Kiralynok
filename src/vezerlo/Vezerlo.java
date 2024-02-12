/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vezerlo;

/**
 *
 * @author Banjo
 */
import modell.Tabla;
import nezet.Nezet;

public class Vezerlo {
    private Tabla tabla;
    
    public Vezerlo() {
        this.tabla = new Tabla('x');
        Nezet n = new Nezet();
        n.setVisible(true);
        
    }
    
}
