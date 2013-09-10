package sdec;

public class Calculadora {

	public Calculadora() {
		System.out.println("Calculadora inicializada por Spring !!");
	}

	public int sumar(int numero1, int numero2) {
		System.out.println("Se realiza el cálculo de la suma a través de la clase Calculadora");
		System.out.println("Numero 1 = " + numero1);
		System.out.println("Numero 2 = " + numero2);
		return numero1 + numero2;
	}

}
