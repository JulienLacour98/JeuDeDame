/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jeudedame;

/**
 *
 * @author Julien
 */
public class Position {
    
    private int x;
    private int y;
    
    Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    
    /**
     * 
     * @param dx
     * @param dy
     * 
     * Fonction qui modifie la postion de dx et dy
     */
    public void deplace(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
    
    /**
     *
     * La fonction renvoie true si la postion est bien comprise dans le plateau de jeu 
     */
    public boolean positionValide(){
        return ((this.x >= 0) && (this.x <= 10) && (this.y >= 0) && (this.y <= 10));
    }
}
