/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nezet;

/**
 *
 * @author Banjo
 */
public class Nezet {
    public Nezet(char[][] tabla) {
        for (char[] sor : tabla) {
            for (char elem : sor) {
                System.out.print(elem);
            }
            System.out.println("");
        }
    }
    
}
