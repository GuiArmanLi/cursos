using System;

class Ex11
{
    static void Main(string[] args)
    {
        Console.WriteLine("Digite 2 numeros");
        int number1 = int.Parse(Console.ReadLine());
        int number2 = int.Parse(Console.ReadLine());

        int smallerNumber = number1 < number2 ? number1 : number2;
        int greaterNumber = smallerNumber == number1 ? number2 : number1;

        int sum = 0;
        for (int i = smallerNumber + 1; i < greaterNumber; i++)
        {
            sum += i;
            Console.Write(i + " ");
        }

        Console.WriteLine("Soma: " + sum);
    }
}