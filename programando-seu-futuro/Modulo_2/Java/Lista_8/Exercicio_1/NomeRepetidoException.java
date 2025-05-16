public class NomeRepetidoException extends Exception {
    @Override
    public String getMessage() {
        return "Heroi com nome repetido!";
    }

}
