using System;

class Ex10
{
    static void Main(string[] args)
    {
        Console.WriteLine("Digite 2 numeros");
        int number1 = int.Parse(Console.ReadLine());
        int number2 = int.Parse(Console.ReadLine());

        int smallerNumber = number1 < number2 ? number1 : number2;
        int greaterNumber = smallerNumber == number1 ? number2 : number1;

        for (int i = smallerNumber + 1; i < greaterNumber; i++)
        {
            Console.Write(i + " ");
        }
    }
}