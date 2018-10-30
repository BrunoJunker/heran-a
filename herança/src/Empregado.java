
public class Empregado {
	protected String nome;
	protected String sobrenome;
	protected String cpf;

    public Empregado(String nome, String sobrenome, String cpf) 
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

   
    // retorna a representação em String do objeto
    @Override // indica que esse objeto sobrescreve o método da superclasse
    public String toString() {
        return String.format("%s: %s %s\n%s: %s", 
            "Comissionado", getNome(), getSobrenome(),
            "CPF", getCpf());
    }

}
