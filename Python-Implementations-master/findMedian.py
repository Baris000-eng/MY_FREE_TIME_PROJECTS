#!/bin/python3

import math
import os
import random
import re
import sys



#
# Complete the 'findMedian' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER_ARRAY arr as parameter.
#

#My solution to the function finding the median of an array
def findMedian(arr):
    arr.sort()
    if(len(arr)%2==0):
       sumForMedian= arr[(int)((len(arr)-1)/2)]+arr[(int)(((len(arr)-1)/2)+1)]
       sumForMedian=sumForMedian/2
       return sumForMedian
    elif(len(arr)%2==1):
       return arr[(int)((len(arr)-1)/2)]
        
   

if __name__ == '__main__':
    
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    result = findMedian(arr)

    fptr.write(str(result) + '\n')

    fptr.close()