/**
 * 
 */
package TAREA2;

/**
 * @author CYBER-SERVER
 *
 */
public class Principal {



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperacionMatematica a = new OperacionMatematica();
		System.out.println(a.sumar(1,2));
		System.out.println(a.restar(1,2));
		System.out.println(a.multiplicar(1,5));
		System.out.println(a.dividir(5,1));
		System.out.println(a.factorial(15));
		System.out.println(a.fibonacci(15));
		System.out.println(a.bin(15));
		a.VectorRandom(15,2,20);
	}
}
