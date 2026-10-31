package calculadora;

public class calculadora {
	
	public int r = 0;
	
	public int calc(int a, int b, String op) 
	{
		
		//Código da Calculadora
		
		if (op.equals("+"))
		{
			r = a + b;
		}
		
		else if (op.equals("-"))
		{
			r = a - b;
		}
		
		else if (op.equals("*"))
		{
			r = a * b;
		}
		
		else if (op.equals("/"))
		{
			if (b != 0)
			{
				r = a / b;
			}
			
			else 
			{
				System.out.print("Erro: divisão por zero, operação irregular!");
				r = 0;
			}
		}
		
		else 
		{
			System.out.print("Operacao Invalida!");
			r = 0;
		}
		
		System.out.print("Resultado = " + r);
		return r;
		
	}

}
