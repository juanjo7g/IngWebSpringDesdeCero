package co.edu.udea.iw.dao.impl;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.edu.udea.iw.bl.ClienteBL;
import co.edu.udea.iw.bl.UsuarioBL;
import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.exception.MyException;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:springConfiguration.xml")
public class ClienteTest {

	@Autowired
	ClienteDAOImpl daoC;

	@Autowired
	UsuarioDAOImpl daoU;

	@Autowired
	ClienteBL blC;

	@Test
	public void test1ObtenerClientes() {
		List<Cliente> lista = null;
		int total = 1;
		try {
			// Act
			lista = daoC.obtener();
			// Assert
			assertTrue(total <= lista.size());
		} catch (MyException e) {
			fail(e.getMessage());
		}
	}

	// @Test
	public void test2crearCliente() {
		List<Cliente> lista = null;
		int antes = 0;
		int despues = 0;
		Cliente cliente = new Cliente();
		try {
			// Act
			lista = daoC.obtener();
			antes = lista.size();

			cliente.setCedula("1234567");
			cliente.setNombres("J");
			cliente.setApellidos("Martínez");
			cliente.setEmail("j@gmail.com");
			cliente.setUsuarioCrea(daoU.obtenerUsuario("elver"));
			cliente.setFechaCreacion(new Date());

			daoC.crear(cliente);

			lista = null;
			lista = daoC.obtener();

			despues = lista.size();
			// Assert
			assertTrue(antes < despues);
		} catch (MyException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void test3GuardarCliente() {
		Cliente cliente = null;
		try {
			blC.guardar("1", "Javier", "Hernandes", "chicha@gmail.com", "elver");
			assertTrue(true);
		} catch (MyException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void test4ListarClientes() {
		List<Cliente> lista = null;
		try {
			lista = blC.listarClientes();
			assertTrue(lista.size() > 0);
		} catch (MyException e) {
			fail(e.getMessage());
		}
	}

}
