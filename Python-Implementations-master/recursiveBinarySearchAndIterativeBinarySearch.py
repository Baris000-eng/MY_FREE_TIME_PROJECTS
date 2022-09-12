def binary_search(arr, lowInd, highInd, x):
    arr.sort()           # arrayi sırala
    if lowInd>highInd: # küçük indeks (lowInd) büyük indeksten (highInd) büyük olarak yazılmışsa
      temp=lowInd #yer değiştir.
      lowInd=highInd
      highInd=temp

    if highInd >= lowInd:
        middle = (highInd + lowInd) # 2 #ortadaki elemanın indeksi
        if arr[middle] == x: #ortadaki elemanla bulunması hedeflenen eleman eşitse
            return middle #ortadaki elemanın indeksini dön
        elif arr[middle] > x: #bulunması hedeflenen eleman ortadaki elemandan küçükse
            return binary_search(arr, lowInd, middle - 1, x) #veri yapısının sol yarısında tekrar binary search yap.
        else: # bulunması hedeflenen eleman ortadaki elemandan büyükse
            return binary_search(arr, middle + 1, highInd, x) #veri yapısının sağ yarısında tekrar binary search yap.
 
    else: #bulmayı hedeflediğimiz elemanı veri yapımızda bulamadıysak 
        return -1 #-1 dön.

def binary_search2(arr,low,high,x):
  arr.sort()
  if low>high:
    temp2=low
    low=high
    high=temp2

  while high >= low:
        middleIndex = (high + low)//2
        if arr[middleIndex] == x:
            return middleIndex
        elif(arr[middleIndex]<x):
          low= middleIndex+1
        elif(arr[middleIndex]>x):
          high= middleIndex-1
  return -1
          
 
arr = [ 99, 6, 5, 10, 30 ]#Sorted version of this array is [5,6,10,30,99], and the index of 10 in this sorted array is 2.
x = 10
res = binary_search(arr, 0, len(arr)-1, x)
if res != -1:
    print(str(x)+" "+ "is present at index", str(res))
else:
    print("Element is not present in array")

arr2= [1,2,3,4,5]
x2= 4
arr2.sort()
res2= binary_search2(arr2,0,len(arr2)-1,x2)

if res2 != -1:
     print(str(x2)+" "+ "is present at index", str(res2))
else:
    print("Element is not present in array")
