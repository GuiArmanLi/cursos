import java.util.Random;

public enum Documento {
    CPF {
        @Override
        public String gerarDocumento() {
            Random random = new Random();
            long cpfNumber = random.nextLong(0, 99999999999l);

            return String.valueOf(cpfNumber);
        }

    },
    CNPJ {
        @Override
        public String gerarDocumento() {
            Random random = new Random();
            long cnpjNumber = random.nextLong(0, 99999999999999l);

            return String.valueOf(cnpjNumber);
        }
    };

    public abstract String gerarDocumento();
}