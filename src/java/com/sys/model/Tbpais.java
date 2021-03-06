package com.sys.model;
// Generated 09-09-2020 09:45:25 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Tbpais generated by hbm2java
 */
public class Tbpais  implements java.io.Serializable {


     private Integer idPais;
     private String nombrePais;
     private Set<Tbdepartamento> tbdepartamentos = new HashSet<Tbdepartamento>(0);
     private Set<Tbempleado> tbempleados = new HashSet<Tbempleado>(0);

    public Tbpais() {
    }

	
    public Tbpais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
    public Tbpais(String nombrePais, Set<Tbdepartamento> tbdepartamentos, Set<Tbempleado> tbempleados) {
       this.nombrePais = nombrePais;
       this.tbdepartamentos = tbdepartamentos;
       this.tbempleados = tbempleados;
    }
   
    public Integer getIdPais() {
        return this.idPais;
    }
    
    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }
    public String getNombrePais() {
        return this.nombrePais;
    }
    
    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
    public Set<Tbdepartamento> getTbdepartamentos() {
        return this.tbdepartamentos;
    }
    
    public void setTbdepartamentos(Set<Tbdepartamento> tbdepartamentos) {
        this.tbdepartamentos = tbdepartamentos;
    }
    public Set<Tbempleado> getTbempleados() {
        return this.tbempleados;
    }
    
    public void setTbempleados(Set<Tbempleado> tbempleados) {
        this.tbempleados = tbempleados;
    }




}


