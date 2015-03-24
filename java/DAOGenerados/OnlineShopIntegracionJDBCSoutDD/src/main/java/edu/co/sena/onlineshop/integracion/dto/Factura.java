/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.onlineshop.integracion.dto;

import edu.co.sena.onlineshop.integracion.dao.*;
import edu.co.sena.onlineshop.integracion.factory.*;
import edu.co.sena.onlineshop.integracion.exceptions.*;
import java.io.Serializable;
import java.util.*;
import java.util.Date;

public class Factura implements Serializable
{
	/** 
	 * This attribute maps to the column ID_FACTURA in the factura table.
	 */
	protected int idFactura;

	/** 
	 * This attribute represents whether the attribute idFactura has been modified since being read from the database.
	 */
	protected boolean idFacturaModified = false;

	/** 
	 * This attribute maps to the column FECHA_FACTURA in the factura table.
	 */
	protected Date fechaFactura;

	/** 
	 * This attribute represents whether the attribute fechaFactura has been modified since being read from the database.
	 */
	protected boolean fechaFacturaModified = false;

	/** 
	 * This attribute maps to the column FORMA_PAGO in the factura table.
	 */
	protected String formaPago;

	/** 
	 * This attribute represents whether the attribute formaPago has been modified since being read from the database.
	 */
	protected boolean formaPagoModified = false;

	/** 
	 * This attribute maps to the column CUENTA_NUMERO_DOCUMENTO in the factura table.
	 */
	protected String cuentaNumeroDocumento;

	/** 
	 * This attribute represents whether the attribute cuentaNumeroDocumento has been modified since being read from the database.
	 */
	protected boolean cuentaNumeroDocumentoModified = false;

	/** 
	 * This attribute maps to the column CUENTA_TIPO_DOCUMENTO in the factura table.
	 */
	protected String cuentaTipoDocumento;

	/** 
	 * This attribute represents whether the attribute cuentaTipoDocumento has been modified since being read from the database.
	 */
	protected boolean cuentaTipoDocumentoModified = false;

	/**
	 * Method 'Factura'
	 * 
	 */
	public Factura()
	{
	}

	/**
	 * Method 'getIdFactura'
	 * 
	 * @return int
	 */
	public int getIdFactura()
	{
		return idFactura;
	}

	/**
	 * Method 'setIdFactura'
	 * 
	 * @param idFactura
	 */
	public void setIdFactura(int idFactura)
	{
		this.idFactura = idFactura;
		this.idFacturaModified = true;
	}

	/** 
	 * Sets the value of idFacturaModified
	 */
	public void setIdFacturaModified(boolean idFacturaModified)
	{
		this.idFacturaModified = idFacturaModified;
	}

	/** 
	 * Gets the value of idFacturaModified
	 */
	public boolean isIdFacturaModified()
	{
		return idFacturaModified;
	}

	/**
	 * Method 'getFechaFactura'
	 * 
	 * @return Date
	 */
	public Date getFechaFactura()
	{
		return fechaFactura;
	}

	/**
	 * Method 'setFechaFactura'
	 * 
	 * @param fechaFactura
	 */
	public void setFechaFactura(Date fechaFactura)
	{
		this.fechaFactura = fechaFactura;
		this.fechaFacturaModified = true;
	}

	/** 
	 * Sets the value of fechaFacturaModified
	 */
	public void setFechaFacturaModified(boolean fechaFacturaModified)
	{
		this.fechaFacturaModified = fechaFacturaModified;
	}

	/** 
	 * Gets the value of fechaFacturaModified
	 */
	public boolean isFechaFacturaModified()
	{
		return fechaFacturaModified;
	}

	/**
	 * Method 'getFormaPago'
	 * 
	 * @return String
	 */
	public String getFormaPago()
	{
		return formaPago;
	}

	/**
	 * Method 'setFormaPago'
	 * 
	 * @param formaPago
	 */
	public void setFormaPago(String formaPago)
	{
		this.formaPago = formaPago;
		this.formaPagoModified = true;
	}

	/** 
	 * Sets the value of formaPagoModified
	 */
	public void setFormaPagoModified(boolean formaPagoModified)
	{
		this.formaPagoModified = formaPagoModified;
	}

	/** 
	 * Gets the value of formaPagoModified
	 */
	public boolean isFormaPagoModified()
	{
		return formaPagoModified;
	}

	/**
	 * Method 'getCuentaNumeroDocumento'
	 * 
	 * @return String
	 */
	public String getCuentaNumeroDocumento()
	{
		return cuentaNumeroDocumento;
	}

