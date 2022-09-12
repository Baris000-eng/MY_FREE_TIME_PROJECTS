#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'birthdayCakeCandles' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER_ARRAY candles as parameter.
#

#My implementation to the function counting the number of the tallest candles among all candle alternatives
def birthdayCakeCandles(candles):
    maxNum=candles[0]
    maxNumAmount=0
    for j in range(0,len(candles)):
        if candles[j]>=maxNum:
            maxNum=candles[j]
            
    for k in range(0,len(candles)):
        if candles[k]==maxNum:
            maxNumAmount=maxNumAmount+1
            
    return maxNumAmount
    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    candles_count = int(input().strip())

    candles = list(map(int, input().rstrip().split()))

    result = birthdayCakeCandles(candles)

    fptr.write(str(result) + '\n')

    fptr.close()