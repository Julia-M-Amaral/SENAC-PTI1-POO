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
    
    public Ponto(int a, int b){
        this.setX(a);
        this.setY(b);
    }
    public Ponto(){
       this.setX(0);
       this.setY(0);
    }
    
    
    public boolean pontosIguais(int x2, int y2){
        if(this.getX() == x2 && this.getY() == y2 ){
            return false;
        }
        else{
           return true;
        }
    }
    
   public double calcularDis(int x1, int y1){ 
           double distanciaXY = Math.sqrt(Math.pow(this.getX() - x1,2) + Math.pow(this.getY() - y1,2));
        return distanciaXY;
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
