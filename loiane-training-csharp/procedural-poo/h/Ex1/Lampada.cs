using System;

class Lampada
{
    string marca;
    bool isOn;

    public Lampada() { }
    public Lampada(string marca, bool isOn)
    {
        this.marca = marca;
        this.isOn = isOn;
    }

    public void ligar()
    {
        this.isOn = true;
    }

    public void desligar()
    {
        this.isOn = false;
    }

    public void estadoLamapada() {
        if (this.isOn)
        {
            Console.WriteLine("Lampada esta ligada");
        }
        else
        {
            Console.WriteLine("Lampada esta desligada");
        }
    }

    static void Main(string[] args)
    {
        Lampada lampada = new Lampada("Elgin", false);

        lampada.estadoLamapada();

        lampada.ligar();
        lampada.estadoLamapada();

        lampada.desligar();
        lampada.estadoLamapada();
    }
}