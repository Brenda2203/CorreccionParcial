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
public class recoleccion {
    private int idRecoleccion;
    private int idColmena;
    private int idTrabajador;
    private Date fecha;
    private double kilosMiel;
    
    
    public recoleccion() {
    }

    public recoleccion(int idRecoleccion, int idColmena, int idTrabajador, Date fecha, double kilosMiel) {
        this.idRecoleccion = idRecoleccion;
        this.idColmena = idColmena;
        this.idTrabajador = idTrabajador;
        this.fecha = fecha;
        this.kilosMiel = kilosMiel;
    }

    public int getIdRecoleccion() {
        return idRecoleccion;
    }

    public void setIdRecoleccion(int idRecoleccion) {
        this.idRecoleccion = idRecoleccion;
    }

    public int getIdColmena() {
        return idColmena;
    }

    public void setIdColmena(int idColmena) {
        this.idColmena = idColmena;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getKilosMiel() {
        return kilosMiel;
    }

    public void setKilosMiel(double kilosMiel) {
        this.kilosMiel = kilosMiel;
    }
    
    
}
