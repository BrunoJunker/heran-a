import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestaHeranca {

	@Test
	void testRendTrue() {
		EmpregadoBaseMaisComissao e = new EmpregadoBaseMaisComissao("Rafael", "Stein", "12345678900", 100, 0.1, 10);
		
		assertTrue(e.rendimentos() == 20);
	}
	
	@Test
	void testRendFalse() {
		EmpregadoBaseMaisComissao e = new EmpregadoBaseMaisComissao("Rafael", "Stein", "12345678900", 100, 0.1, 10);
		
		assertFalse(e.rendimentos() != 20);
	}
	
	@Test
	
	
	
	

}
