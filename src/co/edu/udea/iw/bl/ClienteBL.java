package co.edu.udea.iw.bl;

import java.util.List;

import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.exception.MyException;

public interface ClienteBL {
	public void guardar(String cedula, String nombres, String apellidos, String email, String usuarioCrea)
			throws MyException;
	public List<Cliente> listarClientes() throws MyException;
}
