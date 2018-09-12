package gestiontestjunit;

public class Operations {
	
	
	public long addition(long...nombre){
		long resultat = 0;
		System.out.println("Addition de plussieurs nombre: Test Sonar-Jenkins");
		for(long i : nombre)
			resultat+=i;
		return resultat;
	}
	
	
	
	public long multiplication(long ...nombre){
	long resultat = 1;
		for(long i : nombre)
			resultat*=i;
		return resultat;
	}

}
