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
public abstract class Piece {
    
    Position pos;
    
    Piece(Position pos){
        this.pos = pos;
    }  

    /**
     * @return the pos
     */
    public Position getPos() {
        return pos;
    }

    /**
     * @param pos the pos to set
     */
    public void setPos(Position pos) {
        this.pos = pos;
    }
    
    public abstract boolean deplacementValide(Position newPos, boolean estNoire);
}
