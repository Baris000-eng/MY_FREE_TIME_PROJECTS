def sumNums(arr):
  s=0
  for i in range(0,len(arr)):
    s= s+arr[i]
  return s

def sum_evens(arr):
  sEven=0
  for i in range(0,len(arr)):
    if arr[i]%2==0:
      sEven= sEven+arr[i]
  return sEven

def sum_odds(arr):
  sOdd=0
  for j in range(0,len(arr)):
    if arr[j]%2==1:
      sOdd=sOdd+arr[j]
  return sOdd

def count_odds(arr):
  oddCount=0
  for k in range(0,len(arr)):
    if arr[k]%2==1:
      oddCount=oddCount+1
  return oddCount

def count_evens(arr):
  evenCount=0
  for s in range(0,len(arr)):
    if arr[s]%2==0:
      evenCount=evenCount+1
  return evenCount

def swap_nums(a,b):
  temp=a
  a= b
  b= temp
  print("After swapping, a is: "+str(a))
  print("After swapping, b is: "+str(b))





lst= [14,2,3,4,15,61,7,8,9,11,111]

print(sumNums(lst))
print(sum_evens(lst))
print(sum_odds(lst))
print(count_odds(lst))
print(count_evens(lst))



x = 15
y = 10

swap_nums(x,y)




 