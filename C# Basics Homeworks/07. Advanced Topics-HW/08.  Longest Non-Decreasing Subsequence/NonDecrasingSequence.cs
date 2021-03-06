﻿using System;
using System.Collections.Generic;

// this solutiion of the problem does not work corectly for the 3rd and 4rth input because
// "1 1 1 2 2 2" is non-decreasing subsequence as well 

/*
 * Problem 8.	* Longest Non-Decreasing Subsequence
    Write a program that reads a sequence of integers and finds in it the longest
    non-decreasing subsequence. In other words, you should remove a minimal number
    of numbers from the starting sequence, so that the resulting sequence is non-decreasing.
    In case of several longest non-decreasing sequences, print the leftmost of them. 
    The input and output should consist of a single line, holding integer numbers
    separated by a space. Examples:
    Input	                                Output
    1	                                    1
    7 3 5 8 -1 6 7	                        3 5 6 7
    1 1 1 2 2 2	                            1 1 1
    1 1 1 3 3 3 2 2 2 2	                    2 2 2 2
    11 12 13 3 14 4 15 5 6 7 8 7 16 9 8	    3 4 5 6 7 8 9

 */
class NonDecrasingSequence
{
    static void Main()
    {
        while (true)
        {
            string input = Console.ReadLine();
            string[] splitArray = input.Split();
            int[] numbers = new int[splitArray.Length];

            for (int i = 0; i < numbers.Length; i++)
            {
                numbers[i] = int.Parse(splitArray[i]);
            }

            LongestNonDecreasingSequence(numbers);
        }
    }

    private static void LongestNonDecreasingSequence(int[] numbers)
    {
        List<int> previosSequnce = new List<int>();

        for (int i = 0; i < numbers.Length; i++)
        {
            List<int> currentSequence = new List<int>();
            int currentElement = numbers[i];
            for (int k = i; k < numbers.Length; k++)
            {
                if (numbers[k] >= currentElement)
                {
                    bool addElement = true;
                    for (int j = k + 1; j < numbers.Length; j++)
                    {
                        if (numbers[j] >= currentElement && numbers[j] < numbers[k] && !currentSequence.Contains(numbers[j]))
                        {
                            addElement = false;
                            break;
                        }
                    }

                    if (addElement)
                    {
                        currentElement = numbers[k];
                        currentSequence.Add(currentElement);
                    }
                }

                if (currentSequence.Count > previosSequnce.Count)
                {
                    previosSequnce = currentSequence;
                }
            }
        }
        Console.WriteLine(string.Join(" ", previosSequnce));
    }
}
