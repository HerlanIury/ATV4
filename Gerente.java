import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario {

    private List<Vendedor> subordinados = new ArrayList<>();

    public Gerente(String nome, char sexo, BigDecimal salario, String matricula) {
        super(nome, sexo, salario, matricula);
    }

    @Override
    public BigDecimal calcularSalario() {
        BigDecimal totalVendasVendedor = BigDecimal.ZERO;
        if (!subordinados.isEmpty()) {
            for (Vendedor vendedor : subordinados) {
                totalVendasVendedor = totalVendasVendedor.add(vendedor.getTotalVendas());
            }
        }

        salario = salario.add(totalVendasVendedor.multiply(new BigDecimal("0.005")));

        return salario;
    }

    public List<Vendedor> getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(List<Vendedor> subordinados) {
        this.subordinados = subordinados;
    }

    public void addSubordinado(Vendedor vendedor) {
        subordinados.add(vendedor);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "salario=" + salario +
                ", matricula='" + matricula + '\'' +
                ", subordinados=" + subordinados +
                ", nome='" + nome + '\'' +
                ", sexo=" + sexo +
                '}';
    }
}
