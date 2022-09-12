swhile True:
 inputText= input("Please enter a text of \nwhich the acronym will be created: ")

 if(inputText==""):
   break

 arr= inputText.split(" ")
 initialStr= ""
 for i in range(0,len(arr)):
  initialStr= initialStr+arr[i][0]


 initialStr= initialStr.upper()
 print()
 print("The acronym of the inputted text is : "+initialStr)

 print()
 print()
