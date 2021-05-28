import java.math.BigDecimal;

public class Vendedor extends Funcionario {

    private BigDecimal totalVendas;

    public Vendedor(String nome, char sexo, BigDecimal salario, String matricula) {
        super(nome, sexo, salario, matricula);
    }

    @Override
    public BigDecimal calcularSalario() {
        return salario = salario.add(totalVendas.multiply(new BigDecimal("0.01")));
    }

    public BigDecimal getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(BigDecimal totalVendas) {
        this.totalVendas = totalVendas;
    }
}
