package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ejemplo.EcuacionPrimerGrado;

public class EcuacionPrimerGradoTest {

	EcuacionPrimerGrado ecuacion;

	@Before
	public void setUp() {
		ecuacion = new EcuacionPrimerGrado();
	}

	@Test
	public void solucionaEcuacionConMenos() {
		System.out.println("solucionaEcuacionConMenos");
		ecuacion = new EcuacionPrimerGrado("2x - 1 = 0");
		Double result = ecuacion.obtenerResultado();
		Double valueExpected = 0.5;
		assertEquals(valueExpected, result);
	}

	@Test
	public void solucionaEcuacionConMas() {
		System.out.println("solucionaEcuacionConMas");
		ecuacion = new EcuacionPrimerGrado("2x + 1 = 0");
		Double result = ecuacion.obtenerResultado();
		Double valueExpected = -0.5;
		assertEquals(valueExpected, result);
	}

	@Test
	public void solucionaEcuacionConParte3Mayor0() {
		System.out.println("solucionaEcuacionConParte3Mayor0");
		ecuacion = new EcuacionPrimerGrado("2x + 1 = 10");
		Double result = ecuacion.obtenerResultado();
		Double valueExpected = 4.5;
		assertEquals(valueExpected, result);
	}

	@Test
	public void solucionaEcuacionConParte3Menor0() {
		System.out.println("solucionaEcuacionConParte3Menor0");
		ecuacion = new EcuacionPrimerGrado("2x + 1 = -10");
		Double result = ecuacion.obtenerResultado();
		Double valueExpected = -5.5;
		assertEquals(valueExpected, result);
	}


