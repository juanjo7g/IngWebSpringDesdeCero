package co.edu.udea.iw.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.iw.dao.CiudadDAO;
import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.exception.MyException;

public class CiudadDAOImpl extends HibernateDaoSupport implements CiudadDAO {

	@Override
	public List<Ciudad> consultar() throws MyException {
		List<Ciudad> ciudades = new ArrayList<Ciudad>();
		Session session= null;
		try {
//			session = getSessionFactory().getCurrentSession(); 
			 session = getSession();
			Criteria criteria = session.createCriteria(Ciudad.class); // Para esta clase debe existir un mapeo
			ciudades =criteria.list();
		} catch (Exception e) {
			throw new MyException(e); // Pasa la exception a MyException
		}
		
		return ciudades;
	}

}
