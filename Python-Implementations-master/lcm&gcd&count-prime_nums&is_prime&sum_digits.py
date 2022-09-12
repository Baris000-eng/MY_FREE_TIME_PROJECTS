def sum_digits(n):#A function that sums the digits of the inputted integers
    sumOfDig = 0
    while n>0:
        i= n%10
        sumOfDig += i
        n = n//10
    return sumOfDig

def gcd(a,b):#A function that finds the greatest common divisor of the two integers.
  max_divisor=1
  if a>b:
    for i in range(1,b+1):
      if a%i==0 and b%i==0:
        if i>max_divisor:
          max_divisor=i
  elif b>a:
     for i in range(1,a+1):
      if a%i==0 and b%i==0:
        if i>max_divisor:
          max_divisor=i
  elif b==a:
    return a
  return max_divisor

def lcm(num1,num2):#A function that finds the least common multiple of the two integers.
   i= num2
   j= num1
   if num2>num1:
     if num2%num1==0:
       return num2
     while True:
       i= i+1
       if i%num2==0 and i%num1==0:
         return i
   elif num1==num2:
     return num1
   elif num1>num2:
     if num1%num2==0:
       return num1
     while True:
       j= j+1
       if j%num2==0 and j%num1==0:
         return j

def is_prime(number):#a function that finds whether a number is prime
    b=0
    halfNum=0
    remainder=0
    isPrimeNumber=True
    halfNum=number//2
    if(number==0 or number==1):
        return  not isPrimeNumber
    else:
      for b in range(2,halfNum+1):
            remainder=number%b;
            if(remainder==0):
                isPrimeNumber=False
    return isPrimeNumber

def count_prime_nums(a,b):#A function that counts the prime numbers from a to b, where a<=b.
  if a>b:
    var= a
    a= b
    b= var

  prime_count=0
  for i in range(a,b+1):
    if is_prime(i):
      prime_count=prime_count+1
  return prime_count


def findMinElementIndex(arr): #A function that finds the index of the minimum element
    minElm= arr[0]
    minInd=0
    l= len(arr)
    for j in range(0,l):
        if arr[j]<minElm:
            minElm=arr[j]
            minInd=j
    return minInd

def findMaxElementIndex(arr): #A function that finds the index of the maximum element
    maxElm= arr[0]
    maxInd=0
    l= len(arr)
    for j in range(0,l):
        if arr[j]>maxElm:
            maxElm=arr[j]
            maxInd=j
    return maxInd

     








  

print(lcm(0,0))
print(lcm(3,1))
print(lcm(15,2))
print(lcm(30,45))
print(lcm(20,25)) 
print(lcm(10,12))
print(gcd(0,0))
print(gcd(3,6))
print(gcd(40,45))
print(gcd(100,80))
print(gcd(100,140))
print(sum_digits(229))
print(sum_digits(1234554321))
print(sum_digits(38109542))
print(is_prime(91))
print(is_prime(24))
print(is_prime(47))
print(count_prime_nums(13,33))
print(count_prime_nums(40,21))
print(count_prime_nums(3,5))

