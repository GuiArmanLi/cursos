import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        PhysicalPerson[] physicalPersons = new PhysicalPerson[3];
        LegalPerson[] legalPersons = new LegalPerson[3];

        System.out.println("\nEntre com as Informacoes das Pessoas\n");
        for (int i = 0; i < physicalPersons.length; i++) {
            System.out.println("Digite o nome");
            var name = scan.next();

            System.out.println("Digite seu salario bruto");
            var grossIncome = scan.nextDouble();

            physicalPersons[i] = new PhysicalPerson(name, grossIncome);
        }

        System.out.println("\nEntre com as Informacoes das Empresas\n");
        for (int i = 0; i < legalPersons.length; i++) {
            System.out.println("Digite o nome fantasia");
            var fantasyName = scan.next();

            System.out.println("Digite a receita bruta");
            var grossIncome = scan.nextDouble();

            legalPersons[i] = new LegalPerson(fantasyName, grossIncome);
        }

        for (PhysicalPerson person : physicalPersons) {
            System.out.println("\n" + person.getName() + " paga R$" + person.calculateTax() + " de imposto");
        }

        for (LegalPerson person : legalPersons) {
            System.out.println("\n" + person.getName() + " paga R$" + person.calculateTax() + " de imposto");
        }

        scan.close();
    }
}
