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
    
    /**
     *
     * @param newPos : Position où l'on souhaite déplacer la pièce
     * @param estNoire : Booléen qui vaut True si la pièce et Noire et False sinon
     * @return
     */
    public abstract boolean deplacementValide(Position newPos, boolean estNoire);
}
