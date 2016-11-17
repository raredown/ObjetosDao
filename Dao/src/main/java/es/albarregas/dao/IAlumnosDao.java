/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.Alumno;
import java.util.ArrayList;

/**
 *
 * @author Daw2
 */
public interface IAlumnosDao {
    public void addAlumno(Alumno a);
    public ArrayList<Alumno> getAlumnos(String where);
    public ArrayList<Alumno> getAlumnos();
}
