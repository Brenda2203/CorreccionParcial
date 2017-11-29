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
public class apiario {
    private int idApiario;
    private int idCentro;

    @Override
    public String toString() {
        return "apiario{" + "idApiario=" + idApiario + ", idCentro=" + idCentro + '}';
    }

    public int getIdApiario() {
        return idApiario;
    }

    public void setIdApiario(int idApiario) {
        this.idApiario = idApiario;
    }

    public int getIdCentro() {
        return idCentro;
    }

    public void setIdCentro(int idCentro) {
        this.idCentro = idCentro;
    }

    public apiario() {
    }

    public apiario(int idApiario, int idCentro) {
        this.idApiario = idApiario;
        this.idCentro = idCentro;
    }
}
