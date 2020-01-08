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
public class Plateau {
    
    private Piece[] piecesNoires;
    private Piece[] piecesBlances;

    /**
     * @return the piecesNoires
     */
    public Piece[] getPiecesNoires() {
        return piecesNoires;
    }

    /**
     * @param piecesNoires the piecesNoires to set
     */
    public void setPiecesNoires(Piece[] piecesNoires) {
        this.piecesNoires = piecesNoires;
    }

    /**
     * @return the piecesBlances
     */
    public Piece[] getPiecesBlances() {
        return piecesBlances;
    }

    /**
     * @param piecesBlances the piecesBlances to set
     */
    public void setPiecesBlances(Piece[] piecesBlances) {
        this.piecesBlances = piecesBlances;
    }
    
    public boolean estDisponible(Position pos){
        boolean b = true;
        for (Piece p: this.piecesBlances){
            if (p.getPos().equals(pos)){
                b = false;
            }
        }
        for (Piece p: this.piecesNoires){
            if (p.getPos().equals(pos)){
                b = false;
            }
        }
        return b;
    }
    
    public boolean estBlanche(Position pos){
        boolean b = false;
        for (Piece p: this.piecesBlances){
            if (p.getPos().equals(pos)){
                b = true;
            }
        }
        return b;
    }
    
    public boolean estNoire(Position pos){
        boolean b = false;
        for (Piece p: this.piecesNoires){
            if (p.getPos().equals(pos)){
                b = true;
            }
        }
        return b;
    }
}
