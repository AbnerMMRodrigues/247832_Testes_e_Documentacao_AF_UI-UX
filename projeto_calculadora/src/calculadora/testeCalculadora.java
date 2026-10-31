package calculadora;

public class testeCalculadora {
	
	public static void main(String[] args)
	{
		Calculadora calc = new Calculadora();
		
		
		//Testes
		calc.calc(2, 3, "+"); //Resultado Esperado: 5
		calc.calc(10, 4, "-"); //Resultado Esperado: 6
		calc.calc(3, 5, "*"); //Resultado Esperado: 15
		calc.calc(8, 2, "/"); //Resultado Esperado: 4
		calc.calc(8, 0, "/"); //Resultado Esperado: Divisão por Zero
		calc.calc(5, 5, "x"); //Resultado Esperado: Operação Inválida
	}
}
