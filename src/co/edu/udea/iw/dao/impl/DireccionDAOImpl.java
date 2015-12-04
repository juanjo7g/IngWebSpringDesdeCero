package co.edu.udea.iw.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.iw.dao.DireccionDAO;
import co.edu.udea.iw.dto.Direccion;
import co.edu.udea.iw.exception.MyException;

public class DireccionDAOImpl extends HibernateDaoSupport implements DireccionDAO {

	@Override
	public void crear(Direccion Direccion) throws MyException {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Direccion Direccion) throws MyException {
		// TODO Auto-generated method stub

	}

	@Override
	public Direccion obtenerPorCliente(String cedulaCliente) throws MyException {
		// TODO Auto-generated method stub
		return null;
	}

}
