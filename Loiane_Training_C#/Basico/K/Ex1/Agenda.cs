class Agenda
{
    public string nome = " ";
    public Contato[] contatos = new Contato[3];
    
    public Agenda()
    {
        for (int i = 0; i < contatos.Length; i++)
        {
            contatos[i] = new Contato();
        }
    }
}