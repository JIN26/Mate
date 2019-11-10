package TAREA2;
import java.util.Random;

public class OperacionMatematica {

	public int sumar(int a,int b) {
		return(a+b);
	}
	public int restar(int a,int b) {
		return(a-b);
	}
	public int multiplicar(int a,int b) {
		return(a*b);
	}
	public int dividir(int a,int b) {
		return(a/b);
	}
	public int factorial(int x) {
		int j=1;
		for(int i=1; i<=x; i++) {
			j*=i;
		}
		return j;
	}
	public int fibonacci(int x){
	    if (x>1){
	       return fibonacci(x-1) + fibonacci(x-2);  //función recursiva
	    }
	    else if (x==1) {
	        return 1;
	    }
	    else if (x==0){ 
	        return 0;
	    }
	    else{
	        System.out.println("Debes ingresar un tamaño mayor o igual a 1");
	        return -1; 
	    }
	}
	public void VectorRandom(int n,int init,int end ) {
		int vec[] = new int[n];
		int van=0;
		for(int j=0;j<n;j++) {
			int x =(int) Math.random();
			for(int i=2; i<x; i++) {				
				if(x%i==0) {	
					van++;
					if(van==1) {
						
						System.out.println(vec[j]=x);
					}
				}
			}
		}
	}
}
