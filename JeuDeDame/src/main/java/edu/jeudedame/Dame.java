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
public class Dame extends Piece{
    
    /**
     *
     * @param pos
     */
    public Dame(Position pos) {
        super(pos);
    }

    /**
     *
     * @param newPos
     * @param estNoire
     * @return True si la Dame peut se déplacer à la position newPos
     */
    @Override
    public boolean deplacementValide(Position newPos, boolean estNoire) {
        boolean b = false;
        if (newPos.positionValide()) {
            for (int i = 0; i <= 10; i++ ){
                if ((newPos.getY() == (this.pos.getY() + i)) || (newPos.getY() == (this.pos.getY() - i)) ) {
                    if (newPos.getX() == (this.pos.getX() + i) || newPos.getX() == (this.pos.getX() - i)){
                        b = true;
                    }
                }
            }
        }
        return b;
    }
    
}
