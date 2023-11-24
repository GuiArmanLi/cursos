public class ScheduleFullException extends Exception {
    @Override
    public String getMessage() {
        return "Agenda Cheia. Nao e possivel adicionar mais contatos";
    }
}
