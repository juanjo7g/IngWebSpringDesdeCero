package co.edu.udea.iw.dao.impl;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.edu.udea.iw.bl.UsuarioBL;
import co.edu.udea.iw.bl.impl.UsuarioBLImpl;
import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.exception.MyException;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springConfiguration.xml")
public class UsuarioTest {

	@Autowired
	UsuarioDAOImpl dao;

	@Autowired
	UsuarioBL blU;

	@Test
	public void test1ObtenerUsuario() {
		Usuario usuario = null;
		String login = "elver";
		try {
			// Act
			usuario = dao.obtenerUsuario(login);
			System.out.println(usuario.getNombres());
			System.out.println(usuario.getRol().getNombre());
			// Assert
			assertTrue(usuario.getLogin().equals("elver"));
		} catch (MyException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void test2ValidarUsuario() {
		Boolean valido;
		try {
			// Act
			valido = blU.validar("elver", "elver");
			// Assert
			assertTrue(valido);
		} catch (MyException e) {
			fail(e.getMessage());
		}
	}

}