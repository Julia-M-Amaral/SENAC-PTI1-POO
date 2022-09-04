/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ptipoo;

/**
 *
 * @author jubsz
 */
public class Ponto {

    private int  x,y;
    
    public Ponto(int x, int y){
        this.setX(x);
        this.setY(y);
    }
    public Ponto(){
       this.setX(0);
       this.setY(0);
    }

    
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