	/**
	 * Method 'setCuentaNumeroDocumento'
	 * 
	 * @param cuentaNumeroDocumento
	 */
	public void setCuentaNumeroDocumento(String cuentaNumeroDocumento)
	{
		this.cuentaNumeroDocumento = cuentaNumeroDocumento;
		this.cuentaNumeroDocumentoModified = true;
	}

	/** 
	 * Sets the value of cuentaNumeroDocumentoModified
	 */
	public void setCuentaNumeroDocumentoModified(boolean cuentaNumeroDocumentoModified)
	{
		this.cuentaNumeroDocumentoModified = cuentaNumeroDocumentoModified;
	}

	/** 
	 * Gets the value of cuentaNumeroDocumentoModified
	 */
	public boolean isCuentaNumeroDocumentoModified()
	{
		return cuentaNumeroDocumentoModified;
	}

	/**
	 * Method 'getCuentaTipoDocumento'
	 * 
	 * @return String
	 */
	public String getCuentaTipoDocumento()
	{
		return cuentaTipoDocumento;
	}

	/**
	 * Method 'setCuentaTipoDocumento'
	 * 
	 * @param cuentaTipoDocumento
	 */
	public void setCuentaTipoDocumento(String cuentaTipoDocumento)
	{
		this.cuentaTipoDocumento = cuentaTipoDocumento;
		this.cuentaTipoDocumentoModified = true;
	}

	/** 
	 * Sets the value of cuentaTipoDocumentoModified
	 */
	public void setCuentaTipoDocumentoModified(boolean cuentaTipoDocumentoModified)
	{
		this.cuentaTipoDocumentoModified = cuentaTipoDocumentoModified;
	}

	/** 
	 * Gets the value of cuentaTipoDocumentoModified
	 */
	public boolean isCuentaTipoDocumentoModified()
	{
		return cuentaTipoDocumentoModified;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof Factura)) {
			return false;
		}
		
		final Factura _cast = (Factura) _other;
		if (idFactura != _cast.idFactura) {
			return false;
		}
		
		if (idFacturaModified != _cast.idFacturaModified) {
			return false;
		}
		
		if (fechaFactura == null ? _cast.fechaFactura != fechaFactura : !fechaFactura.equals( _cast.fechaFactura )) {
			return false;
		}
		
		if (fechaFacturaModified != _cast.fechaFacturaModified) {
			return false;
		}
		
		if (formaPago == null ? _cast.formaPago != formaPago : !formaPago.equals( _cast.formaPago )) {
			return false;
		}
		
		if (formaPagoModified != _cast.formaPagoModified) {
			return false;
		}
		
		if (cuentaNumeroDocumento == null ? _cast.cuentaNumeroDocumento != cuentaNumeroDocumento : !cuentaNumeroDocumento.equals( _cast.cuentaNumeroDocumento )) {
			return false;
		}
		
		if (cuentaNumeroDocumentoModified != _cast.cuentaNumeroDocumentoModified) {
			return false;
		}
		
		if (cuentaTipoDocumento == null ? _cast.cuentaTipoDocumento != cuentaTipoDocumento : !cuentaTipoDocumento.equals( _cast.cuentaTipoDocumento )) {
			return false;
		}
		
		if (cuentaTipoDocumentoModified != _cast.cuentaTipoDocumentoModified) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + idFactura;
		_hashCode = 29 * _hashCode + (idFacturaModified ? 1 : 0);
		if (fechaFactura != null) {
			_hashCode = 29 * _hashCode + fechaFactura.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fechaFacturaModified ? 1 : 0);
		if (formaPago != null) {
			_hashCode = 29 * _hashCode + formaPago.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (formaPagoModified ? 1 : 0);
		if (cuentaNumeroDocumento != null) {
			_hashCode = 29 * _hashCode + cuentaNumeroDocumento.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (cuentaNumeroDocumentoModified ? 1 : 0);
		if (cuentaTipoDocumento != null) {
			_hashCode = 29 * _hashCode + cuentaTipoDocumento.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (cuentaTipoDocumentoModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return FacturaPk
	 */
	public FacturaPk createPk()
	{
		return new FacturaPk(idFactura);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.onlineshop.integracion.dto.Factura: " );
		ret.append( "idFactura=" + idFactura );
		ret.append( ", fechaFactura=" + fechaFactura );
		ret.append( ", formaPago=" + formaPago );
		ret.append( ", cuentaNumeroDocumento=" + cuentaNumeroDocumento );
		ret.append( ", cuentaTipoDocumento=" + cuentaTipoDocumento );
		return ret.toString();
	}

}
