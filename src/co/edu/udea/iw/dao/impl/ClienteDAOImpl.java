package co.edu.udea.iw.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.iw.dao.ClienteDAO;
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.exception.MyException;

public class ClienteDAOImpl extends HibernateDaoSupport  implements ClienteDAO {

	@Override
	public void crear(Cliente Cliente) throws MyException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(Cliente Cliente) throws MyException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Cliente Cliente) throws MyException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> obtener() throws MyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente obtenerCliente(String cedula) throws MyException {
		// TODO Auto-generated method stub
		return null;
	}

}
