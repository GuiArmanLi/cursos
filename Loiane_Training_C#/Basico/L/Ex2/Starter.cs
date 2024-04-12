class Starter
{
    static void Main(string[] args)
    {
        PJ veran = new PJ("Veran", 5000);
        System.Console.WriteLine(veran.ToString());
        PJ shibata = new PJ("Shibata", 3000);
        System.Console.WriteLine(shibata.ToString());
        PJ paixao = new PJ("Paixao Contabil", 1000);
        System.Console.WriteLine(paixao.ToString());

        PF guilherme = new PF("Guilherme Pessa", 8000);
        System.Console.WriteLine(guilherme.ToString());
        PF gabriel = new PF("Gabriel Pessa", 5000);
        System.Console.WriteLine(gabriel.ToString());
        PF lucas = new PF("Lucas Pessa", 3000);
        System.Console.WriteLine(lucas.ToString());
    }
}