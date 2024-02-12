/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

/**
 *
 * @author Banjo
 */
public class Tabla {
    private char[][] t;
    private char uresCella;

    public Tabla(char uresCella) {
        this.t = new char[8][8];
        this.uresCella = uresCella;
        uresFeltolt();
    }

    private void uresFeltolt() {
        for (char[] sor : t) {
            for (char elem : sor) {
                elem = this.uresCella;
            }
        }
    }
    
    
}
