using System;

class ContatoInexistenteException : Exception
{
    public override string Message
    {
        get { return "Contato inexistente"; }
    }
}