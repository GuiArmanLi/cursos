public class Teste {
    public static void main(String[] args) {
        System.out.println("Gerando CPF e CPNJ");
        Pessoa pf = new Pessoa("Gustavo", Documento.CPF.gerarDocumento());
        Pessoa pj = new Pessoa("Boate Gustavinho", Documento.CNPJ.gerarDocumento());

        System.out.println(pf + "\n" + pj);
    }
}
