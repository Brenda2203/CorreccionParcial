/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author LabingXEON
 */
public class fabrica {
    private int idFabrica;
    private String nombreFabrica;

    public int getIdFabrica() {
        return idFabrica;
    }

    public void setIdFabrica(int idFabrica) {
        this.idFabrica = idFabrica;
    }

    public String getNombreFabrica() {
        return nombreFabrica;
    }

    public void setNombreFabrica(String nombreFabrica) {
        this.nombreFabrica = nombreFabrica;
    }

    public fabrica(int idFabrica, String nombreFabrica) {
        this.idFabrica = idFabrica;
        this.nombreFabrica = nombreFabrica;
    }

    public fabrica() {
    }
    
}
