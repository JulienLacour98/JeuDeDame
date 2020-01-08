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
    
    /**
     *
     * @param pos
     * @return True s'il n'y a pas de piece sur la case pos
     */
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
    
    /**
     *
     * @param pos
     * @return True s'il y a une piece blanche sur la case pos
     */
    public boolean estBlanche(Position pos){
        boolean b = false;
        for (Piece p: this.piecesBlances){
            if (p.getPos().equals(pos)){
                b = true;
            }
        }
        return b;
    }
    
    /**
     *
     * @param pos
     * @return True s'il y a une piece noire sur la case pos
     */
    public boolean estNoire(Position pos){
        boolean b = false;
        for (Piece p: this.piecesNoires){
            if (p.getPos().equals(pos)){
                b = true;
            }
        }
        return b;
    }
    
    // Il faut écrire cette fonction
    // Elle teste si le pion à la position actuelle existe, verifie si c'est une dame ou un pion 
    //et vérifie si le déplacement à la position suivante est possible en prenant en compte les autres pièces
    public void deplacement(Position posActuelle, Position posSuivante){
        
    }
}
