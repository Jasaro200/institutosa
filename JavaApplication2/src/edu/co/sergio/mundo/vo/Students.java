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
public class Students {
private int SID ;
private String FIRSTT;
private String LASTT ;
private String EMAIL ;

    public Students(int SID, String FIRSTT, String LASTT, String EMAIL) {
        this.SID = SID;
        this.FIRSTT = FIRSTT;
        this.LASTT = LASTT;
        this.EMAIL = EMAIL;
    }

    public int getSID() {
        return SID;
    }

    public void setSID(int SID) {
        this.SID = SID;
    }

    public String getFIRSTT() {
        return FIRSTT;
    }

    public void setFIRSTT(String FIRSTT) {
        this.FIRSTT = FIRSTT;
    }

    public String getLASTT() {
        return LASTT;
    }

    public void setLASTT(String LASTT) {
        this.LASTT = LASTT;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }
    
    
    
}
