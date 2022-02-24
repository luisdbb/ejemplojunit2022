package ejemplo;

public class Principal {

	public static void main(String[] args) {
		/**
		 * Caso de prueba 1: En una reunión hay el doble número de mujeres que de
		 * hombres y el triple número de niños que de hombres y mujeres juntos. ¿Cuántos
		 * hombres, mujeres y niños hay por separado si en total hay 96 personas en la
		 * reunión?
		 * 
		 * Hombres: x Mujeres: 2*x Niños: 3(x + 2*x)= 9x Total: 96=x + 2x + 3x --> 12x =
		 * 96 --> x = 8
		 * 
		 * SOLUCIÓN: Hombres: 8 Mujeres: 16 Niños: 72
		 * 
		 * Para probar: EcuacionPrimerGrado(12, -96, 0)
		 */

		/***
		 * Caso de prueba 2: Una granja tiene cerdos y tiene pavos. En total hay 35
		 * cabezas y 116 patas. ¿cuántos cerdos y pavos hay?
		 * 
		 * cerdos = x  (1 cabeza + 4 patas)
		 * pavos =  y (1 cabeza + 2 patas) = (35-x)
		 * cabezas_cerdos + cabezas_pavos = 35
		 * patas_cerdos + patas_pavos = 116 --> 4*x + (2*(35-x)) = 116
		 * 4x + 70 -2x = 116 --> 2x = 116 - 70 = 46 --> x = 23
		 * 
		 * SOLUCIÓN:
		 * cerdos: 23
		 * pavos: 12
		 * 
		 * Para probar: 2x + 70 = 116
		 * 
		 */
	}

}
