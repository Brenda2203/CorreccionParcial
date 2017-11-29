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
public class cajones {
    private int idCajon;
    private int idFabrica;
    private String ubicacionEspacial;
    private String material;

    public cajones() {
    }

    public cajones(int idCajon, int idFabrica, String ubicacionEspacial, String material) {
        this.idCajon = idCajon;
        this.idFabrica = idFabrica;
        this.ubicacionEspacial = ubicacionEspacial;
        this.material = material;
    }

    public int getIdCajon() {
        return idCajon;
    }

    public void setIdCajon(int idCajon) {
        this.idCajon = idCajon;
    }

    public int getIdFabrica() {
        return idFabrica;
    }

    public void setIdFabrica(int idFabrica) {
        this.idFabrica = idFabrica;
    }

    public String getUbicacionEspacial() {
        return ubicacionEspacial;
    }

    public void setUbicacionEspacial(String ubicacionEspacial) {
        this.ubicacionEspacial = ubicacionEspacial;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    
}
