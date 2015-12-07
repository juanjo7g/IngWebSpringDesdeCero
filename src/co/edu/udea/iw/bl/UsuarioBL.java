package co.edu.udea.iw.bl;

import co.edu.udea.iw.exception.MyException;

public interface UsuarioBL {
	public boolean validar(String login, String contrasena) throws MyException;
}
