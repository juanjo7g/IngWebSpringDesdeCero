package co.edu.udea.iw.dao;

import java.util.List;

import co.edu.udea.iw.dto.Rol;
import co.edu.udea.iw.exception.MyException;

public interface RolDAO {
	public List<Rol> consultar() throws MyException;
}
