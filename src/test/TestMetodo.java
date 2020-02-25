package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import logic.Metodo;

public class TestMetodo {

	@Test
	public void testMetodo() {
		Metodo m = new Metodo();
		assertEquals("mario", m.metodo());
	}
}
