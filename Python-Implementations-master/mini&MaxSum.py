#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'miniMaxSum' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

#My implementation to find the maximum 4-element sum & minimum 4-element sum in an array containing 5 integers.
def miniMaxSum(arr):
    maxElm=0
    minElm=min(arr)
    maxSum=0
    minSum=0
    s=0

    for i in range(0,len(arr)):
        if(arr[i]>=maxElm):
            maxElm=arr[i]
            
    for j in range(0,len(arr)):
        if(arr[j]<=minElm):
            minElm=arr[j]
            
    for k in range(0,len(arr)):
        s=s+arr[k]
        
   
    maxSum=s-minElm #subtracting minimum element from whole sum
    minSum=s-maxElm #subtracting maximum element from whole sum
   
   
    print(str(minSum) + " " +str(maxSum))
            
    

        
    
      
            
        

if __name__ == '__main__':

    arr = list(map(int, input().rstrip().split()))

    miniMaxSum(arr)
