#!/bin/python3

import math
import os
import random
import re
import sys


#
# Complete the 'missingCharacters' function below.
#
# The function is expected to return a STRING.
# The function accepts STRING s as parameter.
#

#this is a function prints the missing charachters in the string s. (Rule: the numbers come before the letters in the printed string)
def missingCharacters(s):
    controlStr='0123456789abcdefghijklmnopqrstuvwxyz'
    strOut=''
    for letter in controlStr:
        if letter not in s:
            strOut+=letter
    return strOut
    
    # Write your code here
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = missingCharacters(s)

    fptr.write(result + '\n')

    fptr.close()