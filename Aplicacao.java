import java.math.BigDecimal;

public class Aplicacao {

    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Orlando", 'M', new BigDecimal(5000), "11024050");

        Vendedor vendedor1 = new Vendedor("Fulano da Silva", 'M',new BigDecimal(1500), "20112245");
        vendedor1.setTotalVendas(new BigDecimal(50000));

        Vendedor vendedor2 = new Vendedor("Beltrana dos Santos", 'F',new BigDecimal(1500), "20133333");
        vendedor2.setTotalVendas(new BigDecimal(35000));

        gerente1.addSubordinado(vendedor1);
        gerente1.addSubordinado(vendedor2);

        System.out.println("Vendedor 1: " + vendedor1.calcularSalario());
        System.out.println("Vendedor 2: " + vendedor2.calcularSalario());

        System.out.println("Gerente: " + gerente1.calcularSalario());

    }
}
