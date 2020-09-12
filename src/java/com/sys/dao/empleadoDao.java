/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sys.dao;

import com.sys.model.Tbdepartamento;
import com.sys.model.Tbempleado;
import com.sys.model.Tbmunicipio;
import com.sys.model.Tbpais;
import java.util.List;

/**
 *
 * @author Amilcar Cortez
 */
public interface empleadoDao {
    public List<Tbempleado> mostrarEmpleados();
    public void nuevoEmpleado(Tbempleado tbempleado);
    public void modificarEmpleado(Tbempleado tbempleado);
    public void eliminarEmpleado(Tbempleado tbempleado);
    
    //metodos para los selects dinamicos
    
    public List<Tbpais> listarPaises();
    public List<Tbdepartamento> listarDepartamentos(Tbempleado empleado);
    public List<Tbmunicipio> listarMunicipios(Tbempleado empleado);
    
    
    
}
