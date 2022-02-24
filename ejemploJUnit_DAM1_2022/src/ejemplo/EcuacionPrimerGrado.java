package ejemplo;

/**
 * Ecuacion en formato:
 * 
 * ax + b = c
 *
 * a : parte1 b : parte2 + : operador c: parte3
 *
 * Solucion: x = (c - b) / a es decir:
 * 
 * x = (parte3 - parte2)/parte1
 */
public class EcuacionPrimerGrado {
	private Parseador parseador = new Parseador();

	private String ecuacion;
	private int parte1;
	private int parte2;
	private int parte3;

	public EcuacionPrimerGrado() {

	}

	public EcuacionPrimerGrado(String ecuacion) {
		this.ecuacion = ecuacion;
		this.parte1 = parseador.obtenerParte1(ecuacion);
		this.parte2 = parseador.obtenerParte2(ecuacion);
		this.parte3 = parseador.obtenerParte3(ecuacion);
	}

	public EcuacionPrimerGrado(int parte1, int parte2, int parte3) {
		this.parte1 = parte1;
		this.parte2 = parte2;
		this.parte3 = parte3;
		this.ecuacion = "" + (parte1 == 0 ? "" : parte1 + "x") + (parte2 < 0 ? " -" : " + ") + parte2 + " = "
				+ (parte3 < 0 ? "-" : "") + parte3;
	}

	public String getEcuacion() {
		return ecuacion;
	}

	public int getParte1() {
		return parte1;
	}

	public int getParte2() {
		return parte2;
	}

	public int getParte3() {
		return parte3;
	}

	public double obtenerResultado() {
		double resultado = Double.valueOf((parte3 - parte2)) / Double.valueOf(parte1);
		return resultado;
	}

	@Override
	public String toString() {
		return "" + ecuacion + " -> x=(" + parte3 + " - " + parte2 + ") / " + parte1;
	}

	/***
	 * Función que recibe 2 ecuaciones de 1º grado y devuelva la ecuación de 1º
	 * grado resultante de la suma de ambas
	 * 
	 * @param ec1 EcuacionPrimerGrado como primer sumando
	 * @param ec2 EcuacionPrimerGrado como segundo sumando
	 * @return EcuacionPrimerGrado resultante de la suma de las 2 ecuaciones de 1º
	 *         grado que se pasan como parámetros
	 */
	public EcuacionPrimerGrado sumar(EcuacionPrimerGrado ec1, EcuacionPrimerGrado ec2) {
		EcuacionPrimerGrado ret = new EcuacionPrimerGrado(ec1.getParte1() + ec2.getParte1(),
				ec1.getParte2() + ec2.getParte2(), ec1.getParte3() + ec2.getParte3());
		return ret;
	}

	/**
	 * Función que devuelve la EcuacionPrimerGrado resultante de multiplicar this por el factor entero que se pasa como parámetro
	 * @param factor entero para multiplicar a la propia EcuacionPrimerGrado
	 * @return EcuacionPrimerGrado resultante de multipicar this por el factor entero que se pasa como parámetro
	 */
	public EcuacionPrimerGrado multiplicarPor(int factor) {
		EcuacionPrimerGrado ret = new EcuacionPrimerGrado(parte1 * factor, parte2 * factor, parte3 * factor);
		return ret;
	}

}