	@Test
	public void testGetEcuacion001() {
		System.out.println("testGetEcuacion001");
		ecuacion = new EcuacionPrimerGrado("2x + 1 = -10");
		String esperado = "2x + 1 = -10";
		String obtenido= ecuacion.getEcuacion();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void testGetEcuacion002() {
		System.out.println("testGetEcuacion002");
		ecuacion = new EcuacionPrimerGrado("0x + 1 = -10");
		String esperado = "0x + 1 = -10";
		String obtenido= ecuacion.getEcuacion();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void testGetEcuacion003() {
		System.out.println("testGetEcuacion003");
		ecuacion = new EcuacionPrimerGrado("2x + 0 = -10");
		String esperado = "2x + 0 = -10";
		String obtenido= ecuacion.getEcuacion();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void testGetEcuacion004() {
		System.out.println("testGetEcuacion004");
		ecuacion = new EcuacionPrimerGrado("2x + 10 = 0");
		String esperado = "2x + 10 = 0";
		String obtenido= ecuacion.getEcuacion();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void testGetEcuacion005() {
		System.out.println("testGetEcuacion005");
		ecuacion = new EcuacionPrimerGrado("-2x + 10 = 0");
		String esperado = "-2x + 10 = 0";
		String obtenido= ecuacion.getEcuacion();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void testGetEcuacion006() {
		System.out.println("testGetEcuacion006");
		ecuacion = new EcuacionPrimerGrado("2x - 10 = 0");
		String esperado = "2x - 10 = 0";
		String obtenido= ecuacion.getEcuacion();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void testGetEcuacion007() {
		System.out.println("testGetEcuacion007");
		ecuacion = new EcuacionPrimerGrado("2x - 10 = -10");
		String esperado = "2x - 10 = -10";
		String obtenido= ecuacion.getEcuacion();
		assertEquals(esperado, obtenido);
	}

	@Test
	public void testGetParte1001() {
		System.out.println("testGetParte1001");
		///Caso de prueba: parte 1 > 0
		EcuacionPrimerGrado ec1 = new EcuacionPrimerGrado("10x + 1 = 10");
		int esperado = 10;
		int obtenido = ec1.getParte1();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void testGetParte1002() {
		System.out.println("testGetParte1002");
		///Caso de prueba: parte 1 < 0
		EcuacionPrimerGrado ec1 = new EcuacionPrimerGrado("-10x + 1 = 10");
		int esperado = -10;
		int obtenido = ec1.getParte1();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void testGetParte1003() {
		System.out.println("testGetParte1003");
		///Caso de prueba: parte 1 = 0
		EcuacionPrimerGrado ec1 = new EcuacionPrimerGrado("0x + 1 = 10");
		int esperado = 0;
		int obtenido = ec1.getParte1();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void testGetParte2001() {
		System.out.println("testGetParte2001");
		///Caso de prueba: parte 2 > 0
		EcuacionPrimerGrado ec1 = new EcuacionPrimerGrado("10x + 10 = 10");
		int esperado = 10;
		int obtenido = ec1.getParte2();
		assertEquals(esperado, obtenido);
	}
	@Test
	public void testGetParte2002() {
		System.out.println("testGetParte1002");
		///Caso de prueba: parte 2 = 0
		EcuacionPrimerGrado ec1 = new EcuacionPrimerGrado("10x + 0 = 10");
		int esperado = 0;
		int obtenido = ec1.getParte2();
		assertEquals(esperado, obtenido);
	}

	@Test
	public void testGetParte2003() {
		System.out.println("testGetParte2001");
		///caso de prueba: parte 2 < 0
		EcuacionPrimerGrado ec1 = new EcuacionPrimerGrado("2x - 3 = 10");
		int esperado = -3;
		int obtenido = ec1.getParte2();
		assertEquals(esperado, obtenido);
	}

	@Test
	public void testGetParte3001() {
		System.out.println("testGetParte3001");
		///Caso de prueba : parte 3 > 0
		EcuacionPrimerGrado ec1 = new EcuacionPrimerGrado("2x + 1 = 10");
		int esperado = 10;
		int obtenido = ec1.getParte3();
		assertEquals(esperado, obtenido);
	}

	@Test
	public void testGetParte3002() {
		System.out.println("testGetParte3002");
		///Caso de prueba : parte 3 < 0
		EcuacionPrimerGrado ec1 = new EcuacionPrimerGrado("2x + 1 = -10");
		int esperado = -10;
		int obtenido = ec1.getParte3();
		assertEquals(esperado, obtenido);
	}

	@Test
	public void testGetParte3003() {
		System.out.println("testGetParte3003");
		///Caso de prueba : parte 3 = 0
		EcuacionPrimerGrado ec1 = new EcuacionPrimerGrado("2x + 1 = 0");
		int esperado = 0;
		int obtenido = ec1.getParte3();
		assertEquals(esperado, obtenido);
	}

	@Test
	public void testToString001() {
		System.out.println("testToString001");
		EcuacionPrimerGrado ec1 = new EcuacionPrimerGrado("2x + 1 = 10");
		String esperado = "2x + 1 = 10 -> x=(10 - 1) / 2";
		String obtenido = ec1.toString();
		assertEquals(esperado, obtenido);
	}

	

	@Test
	public void testSumarEcuacionesPrimerGrado001() {
		System.out.println("testSumarEcuacionesPrimerGrado001");
		EcuacionPrimerGrado ec1 = new EcuacionPrimerGrado("2x + 1 = 10");
		EcuacionPrimerGrado ec2 = new EcuacionPrimerGrado("2x + 1 = 10");
		EcuacionPrimerGrado esperado = new EcuacionPrimerGrado("4x + 2 = 20");
		EcuacionPrimerGrado obtenido = EcuacionPrimerGrado.sumar(ec1, ec2);
		assertEquals(esperado.getParte1(), obtenido.getParte1());
		assertEquals(esperado.getParte2(), obtenido.getParte2());
		assertEquals(esperado.getParte3(), obtenido.getParte3());
	}
	
	@Test
	public void testSumarEcuacionesPrimerGrado002() {
		System.out.println("testSumarEcuacionesPrimerGrado002");
		EcuacionPrimerGrado ec1 = new EcuacionPrimerGrado("2x + 1 = 10");
		EcuacionPrimerGrado ec2 = new EcuacionPrimerGrado("2x - 2 = -1");
		EcuacionPrimerGrado esperado = new EcuacionPrimerGrado("4x - 1 = 9");
		EcuacionPrimerGrado obtenido = EcuacionPrimerGrado.sumar(ec1, ec2);
		assertEquals(esperado.getParte1(), obtenido.getParte1());
		assertEquals(esperado.getParte2(), obtenido.getParte2());
		assertEquals(esperado.getParte3(), obtenido.getParte3());
	}
	
	@Test
	public void testSumarEcuacionesPrimerGrado003() {
		System.out.println("testSumarEcuacionesPrimerGrado003");
		EcuacionPrimerGrado ec1 = new EcuacionPrimerGrado("2x + 1 = 10");
		EcuacionPrimerGrado ec2 = new EcuacionPrimerGrado("0x + 1 = 10");
		EcuacionPrimerGrado esperado = new EcuacionPrimerGrado("2x + 2 = 20");
		EcuacionPrimerGrado obtenido = EcuacionPrimerGrado.sumar(ec1, ec2);
		assertEquals(esperado.getParte1(), obtenido.getParte1());
		assertEquals(esperado.getParte2(), obtenido.getParte2());
		assertEquals(esperado.getParte3(), obtenido.getParte3());
	}
	
	@Test
	public void testSumarEcuacionesPrimerGrado004() {
		System.out.println("testSumarEcuacionesPrimerGrado004");
		EcuacionPrimerGrado ec1 = new EcuacionPrimerGrado("2x + 1 = 10");
		EcuacionPrimerGrado ec2 = new EcuacionPrimerGrado("2x + 0 = 10");
		EcuacionPrimerGrado esperado = new EcuacionPrimerGrado("4x + 1 = 20");
		EcuacionPrimerGrado obtenido = EcuacionPrimerGrado.sumar(ec1, ec2);
		assertEquals(esperado.getParte1(), obtenido.getParte1());
		assertEquals(esperado.getParte2(), obtenido.getParte2());
		assertEquals(esperado.getParte3(), obtenido.getParte3());
	}
	
	@Test
	public void testSumarEcuacionesPrimerGrado005() {
		System.out.println("testSumarEcuacionesPrimerGrado005");
		EcuacionPrimerGrado ec1 = new EcuacionPrimerGrado("2x + 1 = 10");
		EcuacionPrimerGrado ec2 = new EcuacionPrimerGrado("2x + 1 = 0");
		EcuacionPrimerGrado esperado = new EcuacionPrimerGrado("4x + 2 = 10");
		EcuacionPrimerGrado obtenido = EcuacionPrimerGrado.sumar(ec1, ec2);
		assertEquals(esperado.getParte1(), obtenido.getParte1());
		assertEquals(esperado.getParte2(), obtenido.getParte2());
		assertEquals(esperado.getParte3(), obtenido.getParte3());
	}

	@Test
	public void testMultiplicarPor001() {
		System.out.println("testMultiplicarPor001");
		EcuacionPrimerGrado ec1 = new EcuacionPrimerGrado("2x + 1 = 10");
		EcuacionPrimerGrado esperado = new EcuacionPrimerGrado("4x + 2 = 20");
		///Caso de prueba: multiplicarPor valor > 0
		EcuacionPrimerGrado obtenido = ec1.multiplicarPor(2);
		assertEquals(esperado.getParte1(), obtenido.getParte1());
		assertEquals(esperado.getParte2(), obtenido.getParte2());
		assertEquals(esperado.getParte3(), obtenido.getParte3());
	}
	
	@Test
	public void testMultiplicarPor002() {
		System.out.println("testMultiplicarPor002");
		EcuacionPrimerGrado ec1 = new EcuacionPrimerGrado("2x + 1 = 10");
//		EcuacionPrimerGrado esperado = new EcuacionPrimerGrado("-4x - 2 = -20");
		EcuacionPrimerGrado esperadoB = new EcuacionPrimerGrado(-4,-2,-20);
		
		///Caso de prueba: multiplicarPor valor < 0 
		EcuacionPrimerGrado obtenido = ec1.multiplicarPor(-2);
//		assertEquals(esperado.getParte1(), obtenido.getParte1());
//		assertEquals(esperado.getParte2(), obtenido.getParte2());
//		assertEquals(esperado.getParte3(), obtenido.getParte3());
		
		assertEquals(esperadoB.getParte1(), obtenido.getParte1());
		assertEquals(esperadoB.getParte2(), obtenido.getParte2());
		assertEquals(esperadoB.getParte3(), obtenido.getParte3());
	}
	
	@Test
	public void testMultiplicarPor003() {
		System.out.println("testMultiplicarPor003");
		EcuacionPrimerGrado ec1 = new EcuacionPrimerGrado("2x + 1 = 10");
		EcuacionPrimerGrado esperado = new EcuacionPrimerGrado("0x + 0 = 0");
		///Caso de prueba: multiplicarPor valor = 0
		EcuacionPrimerGrado obtenido = ec1.multiplicarPor(0);
		assertEquals(esperado.getParte1(), obtenido.getParte1());
		assertEquals(esperado.getParte2(), obtenido.getParte2());
		assertEquals(esperado.getParte3(), obtenido.getParte3());
	}
}
