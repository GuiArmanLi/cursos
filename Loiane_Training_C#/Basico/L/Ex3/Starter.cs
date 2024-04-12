class Starter
{
    static void Main(string[] args)
    {
        Animal[] animais = new Animal[3];
        animais[0] = new Mamifero("Camelo", 150, 4, "Amarelo", 2, "Vegetais");
        animais[1] = new Peixe("Tubarao", 300, 1.5);
        animais[2] = new Mamifero("Urso-do-canada", 180, 4, "Vermelho", 0.5, "Mel");

        for (int i = 0; i < animais.Length; i++)
        {
            System.Console.WriteLine(animais[i].ToString());
        }
    }
}