/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.onlineshop.integracion.jdbc;

import edu.co.sena.onlineshop.integracion.dao.*;
import edu.co.sena.onlineshop.integracion.factory.*;
import edu.co.sena.onlineshop.integracion.dto.*;
import edu.co.sena.onlineshop.integracion.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class PedidoDaoImpl extends AbstractDAO implements PedidoDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT FACTURA_ID_FACTURA, TOTAL, SUBTOTAL, IMPUESTOS FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( FACTURA_ID_FACTURA, TOTAL, SUBTOTAL, IMPUESTOS ) VALUES ( ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET FACTURA_ID_FACTURA = ?, TOTAL = ?, SUBTOTAL = ?, IMPUESTOS = ? WHERE FACTURA_ID_FACTURA = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE FACTURA_ID_FACTURA = ?";

	/** 
	 * Index of column FACTURA_ID_FACTURA
	 */
	protected static final int COLUMN_FACTURA_ID_FACTURA = 1;

	/** 
	 * Index of column TOTAL
	 */
	protected static final int COLUMN_TOTAL = 2;

	/** 
	 * Index of column SUBTOTAL
	 */
	protected static final int COLUMN_SUBTOTAL = 3;

	/** 
	 * Index of column IMPUESTOS
	 */
	protected static final int COLUMN_IMPUESTOS = 4;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 4;

	/** 
	 * Index of primary-key column FACTURA_ID_FACTURA
	 */
	protected static final int PK_COLUMN_FACTURA_ID_FACTURA = 1;

	/** 
	 * Inserts a new row in the pedido table.
	 */
	public PedidoPk insert(Pedido dto) throws PedidoDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			StringBuffer values = new StringBuffer();
			sql.append( "INSERT INTO " + getTableName() + " (" );
			int modifiedCount = 0;
			if (dto.isFacturaIdFacturaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FACTURA_ID_FACTURA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isTotalModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "TOTAL" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isSubtotalModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "SUBTOTAL" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isImpuestosModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "IMPUESTOS" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (modifiedCount==0) {
				// nothing to insert
				throw new IllegalStateException( "Nothing to insert" );
			}
		
			sql.append( ") VALUES (" );
			sql.append( values );
			sql.append( ")" );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isFacturaIdFacturaModified()) {
				stmt.setInt( index++, dto.getFacturaIdFactura() );
			}
		
			if (dto.isTotalModified()) {
				stmt.setDouble( index++, dto.getTotal() );
			}
		
			if (dto.isSubtotalModified()) {
				stmt.setDouble( index++, dto.getSubtotal() );
			}
		
			if (dto.isImpuestosModified()) {
				stmt.setDouble( index++, dto.getImpuestos() );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PedidoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the pedido table.
	 */
	public void update(PedidoPk pk, Pedido dto) throws PedidoDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			sql.append( "UPDATE " + getTableName() + " SET " );
			boolean modified = false;
			if (dto.isFacturaIdFacturaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FACTURA_ID_FACTURA=?" );
				modified=true;
			}
		
			if (dto.isTotalModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "TOTAL=?" );
				modified=true;
			}
		
			if (dto.isSubtotalModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "SUBTOTAL=?" );
				modified=true;
			}
		
			if (dto.isImpuestosModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "IMPUESTOS=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE FACTURA_ID_FACTURA=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isFacturaIdFacturaModified()) {
				stmt.setInt( index++, dto.getFacturaIdFactura() );
			}
		
			if (dto.isTotalModified()) {
				stmt.setDouble( index++, dto.getTotal() );
			}
		
			if (dto.isSubtotalModified()) {
				stmt.setDouble( index++, dto.getSubtotal() );
			}
		
			if (dto.isImpuestosModified()) {
				stmt.setDouble( index++, dto.getImpuestos() );
			}
		
			stmt.setInt( index++, pk.getFacturaIdFactura() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PedidoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the pedido table.
	 */
	public void delete(PedidoPk pk) throws PedidoDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setInt( 1, pk.getFacturaIdFactura() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PedidoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the pedido table that matches the specified primary-key value.
	 */
	public Pedido findByPrimaryKey(PedidoPk pk) throws PedidoDaoException
	{
		return findByPrimaryKey( pk.getFacturaIdFactura() );
	}

	/** 
	 * Returns all rows from the pedido table that match the criteria 'FACTURA_ID_FACTURA = :facturaIdFactura'.
	 */
	public Pedido findByPrimaryKey(int facturaIdFactura) throws PedidoDaoException
	{
		Pedido ret[] = findByDynamicSelect( SQL_SELECT + " WHERE FACTURA_ID_FACTURA = ?", new Object[] {  new Integer(facturaIdFactura) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the pedido table that match the criteria ''.
	 */
	public Pedido[] findAll() throws PedidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY FACTURA_ID_FACTURA", null );
	}

	/** 
	 * Returns all rows from the pedido table that match the criteria 'FACTURA_ID_FACTURA = :facturaIdFactura'.
	 */
	public Pedido[] findByFactura(int facturaIdFactura) throws PedidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FACTURA_ID_FACTURA = ?", new Object[] {  new Integer(facturaIdFactura) } );
	}

	/** 
	 * Returns all rows from the pedido table that match the criteria 'FACTURA_ID_FACTURA = :facturaIdFactura'.
	 */
	public Pedido[] findWhereFacturaIdFacturaEquals(int facturaIdFactura) throws PedidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FACTURA_ID_FACTURA = ? ORDER BY FACTURA_ID_FACTURA", new Object[] {  new Integer(facturaIdFactura) } );
	}

	/** 
	 * Returns all rows from the pedido table that match the criteria 'TOTAL = :total'.
	 */
	public Pedido[] findWhereTotalEquals(double total) throws PedidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE TOTAL = ? ORDER BY TOTAL", new Object[] {  new Double(total) } );
	}

	/** 
	 * Returns all rows from the pedido table that match the criteria 'SUBTOTAL = :subtotal'.
	 */
	public Pedido[] findWhereSubtotalEquals(double subtotal) throws PedidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE SUBTOTAL = ? ORDER BY SUBTOTAL", new Object[] {  new Double(subtotal) } );
	}

	/** 
	 * Returns all rows from the pedido table that match the criteria 'IMPUESTOS = :impuestos'.
	 */
	public Pedido[] findWhereImpuestosEquals(double impuestos) throws PedidoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IMPUESTOS = ? ORDER BY IMPUESTOS", new Object[] {  new Double(impuestos) } );
	}

	/**
	 * Method 'PedidoDaoImpl'
	 * 
	 */
	public PedidoDaoImpl()
	{
	}

	/**
	 * Method 'PedidoDaoImpl'
	 * 
	 * @param userConn
	 */
	public PedidoDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "onlineshop.pedido";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Pedido fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Pedido dto = new Pedido();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Pedido[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Pedido dto = new Pedido();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Pedido ret[] = new Pedido[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Pedido dto, ResultSet rs) throws SQLException
	{
		dto.setFacturaIdFactura( rs.getInt( COLUMN_FACTURA_ID_FACTURA ) );
		dto.setTotal( rs.getDouble( COLUMN_TOTAL ) );
		dto.setSubtotal( rs.getDouble( COLUMN_SUBTOTAL ) );
		dto.setImpuestos( rs.getDouble( COLUMN_IMPUESTOS ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Pedido dto)
	{
		dto.setFacturaIdFacturaModified( false );
		dto.setTotalModified( false );
		dto.setSubtotalModified( false );
		dto.setImpuestosModified( false );
	}

	/** 
	 * Returns all rows from the pedido table that match the specified arbitrary SQL statement
	 */
	public Pedido[] findByDynamicSelect(String sql, Object[] sqlParams) throws PedidoDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PedidoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the pedido table that match the specified arbitrary SQL statement
	 */
	public Pedido[] findByDynamicWhere(String sql, Object[] sqlParams) throws PedidoDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PedidoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}
