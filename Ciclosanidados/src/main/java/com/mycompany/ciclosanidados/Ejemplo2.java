/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ciclosanidados;

/**
 *
 * @author Luis Fernando
 */
public class Ejemplo2 {

    public void Formato2() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
             
                if (i == j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Ejemplo2 formato2 = new Ejemplo2();
        formato2.Formato2();
    }
}
