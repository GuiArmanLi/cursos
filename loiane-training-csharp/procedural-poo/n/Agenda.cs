using System;

class Agenda
{
    private Contato[] _contatos;
    public Contato[] Contatos
    {
        get
        {
            return _contatos;
        }
    }

    public Agenda()
    {
        _contatos = new Contato[10];
    }


    public string AdicionarContato(Contato contato)
    {
        try
        {
            return SalvarContato(contato);
        }
        catch (AgendaCheiaException e)
        {
            return e.Message;
        }
    }

    private string SalvarContato(Contato contato)
    {
        if (AgendaEstaCheia())
        {
            throw new AgendaCheiaException();
        }
        else if (ExisteContatoIgual(contato))
        {
            return "Contato existente";
        }
        else
        {
            for (int i = 0; i < _contatos.Length; i++)
            {
                if (_contatos[i] == null)
                {
                    _contatos[i] = contato;

                    return "Contato adicionado!";
                }
            }

            return null;    //Se chega nesse ponto entao tem contato nulo, mas o compilador n entende
        }
    }

    private bool ExisteContatoIgual(Contato contato)
    {
        for (int i = 0; i < _contatos.Length; i++)
        {
            if (_contatos[i] != null)
            {
                if (_contatos[i].Nome == contato.Nome ||
                    _contatos[i].Telefone == contato.Telefone)
                {
                    return true;
                }
            }
        }

        return false;
    }

    private bool AgendaEstaCheia()
    {
        for (int i = 0; i < _contatos.Length; i++)
        {
            if (_contatos[i] == null)
            {
                return false;
            }
        }

        return true;
    }


    public string ConsultarContato(long id)
    {
        try
        {
            var contato = ConsultarContatoPorId(id);
            return contato.ToString();
        }
        catch (ContatoInexistenteException e)
        {
            return e.Message;
        }
    }

    private Contato ConsultarContatoPorId(long id)
    {
        for (int i = 0; i < _contatos.Length; i++)
        {
            if (_contatos[i] != null && _contatos[i].Id == id)
            {
                return _contatos[i];
            }
        }

        throw new ContatoInexistenteException();
    }

    public override string ToString()
    {
        string str = "[";
        for (int i = 0; i < _contatos.Length; i++)
        {
            if (_contatos[i] != null)
            {
                str += "\n\t" + _contatos[i].ToString();
            }
        }

        return str += "\n]";
    }
}