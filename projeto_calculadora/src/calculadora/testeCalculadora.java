package calculadora;


/**
 * <p><strong>Teste Calculadora</strong>/<p>
 *  
 * <p>Esta classe fornece realiza seis testes referentes a classe Calculadora.java, fazendo a conferência
 * de todos os resultados possíveis das operações apresentadas na classe Calculadora.java.</p>
 * <p>Esse projeto é utilizado para demonstrar: </p>
 * <ul>
 *		<li>Testes simples da classe Calculadora.java</li>
 * </ul>
 * 
 * 
 * @author abner
 * @version 1.0
 * 
 * 
 * 
 */

public class testeCalculadora {
	
	/**
	 * 
	 * Aciona a classe Calculadora como "calc" e realiza 6 inserções de parâmetros para conferir se os resultados
	 * são equivalentes ao que se era esperado.
	 * 
	 * @param args Argumentos de linha de comando
	 */
	
	
	public static void main(String[] args)
	{
		Calculadora calc = new Calculadora();
		
		
		//Testes
		System.out.println(calc.calcular(2, 3, "+")); //Resultado Esperado: 5
		System.out.println(calc.calcular(10, 4, "-")); //Resultado Esperado: 6
		System.out.println(calc.calcular(3, 5, "*"));  //Resultado Esperado: 15
		System.out.println(calc.calcular(8, 2, "/")); //Resultado Esperado: 4
		
		
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
