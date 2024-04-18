using System;

class AgendaCheiaException : Exception
{
    public override string Message
    {
        get { return "Agenda cheia!"; }
    }
}