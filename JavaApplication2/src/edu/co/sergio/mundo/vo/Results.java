/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sergio.mundo.vo;

/**
 *
 * @author fabian.giraldo
 */
public class Results{
private int SID;
private  int ENO;
 private int POINTS;

    public Results(int SID, int ENO, int POINTS) {
        this.SID = SID;
        this.ENO = ENO;
        this.POINTS = POINTS;
    }

    public int getSID() {
        return SID;
    }

    public void setSID(int SID) {
        this.SID = SID;
    }

    public int getENO() {
        return ENO;
    }

    public void setENO(int ENO) {
        this.ENO = ENO;
    }

    public int getPOINTS() {
        return POINTS;
    }

    public void setPOINTS(int POINTS) {
        this.POINTS = POINTS;
    }
 
    
    
    
    
}
