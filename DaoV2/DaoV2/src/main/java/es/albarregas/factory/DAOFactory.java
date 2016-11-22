package es.albarregas.factory;

import es.albarregas.dao.IAlumnosDao;






public abstract class DAOFactory {

    public static final int MYSQL = 1;
    public static final int ORACLE = 2;
    public static final int FICHERO = 3;
    
    public abstract IAlumnosDao getAlumnosDAO();
    
    
    public static DAOFactory getDAOFactory(int tipo){
        DAOFactory daof = null;
        
        switch(tipo){
            case MYSQL:
                daof = new MysqlDAOFactory();
                break;
        }
        
        return daof;
    }
    
}
