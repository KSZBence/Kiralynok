/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

import java.util.Random;

/**
 *
 * @author Banjo
 */
public class Tabla {
    private char[][] t;
    private char uresCella;
    Random rnd = new Random();

    public Tabla(char uresCella) {
        this.t = new char[8][8];
        this.uresCella = uresCella;
        uresFeltolt();
        elhelyez(8);
    }

    private void uresFeltolt() {
    for (int i = 0; i < t.length; i++) {
        for (int j = 0; j < t[i].length; j++) {
            t[i][j] = this.uresCella;
        }
    }
}
    
    private void elhelyez(int kiralynoSzam){
        int i = 0;
        while (kiralynoSzam > 0) {            
            int rndsor = randomSzam();
            int rndoszlop = randomSzam();
            if (t[rndsor][rndoszlop] != 'K') {
                t[rndsor][rndoszlop] = 'K';
                kiralynoSzam--;
            }
        }
    }
    
    private int randomSzam(){
        return rnd.nextInt(8);
    }
    
    public boolean uresOszlop(int index) {
    for (int i = 0; i < t.length; i++) {
        if (t[i][index] == 'K') {
            return false;
        }
    }
    
    
    return true;
    }
    
    public boolean uresSor(int index) {
        for (int j = 0; j < t[index].length; j++) {
            if (t[index][j] == 'K') {
                return false;
            }
        }
        return true; 
    }
    
    private int uresOszlopokSzama(){
        int uresOszlopok = 0;  
        for (int i = 0; i < 8; i++) {
            if (uresOszlop(i)) {
                uresOszlopok++;
            }
        }
        return uresOszlopok;
    }
    
    private int uresSorokSzama(){
        int uresSorok = 0;  
        for (int i = 0; i < 8; i++) {
            if (uresSor(i)) {
                uresSorok++;
            }
        }
        return uresSorok;
    }
}

    

