package calculadora;

public class testeCalculadora {
	
	public static void main(String[] args)
	{
		Calculadora calc = new Calculadora();
		
		
		//Testes
		System.out.println(calc.calcular(2, 3, "+"));
		System.out.println(calc.calcular(10, 4, "-"));
		System.out.println(calc.calcular(3, 5, "*"));
		System.out.println(calc.calcular(8, 2, "/"));
		
		
		try 
		{
			System.out.println(calc.calcular(8, 0, "/")); //exceção
		}
		
		catch (IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
		
		try 
		{
			System.out.println(calc.calcular(5, 5, "x")); //exceção
		}
		
		catch (IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
