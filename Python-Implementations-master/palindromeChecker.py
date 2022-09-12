inputtedText= input("Please enter a text: ") #Getting user input
initialStr= "" #Start of reversing
i= len(inputtedText)-1
while i>=0: 
  initialStr=initialStr+inputtedText[i]
  i=i-1 

print(initialStr) #End of reversing

if(initialStr.lower()==inputtedText.lower()):#Palindrome Checker
  print("The inputted string is palindrome !!")
else:
  print("The inputted string is not palindrome !!")







