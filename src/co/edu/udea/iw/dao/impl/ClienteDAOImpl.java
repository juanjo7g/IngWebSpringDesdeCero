package co.edu.udea.iw.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.iw.dao.ClienteDAO;
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.exception.MyException;

public class ClienteDAOImpl extends HibernateDaoSupport  implements ClienteDAO {

	@Override
	public void crear(Cliente Cliente) throws MyException {
		Session session = null;
		try {
			session = getSession();
			Transaction tx = session.beginTransaction();
			session.save(Cliente);
			tx.commit();
		} catch (Exception e) {
			throw new MyException(e);
		} 
		
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
		List<Cliente> clientes = new ArrayList<Cliente>();
		Session session= null;
		try {
//			session = getSessionFactory().getCurrentSession(); 
			session = getSession();
			Criteria criteria = session.createCriteria(Cliente.class); // Para esta clase debe existir un mapeo
			clientes =criteria.list();
		} catch (Exception e) {
			throw new MyException(e); // Pasa la exception a MyException
		}
	
		return clientes;
	}

	@Override
	public Cliente obtenerCliente(String cedula) throws MyException {
		// TODO Auto-generated method stub
		return null;
	}

}
