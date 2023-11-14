public class ScheduleFullException extends Exception {
    @Override
    public String getMessage() {
        System.out.println("Agenda Cheia. Nao e possivel adicionar mais contatos");
        return "";
    }
}
