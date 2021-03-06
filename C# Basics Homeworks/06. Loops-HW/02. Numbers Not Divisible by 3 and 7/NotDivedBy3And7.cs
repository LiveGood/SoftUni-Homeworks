﻿using System;

/*
 * Write a program that enters from the console a positive integer n and prints all the 
 * numbers from 1 to n not divisible by 3 and 7, on a single line, separated by a space. Examples:
 *  n	output
    3	1 2 
    10	1 2 4 5 8 10

 */
class NotDivedBy3And7
{
    static void Main()
    {
        uint n;
        while (true)
        {
            Console.Write("Entere positive integer: ");
            bool tryParse = uint.TryParse(Console.ReadLine(), out n);
            if (tryParse)
            {
                break;
            }
        }

        for (int i = 1; i <= n; i++)
        {
            if (i % 3 == 0 || i % 7 == 0)
            {
                continue;    
            }
            Console.Write(i + " ");
        }
    }
}

