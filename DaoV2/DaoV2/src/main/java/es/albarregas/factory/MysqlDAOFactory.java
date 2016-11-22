/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.factory;

import es.albarregas.dao.IAlumnosDao;
import es.albarregas.dao.MysqlAlumnosDao;

/**
 *
 * @author Daw2
 */
public class MysqlDAOFactory extends DAOFactory{

    @Override
    public IAlumnosDao getAlumnosDAO() {
        return new MysqlAlumnosDao();
    }
    
}
