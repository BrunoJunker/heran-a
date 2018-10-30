
public class EmpregadoBaseMaisComissao extends EmpregadoComissao{
    private double salarioBase;

    public EmpregadoBaseMaisComissao(String nome, String sobrenome, String cpf, double vendasBrutas,
			double taxaDeComissao, double salarioBase) {
		super(nome, sobrenome, cpf, vendasBrutas, taxaDeComissao);
		this.salarioBase = salarioBase;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		if (salarioBase >= 0.0)
            this.salarioBase = salarioBase;
        else
            throw new IllegalArgumentException(
                "Salario base devem ser >= 0.0"
            );
	}

    /**
     * @return O rendimento do funcionario
     */
	@Override
    public double rendimentos() {
        return super.rendimentos() + getSalarioBase();
    }

	@Override // indica que esse objeto sobrescreve o método da superclasse
    public String toString() {
        return String.format("%s %s\n%s: %.2f", 
            "Salário base e", super.toString(),
            "Salario Base", getSalarioBase());
	}
}
