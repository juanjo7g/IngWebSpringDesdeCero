package co.edu.udea.iw.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.iw.dao.RolDAO;
import co.edu.udea.iw.dto.Rol;
import co.edu.udea.iw.exception.MyException;

public class RolDAOImpl extends HibernateDaoSupport implements RolDAO {

	@Override
	public List<Rol> consultar() throws MyException {
		// TODO Auto-generated method stub
		return null;
	}

}
