/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author LabingXEON
 */
public class visita {
    
    private int idVisita;
    private Date fechaVisita;
    private String estado;

    public visita() {
    }

    public visita(int idVisita, Date fechaVisita, String estado) {
        this.idVisita = idVisita;
        this.fechaVisita = fechaVisita;
        this.estado = estado;
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public Date getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(Date fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
