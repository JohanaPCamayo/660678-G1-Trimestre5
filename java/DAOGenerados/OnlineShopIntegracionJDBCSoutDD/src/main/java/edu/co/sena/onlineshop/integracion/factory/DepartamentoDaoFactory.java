/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.onlineshop.integracion.factory;

import java.sql.Connection;
import edu.co.sena.onlineshop.integracion.dao.*;
import edu.co.sena.onlineshop.integracion.jdbc.*;

public class DepartamentoDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return DepartamentoDao
	 */
	public static DepartamentoDao create()
	{
		return new DepartamentoDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return DepartamentoDao
	 */
	public static DepartamentoDao create(Connection conn)
	{
		return new DepartamentoDaoImpl( conn );
	}

}
