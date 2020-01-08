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
public class Pion extends Piece {
    
    /**
     *
     * @param pos
     */
    public Pion(Position pos) {
        super(pos);
    }

    /**
     *
     * @param newPos
     * @param estNoire
     * @return True si le Pion peut se déplacer à la position newPos
     */
    @Override
    public boolean deplacementValide(Position newPos, boolean estNoire) {
        if (newPos.positionValide()){
            if (estNoire) {
                if (newPos.getY() == (this.pos.getY() + 1)){
                    if (newPos.getX() == (this.pos.getX() + 1) || newPos.getX() == (this.pos.getX() - 1)){
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                else {
                    return false;
                }
            }
            else {
                if (newPos.getY() == (this.pos.getY() - 1)){
                    if (newPos.getX() == (this.pos.getX() + 1) || newPos.getX() == (this.pos.getX() - 1)){
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                else {
                    return false;
                }
            }
        }
        else {
            return false;
        }
    }
    
}
