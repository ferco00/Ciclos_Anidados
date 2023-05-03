/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ciclosanidados;

/**
 *
 * @author Luis Fernando
 */
public class Ciclosanidados {
public void Formato(){
    for (int i = 1; i <= 10; i++) {
    for (int j = 1; j <= 10; j++) {
        System.out.print(i*j + "\t");
    }
    System.out.println();
}

}
    public static void main(String[] args) {
        Ciclosanidados formato = new Ciclosanidados();
        formato.Formato();
    }
}
