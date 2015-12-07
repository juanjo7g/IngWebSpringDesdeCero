package co.edu.udea.iw.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.iw.dao.UsuarioDAO;
import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.exception.MyException;

public class UsuarioDAOImpl extends HibernateDaoSupport implements UsuarioDAO {

	@Override
	public List<Usuario> obtener() throws MyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario obtenerUsuario(String login) throws MyException {
		Usuario usuario = new Usuario();
		Session session= null;
		try {
			session = getSession();
			session.createCriteria(Usuario.class).add(Restrictions.eq("Login", login));
			usuario = (Usuario) session.get(Usuario.class, login);
		} catch (Exception e) {
			throw new MyException(e);
		}
		return usuario;
	}

}
