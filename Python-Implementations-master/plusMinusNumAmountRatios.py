#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'plusMinus' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

#My implementation to the function finding the ratios of the amounts of each type of number (negative, positive, or zero)
def plusMinus(arr):
    plusCount=0
    minusCount=0
    zeroCount=0
    totalCount=0
    for i in range(0,len(arr)):
        if arr[i]<0:
            minusCount+=1
        elif arr[i]>0:
            plusCount+=1
        else:
            zeroCount+=1
    
    totalCount=minusCount+plusCount+zeroCount
    minusRatio=minusCount/totalCount
    plusRatio=plusCount/totalCount
    zeroRatio=zeroCount/totalCount
    print("{:.6f}".format(plusRatio))
    print("{:.6f}".format(minusRatio))
    print("{:.6f}".format(zeroRatio))
    
    # Write your code here

if __name__ == '__main__':
    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)