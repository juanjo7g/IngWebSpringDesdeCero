package co.edu.udea.iw.dao;

import java.util.List;

import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.exception.MyException;

public interface ClienteDAO {
	void crear(Cliente Cliente) throws MyException;
	void modificar(Cliente Cliente) throws MyException;
	void eliminar(Cliente Cliente) throws MyException;
	List<Cliente> obtener() throws MyException;
	Cliente obtenerCliente(String cedula) throws MyException;
}
