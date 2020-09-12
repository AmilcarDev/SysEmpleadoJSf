package com.sys.model;
// Generated 09-09-2020 09:45:25 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Tbdepartamento generated by hbm2java
 */
public class Tbdepartamento  implements java.io.Serializable {


     private Integer idDepartamento;
     private Tbpais tbpais;
     private String nombreDepartamento;
     private Set<Tbempleado> tbempleados = new HashSet<Tbempleado>(0);
     private Set<Tbmunicipio> tbmunicipios = new HashSet<Tbmunicipio>(0);

    public Tbdepartamento() {
    }

	
    public Tbdepartamento(Tbpais tbpais, String nombreDepartamento) {
        this.tbpais = tbpais;
        this.nombreDepartamento = nombreDepartamento;
    }
    public Tbdepartamento(Tbpais tbpais, String nombreDepartamento, Set<Tbempleado> tbempleados, Set<Tbmunicipio> tbmunicipios) {
       this.tbpais = tbpais;
       this.nombreDepartamento = nombreDepartamento;
       this.tbempleados = tbempleados;
       this.tbmunicipios = tbmunicipios;
    }
   
    public Integer getIdDepartamento() {
        return this.idDepartamento;
    }
    
    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
    public Tbpais getTbpais() {
        return this.tbpais;
    }
    
    public void setTbpais(Tbpais tbpais) {
        this.tbpais = tbpais;
    }
    public String getNombreDepartamento() {
        return this.nombreDepartamento;
    }
    
    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }
    public Set<Tbempleado> getTbempleados() {
        return this.tbempleados;
    }
    
    public void setTbempleados(Set<Tbempleado> tbempleados) {
        this.tbempleados = tbempleados;
    }
    public Set<Tbmunicipio> getTbmunicipios() {
        return this.tbmunicipios;
    }
    
    public void setTbmunicipios(Set<Tbmunicipio> tbmunicipios) {
        this.tbmunicipios = tbmunicipios;
    }




}


