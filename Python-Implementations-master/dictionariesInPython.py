months= {
  "Jan": "January",
  "Feb": "February",
  "Mar": "March",
  "Apr": "April",
  "Jun": "June",
  "price": 15
}
print(months["Feb"])
print(months["Jan"])
print(months["Apr"])
print(months["Jun"])

print()

print(months.get("Feb"))#Same with print(months["Feb"]), returns the value of the "Feb" in the dictionary called months. get() function of dictionaries is used here.
print(months.get("Jan"))#Same with print(months["Jan"])
print(months.get("Mar"))#Same with print(months["Mar"])
print(months.get("Jun"))#Same with print(months["Jun"])

print(months.get("price")) # or print(months.get("price"),15)
