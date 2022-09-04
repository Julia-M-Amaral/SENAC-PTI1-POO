/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ptipoo;

/**
 *
 * @author jubsz
 */
public class Main {
    public static void main(String[] args) {
        
       Ponto p1 = new Ponto(2, 2); //x2 e x1
       Ponto p2 = new Ponto(2, 2); //x1 e y1
        
        if(p1.pontosIguais(p2.getX(),p2.getY()) == true){
            System.out.println((p1.calcularDis(p2.getX(), p2.getY())));
        }
        else{
            System.out.println("Pontos Iguais");
        }
    }
}
