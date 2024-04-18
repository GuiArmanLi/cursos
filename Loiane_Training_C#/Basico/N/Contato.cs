class Contato
{
    private static long _contador = 0;
    private long _id;
    public long Id
    {
        get
        {
            return _id;
        }

    }

    private string _nome;
    public string Nome
    {
        get { return _nome; }
        set { _nome = value; }
    }
    private string _telefone;
    public string Telefone
    {
        get { return _telefone; }
        set { _telefone = value; }
    }

    public Contato(string nome, string telefone)
    {
        _contador++;
        _id = _contador;
        _nome = nome;
        _telefone = telefone;
    }

    public override string ToString()
    {
        return "[ " + "Id: " + _id + ", Nome: " + _nome + ", Telefone: " + _telefone + " ]";
    }
}