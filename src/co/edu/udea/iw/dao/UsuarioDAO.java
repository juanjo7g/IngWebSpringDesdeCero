package co.edu.udea.iw.dao;

import java.util.List;

import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.exception.MyException;

public interface UsuarioDAO {
	List<Usuario> obtener() throws MyException;
	Usuario obtenerUsuario(String login) throws MyException;
	
}
