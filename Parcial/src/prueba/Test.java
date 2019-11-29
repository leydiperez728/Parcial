package prueba;


import org.junit.Assert.*;

import junit.framework.TestCase;


public class Test extends TestCase {


	private Calculadora operacion;
	
	public void test () {
		operacion = new Calculadora();
		
	}
	public void testsumar () {
		test();
		assertTrue(operacion.sumar(2, 2)==(2+2));
	}
	
	public void testrestar () {
		test();
		assertEquals(3, operacion.restar(5, 2));
	}
	
	public void testmultiplicar () {
		test();
		assertTrue(operacion.multiplicar(2, 2)==(2*2));//=4
	}
	
	public void testdividir () {
		test();
		assertTrue(operacion.dividir(2, 2)==(2/2));
	}
		
		public void testexponenciacion () {
			test();
			assertEquals(9, operacion.exponenciacion(3, 2));
	}
}