import java.math.BigDecimal;

public abstract class Funcionario extends Pessoa {

    protected BigDecimal salario;
    protected String matricula;

    public Funcionario(String nome, char sexo, BigDecimal salario, String matricula) {
        super(nome, sexo);
        this.salario = salario;
        this.matricula = matricula;
    }

    public abstract BigDecimal calcularSalario();

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", sexo=" + sexo +
                '}';
    }
}
