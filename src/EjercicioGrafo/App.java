package EjercicioGrafo;



public class App {

	public static void main(String[] args) {
		Grafo<Integer> grafoPrueba = new Grafo<Integer>();
		
		grafoPrueba .addNodo(1);
		grafoPrueba .addNodo(2);
		grafoPrueba .addNodo(3);
		grafoPrueba .addNodo(4);
		grafoPrueba .addNodo(5);
		grafoPrueba .addNodo(6);
		grafoPrueba .addNodo(7);
		grafoPrueba .conectar(1, 2);
		grafoPrueba .conectar(1, 3);
		grafoPrueba .conectar(2, 4);
		grafoPrueba .conectar(2, 3);
		grafoPrueba .conectar(3, 5);
		grafoPrueba .conectar(4, 6);
		grafoPrueba .conectar(4, 5);
		grafoPrueba .conectar(5, 6);
		grafoPrueba .conectar(5, 7);
		grafoPrueba .conectar(7, 6);

		System.out.println(grafoPrueba.camino(new Vertice<Integer>(1), 2, 1));
		System.out.println(grafoPrueba.camino(new Vertice<Integer>(1), 1, 2));
		System.out.println(grafoPrueba.camino(new Vertice<Integer>(1), 2, 2));

	}
}
