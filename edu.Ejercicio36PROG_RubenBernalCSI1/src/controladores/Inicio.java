/**
 * Ruben Bernal Ramos, CSI1
 */

package controladores;

import java.time.Duration;
import java.time.LocalTime;

/**
 * Clase controladora de la aplicacion
 * rbr - 181224
 */
public class Inicio {

	/**
	 * Metodo de entrada de la aplicacion
	 * rbr - 181224
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Creo las dos marcas de tiempo
		LocalTime inicio = LocalTime.of(10, 15);
		LocalTime fin = LocalTime.of(14, 45);

		//Calculo la diferencia de tiempo
		Duration duracion = Duration.between(inicio, fin);

		//Imprimo los resultados
		System.out.println("Horas: " + duracion.toHours() + ", Minutos: " + duracion.toMinutes());

	}

}
