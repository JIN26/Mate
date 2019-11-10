package TAREA2;

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
	public String bin(int x) {
		String bin=" ";
		while(x>0) {
			if(x%2==0) {
				bin="0"+bin;
				
			}else {
				bin="1"+bin;
			}
			x=x/2;
		}
		return bin;
	}
	public void VectorRandom(int n,int init,int end ) {
		int[] vec = new int[n];
		int ran = 0;
	    int j=0;
		while(j<n) {
			boolean primo=true;
			ran =(int) Math.floor(Math.random()*(init-end+1)+end);
			for(int i=2;(primo) && (i!=ran); i++) {				
				if(ran%i==0) {	
					primo=false;
				}
			}
			if((primo) && (ran>init) && (ran<end)) {
				System.out.print((vec[j]=ran)+" ");	
				j++;
			}
		}
	}
}
