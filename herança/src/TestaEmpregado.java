
public class TestaEmpregado {
	public static void main(String[] args) {
		EmpregadoBaseMaisComissao e = new EmpregadoBaseMaisComissao("Rafael", "Stein", "12345678900", 1000, 0.5, 6000);
		EmpregadoComissao k = new EmpregadoComissao("Lucas", "Hug", "0000000", 2000, 0.5);
		
		System.out.println(e);
		System.out.print(k);
	}
}
