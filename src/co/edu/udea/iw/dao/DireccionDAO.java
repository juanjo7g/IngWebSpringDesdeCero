package co.edu.udea.iw.dao;

import co.edu.udea.iw.dto.Direccion;
import co.edu.udea.iw.dto.DireccionId;
import co.edu.udea.iw.exception.MyException;

public interface DireccionDAO {
	void crear(Direccion Direccion) throws MyException;
	void eliminar(Direccion Direccion) throws MyException;
	Direccion obtenerPorCliente(String cedulaCliente) throws MyException;
}
