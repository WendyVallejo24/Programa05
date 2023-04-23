/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uv.programa05;

import org.hibernate.Session;

/**
 *
 * @author wbpat
 */
public class Programa05 {

    public static void main(String[] args) {
        DAOEmpleado dao = new DAOEmpleado();
        Empleado empleado = new Empleado();
        empleado.setClave(01);
        empleado.setNombre("Wendy Vallejo");
        empleado.setDireccion("Orizaba");
        empleado.setTelefono("234223");
        
        dao.create(empleado);
        
        System.out.println("Hello World");
    }
}
