package co.edu.udea.iw.bl.impl;

import co.edu.udea.iw.bl.UsuarioBL;
import co.edu.udea.iw.dao.UsuarioDAO;
import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.exception.MyException;
import co.edu.udea.iw.util.encode.Cifrar;

public class UsuarioBLImpl implements UsuarioBL {

	private UsuarioDAO daoU;

	@Override
	public boolean validar(String login, String contrasena) throws MyException {
		Usuario usuario;
		Cifrar cifrar = new Cifrar();
		if ((login == null) || "".equals(login)) {
			throw new MyException("Usuario no valido", null);
		}
		usuario = daoU.obtenerUsuario(login);
		if (usuario == null) {
			return false;
		}
		if (!cifrar.encrypt(contrasena).equals(usuario.getContrasena())) {
			return false;
		}
		return true;
	}

	public UsuarioDAO getDaoU() {
		return daoU;
	}

	public void setDaoU(UsuarioDAO daoU) {
		this.daoU = daoU;
	}

}
