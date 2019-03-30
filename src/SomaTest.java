import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class SomaTest {
	
	@Test
	public void executaSomaTest(){
		
		//Mock dos valores a serem somados.
		float passaValor1 = 10;
		float passaValor2 = 5;
		
		//Mock do retorno esperado
		float retornoEsperado = 15;
		
		//Dispara metodo da classe Soma passando.
		float retornoFeito = Soma.ExecutaCalculo(passaValor1, passaValor2);
		
		/*
		 * Esperado - valor mocado
		 * Atual - valor retornado pelo metodo testado
		 * Delta - Valor maximo entre o esperado e o atual que pode ser considerado valido
		 * */
		assertEquals(retornoEsperado,retornoFeito,0);
		
	}
}
