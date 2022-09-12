#Linear Search In Python





def linear_search(arr, x):
   for i in range(0,len(arr)):
      if arr[i] == x:
         return i
   return -1
arr = [1,2,3,4,5,6,7,8,9,10]
inp= input("Please enter a number that \nyou want to find in the list: ")
print()
print()
if(linear_search(arr,int(inp))!=-1):
 print("Number found at index "+str(linear_search(arr,int(inp))))
else:
  print("Number is not found in the list !")