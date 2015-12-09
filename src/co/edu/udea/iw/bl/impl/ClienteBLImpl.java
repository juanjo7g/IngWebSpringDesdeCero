package co.edu.udea.iw.bl.impl;

import java.util.Date;
import java.util.List;

import co.edu.udea.iw.bl.ClienteBL;
import co.edu.udea.iw.dao.ClienteDAO;
import co.edu.udea.iw.dao.UsuarioDAO;
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.exception.MyException;
import co.edu.udea.iw.util.validations.Validaciones;

public class ClienteBLImpl implements ClienteBL {

	private ClienteDAO daoC;
	private UsuarioDAO daoU;

	@Override
	public void guardar(String cedula, String nombres, String apellidos, String email, String usuarioCrea)
			throws MyException {
		Cliente cliente = new Cliente();
		Usuario usuario = null;
		if ((cedula == null) || "".equals(cedula)) {
			throw new MyException("Cedula no valida", null);
		}
		if ((nombres == null) || "".equals(nombres)) {
			throw new MyException("Nombres no validos", null);
		}
		if ((apellidos == null) || "".equals(apellidos)) {
			throw new MyException("Apellidos no validos", null);
		}
		if ((email == null) || "".equals(email)) {
			throw new MyException("Email no valido", null);
		}
		if ((usuarioCrea == null) || "".equals(usuarioCrea)) {
			throw new MyException("Usuario no valido", null);
		}
		
		if (!Validaciones.isEmail(email)) {
			throw new MyException("Email no valido", null);
		}
		if (daoC.obtenerCliente(cedula) != null) {
			throw new MyException("Ya existe un cliente con la cedula repetida", null);
		}
		usuario = daoU.obtenerUsuario(usuarioCrea);
		if(usuario==null)
		{
			throw new MyException("Usuario no valido", null);
		}
		cliente.setCedula(cedula);
		cliente.setNombres(nombres);
		cliente.setApellidos(apellidos);
		cliente.setEmail(email);
		cliente.setUsuarioCrea(usuario);
		cliente.setFechaCreacion(new Date());
		cliente.setEliminado(false);
	
		daoC.crear(cliente);

	}

	@Override
	public List<Cliente> listarClientes() throws MyException {
		return daoC.obtener();
	}
	
	public ClienteDAO getDaoC() {
		return daoC;
	}

	public void setDaoC(ClienteDAO daoC) {
		this.daoC = daoC;
	}

	public UsuarioDAO getDaoU() {
		return daoU;
	}

	public void setDaoU(UsuarioDAO daoU) {
		this.daoU = daoU;
	}

	
	
}
