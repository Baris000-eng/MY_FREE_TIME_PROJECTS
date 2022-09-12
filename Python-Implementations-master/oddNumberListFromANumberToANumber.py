#!/bin/python3

import math
import os
import random
import re
import sys



#
# Complete the 'oddNumbers' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts following parameters:
#  1. INTEGER l
#  2. INTEGER r
#
#My solution to the function which is supposed to return an array including all odd numbers in a range
def oddNumbers(l, r):
    arr= []
    for i in range(l,r+1):
        if i%2==1:
            arr.append(i)
    return arr
           
    # Write your code here

if __name__ == '__main__':
    
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    l = int(input().strip())

    r = int(input().strip())

    result = oddNumbers(l, r)

    fptr.write('\n'.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
