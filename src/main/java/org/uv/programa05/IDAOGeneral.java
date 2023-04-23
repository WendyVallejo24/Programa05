/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.uv.programa05;

import java.util.List;

/**
 *
 * @author wbpat
 */
public interface IDAOGeneral <T, ID> {
    public T create(T p); //Puede regresar solo el ID o todo el POJO, tipo de dato del POJO
    public boolean delete(ID id); //Regresa un True o False
    public T update(T p, ID id); //Debe regresar el POJO

    public List<T> findAll();
    public T findById(ID id);
    
}
