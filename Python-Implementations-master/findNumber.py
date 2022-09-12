#!/bin/python3

import math
import os
import random
import re
import sys



#
# Complete the 'findNumber' function below.
#
# The function is expected to return a STRING.
# The function accepts following parameters:
#  1. INTEGER_ARRAY arr
#  2. INTEGER k
#

def findNumber(arr, k):
    for i in range(0,len(arr)): #Go through the array
        if arr[i]==k: # if k is in the array
            return "YES" #return yes
        else: #otherwise
            return "NO" #return no
    # Write your code here

if __name__ == '__main__':
    
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    arr_count = int(input().strip())

    arr = []

    for _ in range(arr_count):
        arr_item = int(input().strip())
        arr.append(arr_item)

    k = int(input().strip())

    result = findNumber(arr, k)

    fptr.write(result + '\n')

    fptr.close()