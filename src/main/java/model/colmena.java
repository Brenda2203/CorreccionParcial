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
public class colmena {
    private int idColmena;
    private String poblacion;
    private int reina;
    private String prodMiel;
    private int prodCera;
    private int alimento;
    private int crias;
    private int vacios;
    private int idMadre;
    private int idApiario;
    private int idRecoleccion;
    private int idVisita;
    private int idCajon;

    public colmena() {
    }

    public colmena(int idColmena, String poblacion, int reina, String prodMiel, int prodCera, int alimento, int crias, int vacios, int idMadre, int idApiario, int idRecoleccion, int idVisita, int idCajon) {
        this.idColmena = idColmena;
        this.poblacion = poblacion;
        this.reina = reina;
        this.prodMiel = prodMiel;
        this.prodCera = prodCera;
        this.alimento = alimento;
        this.crias = crias;
        this.vacios = vacios;
        this.idMadre = idMadre;
        this.idApiario = idApiario;
        this.idRecoleccion = idRecoleccion;
        this.idVisita = idVisita;
        this.idCajon = idCajon;
    }

    public int getIdColmena() {
        return idColmena;
    }

    public void setIdColmena(int idColmena) {
        this.idColmena = idColmena;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public int getReina() {
        return reina;
    }

    public void setReina(int reina) {
        this.reina = reina;
    }

    public String getProdMiel() {
        return prodMiel;
    }

    public void setProdMiel(String prodMiel) {
        this.prodMiel = prodMiel;
    }

    public int getProdCera() {
        return prodCera;
    }

    public void setProdCera(int prodCera) {
        this.prodCera = prodCera;
    }

    public int getAlimento() {
        return alimento;
    }

    public void setAlimento(int alimento) {
        this.alimento = alimento;
    }

    public int getCrias() {
        return crias;
    }

    public void setCrias(int crias) {
        this.crias = crias;
    }

    public int getVacios() {
        return vacios;
    }

    public void setVacios(int vacios) {
        this.vacios = vacios;
    }

    public int getIdMadre() {
        return idMadre;
    }

    public void setIdMadre(int idMadre) {
        this.idMadre = idMadre;
    }

    public int getIdApiario() {
        return idApiario;
    }

    public void setIdApiario(int idApiario) {
        this.idApiario = idApiario;
    }

    public int getIdRecoleccion() {
        return idRecoleccion;
    }

    public void setIdRecoleccion(int idRecoleccion) {
        this.idRecoleccion = idRecoleccion;
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public int getIdCajon() {
        return idCajon;
    }

    public void setIdCajon(int idCajon) {
        this.idCajon = idCajon;
    }
    
}
