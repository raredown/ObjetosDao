/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.Alumno;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daw2
 */
public class MysqlAlumnosDao implements IAlumnosDao {

    @Override
    public void addAlumno(Alumno a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Alumno> getAlumnos(String where) {

        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        PreparedStatement preparada = null;
        Connection conexion = null;
        ResultSet resultado = null;
        conexion=ConectionFactory.getConnection();
        String sql = "SELECT * FROM alumnos"+where;
        try {
            preparada = conexion.prepareStatement(sql);
            resultado = preparada.executeQuery();
             while(resultado.next()){
                 Alumno alumno = new Alumno();
                 alumno.setIdAlumno(resultado.getInt("idAlumno"));
                 alumno.setNombre(resultado.getString("nombre"));
                 alumno.setGrupo(resultado.getString("grupo"));
                 alumnos.add(alumno);
             }
        } catch (SQLException ex) {
            Logger.getLogger(MysqlAlumnosDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (preparada!=null) {
                try {
                    preparada.close();
                    
                } catch (SQLException ex) {
                    Logger.getLogger(MysqlAlumnosDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conexion!=null){
                ConectionFactory.closeConexion(conexion);
            }
            
        }
        
        return alumnos;
    }

    @Override
    public ArrayList<Alumno> getAlumnos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
