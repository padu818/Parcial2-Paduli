package EjercicioRecursividad;



public class Recursividad {
	
	/*
	 * Aplicar el método “divide y vencerás” para resolver el siguiente problema:

	Dado un arreglo ordenado de N enteros se necesita determinar cual 
	es el valor mas cercano a un valor que se recibe como argumento.

El método Cercano, recibe como argumentos entonces:

un arreglo que contiene números enteros (positivos y negativos, que pueden aparecer repetidos) 
 ordenado de manera ascendente
Un valor objetivo .
Definir e implementar un algoritmo que reciba como argumento un número entero N y 
encuentre cual es el valor más cercano a este numero N empleando la técnica DyV. Ejemplos:

metodoDyV ( {1, 2, 4, 5, 6, 6, 8, 9}  , 11 )  Resultado :  9
metodoDyV ( {-8, -3, -3, 9, 12, 12, 12, 15, 18}  , 4)  Resultado:  -3
	 */
	
	public Integer cercano(Integer[] arreglo, Integer x) {
		return cercano(arreglo, x, 0, arreglo.length-1);
	}
	
	public Integer cercano(Integer[] arreglo, Integer x, Integer inicio, Integer fin) {
		if(inicio>fin)
			return arreglo[0]; // retorna el mas cercano
		if(arreglo[fin] < x)
			return arreglo[fin];
		int media = (inicio+fin)/2;
		if(media > 0 && arreglo[media] > x && arreglo[media-1] <= x ) {
			return arreglo[media-1];
		}
		if(arreglo[media] < x) {
			return cercano(arreglo, x, media+1, fin);
		}
		else {
			return cercano(arreglo, x,inicio, media-1);
		}
	}
	
	public static void main(String[] args){
        Recursividad ej2 = new Recursividad();
        Integer[] test = {1, 2, 4, 5, 6, 6, 8, 9};
        Integer[] test1 =  {-8, -3, -3, 9, 12, 12, 12, 15, 18};
        System.out.println("cercano: "+ej2.cercano(test,11 ));
        System.out.println("cercano: "+ej2.cercano(test1,4 ));
     
    }
}
