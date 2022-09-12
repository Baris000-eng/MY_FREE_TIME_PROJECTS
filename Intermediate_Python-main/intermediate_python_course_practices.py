# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""
#Lists: ordered, mutable, and allows duplicate elements.

lst1 = ["banana","cherry","apple"]
print(lst1)


lst1.append("lemon")
print(lst1)




lst1.insert(2,"blueberry")
print(lst1)




fruit = lst1.pop(3)
print(fruit)
print(lst1)



lst1.remove("cherry")
print(lst1)


lst1.reverse()
print(lst1)


lst1.sort()
print(lst1)


lst = [4,5,3,2,-1,1,11,111,0,99,-34,50,66,71,23,48,84]
lst.sort()
print(lst)



lst.clear()
print(lst)





list2 = sorted(lst)
print(list2)



myList = [0] * 6
print(myList)



myList2 = [1,2,3,4,5]


new_list = myList + myList#concatinating 2 lists
print(new_list)





l = [1,2,3,4,5,6,7,8]
b = l[1:5]
print(b) #it will print [2,3,4,5]. The last index will be excluded.

c = l[:5] #from the beginnning till the index 4.
d = l[1:] #from the index 1 to the last index in the list.

print(c)
print(d)


e = l[1::1] # start from index 1 and go till the last index with a step size 1.
print(e)
f = l[1::2]# start from index 1 and go till the last index with a step size 2.
print(f)



original_list = ["a","b","c"]


copy_list = original_list

print(copy_list)


copy_list.append("lemon")

print(copy_list)
print(original_list)

copy_list2 = original_list.copy()
print(copy_list2)


w = original_list[:] # copy all elemenets of original_list to w.
print(w)

g = l[::-1] #used for reversing the list
print(g)




aList = [1,2,3,4,5,6]

bList = [j*j for j in aList] #list comprehension

print(aList)
print(bList)


#Tuples: ordered, immutable, allows duplicate elements

myTuple = ("Max", 28, "Boston")
print(myTuple)


myTuple2 = ("Baris",)
tup = ("Baris")


print(type(myTuple2)) #will print tuple
print(type(tup)) # will print string





q = tuple(["max",1,1,1,2,2,2,2,3,3,3,3,3,3,3,3,"max",2,3,"hello"])
print(q)



item = q[0]
print(q)
item = q[1]
print(q)
item = q[2]
print(q)
item = q[-1] #refers the last item in the tuple
print(q)



# q[2] = 3 # will throw error since the tuples are immutable in python.

 # print(q[2])
 
for k in q:
    print(k)
    
    
    
if "max" in q:
    print("yes")
else:
    print("no")
    

if(1 in q or 2 in q or 3 in q):
    print("yes")
else:
    print("no")
    
    
print("tuple length is "+str(len(q)))



print(q.count(1))
print(q.count(2))
print(q.count(3))
print(q.count("max"))




print(q.index(1)) # returns the index of the first occurrence of 1.
print(q.index(2)) # returns the index of the first occurence of 2.
print(q.index(3)) # retuurns the index of the first occurence of 3.



my_Tuple3 = tuple(original_list) # will convert the original_list to a tuplle.
print(my_Tuple3)




t1 = "Max", 28, "Boston"
name , age, city = t1
print(name) #will print "Max".
print(age) #will print 28.
print(city) #will print "Boston".


#Dictionary: Key-Value pairs, Unordered, Mutable


dictionary = {"name": "Max", "age": 28, "city": "New York"}
print(dictionary)




dict2 = dict(name = "Baris", age=24, city="Berlin") #using dict() function to create a dictionary with the parameters inside the dict() function
print(dict2)


print(dict2["name"]) # will print the corresponding name in the value part.
print(dict2["age"]) #will print the corresponding age in the value part.
print(dict2["city"])  #will print the corresponding city in the value part.




dictionary["email"] ="abcdefg@gmail.com" #email, abcdefg@gmail.com pair will be added at the end of the dictionary called dictionary.
print(dictionary)




del dictionary["name"]
print(dictionary)


#del dictionary["hello"] # will throw error since "hello " is not a key of the dictionary called dictionary.
#print(dictionary)



dictionary.pop("age")
print(dictionary)



dictionary.popitem() # will delete the last inserted item to the dictionary.

print(dictionary)




for key in dictionary.keys():
    print(key)
    
    
for value in dictionary.values():
    print(value)
    
    
    
for key,value in dictionary.items():
    print(key)
    print(value)


dt = {"name": "Mike", "age": 33, "email": "wetzp@gmail.com"}
dt2 = dict(name = "John", age = 45, city = "Chicago")


dt.update(dt2) #will overwrite the values of dt2 to dt. Moreover, it combines 2 dictionaries.

print(dt)



dt3 = {4:16, 9:81, 12:144, 16:256}
print(dt3)


value= dt3[9]
print(value)


t = (8,7)
my_dictionary = {t: 15}
print(my_dictionary)



#Sets: unordered, mutable, no duplicates

my_set = {4,4,4,4,3,3,3,3,5,5,6,6,-1,3,3,4,4,5,5,6,6,9,9,9,9,9,9,9,9,9}
print(my_set)

my_set2 =  set({4,4,4,4,3,3,3,3,5,5,6,6,-1,3,3,4,4,5,5,6,6,9,9,9,9,9,9,9,9,9}) #for creating a set, we can use set() function.
print(my_set2)




s = set()
print(s)
print(type(s))


for i in range(1,5):
    s.add(i) # for adding an element to the set s, we use add() method.
    
print(s)



s.remove(2) #for removing an element from the set s, we use remove() method.
print(s)




s.discard(4) # will remove the element 4, if it is not in the set, it will ignore the removal.
print(s)





for i in s:
    print(i)
    
    
    
if 1 in s: # will check whether 1 is in the set s.
    print("yes")
else:
    print("no")
    
    
    
    
    
odd_numbers = {1,3,5,7,9}
even_numbers = {0,2,4,6,8}
prime_numbers = {2,3,5,7}

un = odd_numbers.union(even_numbers) # finds the union of two sets without duplicatipn.
print(un)


intersect = odd_numbers.intersection(even_numbers) #finds the intersection of two sets.
print(intersect)


i2 = odd_numbers.intersection(prime_numbers)
print(i2)



df = odd_numbers.difference(prime_numbers) #finds the unique elemenets inside the odd_numbers set.
#finds the elements inside the odd_numbers set which are not inside the prime_numbers set.
print(df)



print("Before the difference function call !!")
print(prime_numbers)
print(odd_numbers)
df2 = prime_numbers.difference(odd_numbers)
print(df2)

print("After the difference function call !!")



sym = odd_numbers.symmetric_difference(prime_numbers) # will return all of the elemenets except the elements inside the intersection of two sets.
print(sym)



print(odd_numbers)
print(prime_numbers)
prime_numbers.intersection_update(odd_numbers)

print(prime_numbers)
print(odd_numbers)

prime_numbers.add(11)

print("before difference update function !")
print(prime_numbers)
print(odd_numbers)
prime_numbers.difference_update(odd_numbers)
print(prime_numbers)
print("after difference update function !")




s1 = {1,2,3,4}
s2 = {1,2,3,4,5,6,7,8,9,10}



print(s1.issubset(s2))
print(s2.issubset(s1))



print(s1.issuperset(s2))
print(s2.issuperset(s1))


print(s1.isdisjoint(s2)) # checks if s1 is disjoint from s2
print(s2.isdisjoint(s1)) # checks if s2 is disjoint from s1



s3 = s1



s3.add(111)
print(s3)



#Strings: ordered, immutable, text representation



my_string = "Hello World !!"
print(my_string)



str2 = "I'm a programmer"
print(str2)


str3 = """Hello
World"""
print(str3)

ch = str3[6]
print(ch)




substring = my_string[1:5] # index 5 is excluded !!
print(substring)


substr = my_string[::2] #take the indexes by using the step size as 2.
print(substr)


rev = my_string[::-1] #for reversing the string
print(rev)


greetings = "Hello"

if 'e' in greetings:
    print("yes")
else:
    print("no")

for i in greetings:
    print(i)
    
    
    
string10 = '                Hello World        '
print(string10)


string10 = string10.strip() #removes the white spaces at the beginning and end of a string. 
print(string10)




string11 = "Hello World"
print(string11.upper()) #prints the uppercase version of string11.
print(string11.lower())  #prints the lowercase version of string11.

print(string11.startswith('Hello')) #checks if the string starts with the specified character / string
print(string11.startswith('World'))
print(string11.endswith('World'))


print(string11.find('o')) # prints the index of the first occurence of o.

print(string11.count('o'))
print(string11.count('l'))


print(string11.replace('World','Universe'))


sample_string = 'how are you doing'
my_list = sample_string.split(" ")
print(my_list)



new_string = ' '.join(my_list) #combines all of the elements in the list back into a string
print(new_string)

from timeit import default_timer as timer
lst = ['a']*100000
#print(lst)

start = timer()
#bad version
blank_str = ''
for i in lst:
    blank_str +=i
stop = timer()
print(stop-start)
#print(blank_str)

start = timer()
#better version
blank_str = ''.join(lst)
stop = timer()
print(stop-start)
#print(blank_str)



var = "Mike"
string = "the variable is %s" % var
print(string)



v = 3.1234567
var2 = 9
myStr = "the variable is %d" % v #since we specify the number as integer, it will print "the variable is 3".
print(myStr)



myString = "the variable is %.2f" %v #print the decimal with 2 decimal precision.
print(myString)



myStringVar = "the variable is {:.2f} and {}".format(v,var2)
print(myStringVar)


myStringVariable = f"the variable is {v} and {var2}" #f string example. 
print(myStringVariable)


#Collections: Counter, namedtuple, OrderedDict, defaultdict, deque

from collections import Counter
a = "aaabbbbbbcccdhdhhdhdhhdhdhdhknwknfkewklnklwefnpowekfpoweçqmlkwnjddıuwojwqişklşelşweiiwiiiiiiiweşwemqqq"
co = Counter(a)
print(co.items())
print(co.keys())
print(co.values())
print(co.most_common(1)) #will print most common element
print(co.elements())


from collections import namedtuple
Point = namedtuple('Point', 'x,y') #this will create a class called Point with the fields x and y.
pt = Point(1,-5)
print(pt)
print(pt.x,pt.y)


from collections import OrderedDict

ordered_dict = OrderedDict()
ordered_dict['a'] = 1
ordered_dict['b'] = 2
ordered_dict['c'] = 3
ordered_dict['d'] = 4

print(ordered_dict) #prints the element in the insertion order.


from collections import defaultdict

d = defaultdict(int)
d['a'] = 1
d['b'] = 2
d['c'] = 3

print(d)

print(d['a'])
print(d['b'])
print(d['c'])
print(d['e']) #since e does not exist, it will return the default value of the type that we specified (int).


from collections import deque

deq = deque()

deq.append(1)
deq.append(2)
deq.append(3)
deq.append(4)

deq.appendleft(9)
deq.appendleft(7)
print(deq)


deq.pop() # it will remove the last element.
print(deq)


deq.popleft()
print(deq)



deq.extend([5,9,10,11,12,13,14,15])
print(deq)



deq.extendleft([4,5,6]) #it will extend the deque to the left.
print(deq)


deq.rotate(1) # it will rotate all elements 1 place to the right.
print(deq)

deq.rotate(-1) # it will rotate all elements 1 place to the left.
print(deq)



#itertools: product, permutation, combination, accumulate, groupby and infinite iterators


from itertools import product
a = [1,2]
b = [3,4]
prod = product(a,b)
prod = list(prod) # converts object to list
print(prod)


pr = product(a,b,repeat = 2)
print(list(pr))


from itertools import permutations
cArr = [1,2,3]
perm = permutations(cArr) #tüm sıralamaları buluyor. (finds all orderings)
print(list(perm))


prm = permutations(cArr,2)
print(list(prm))


from itertools import combinations
l = [2,3,4,5]
comb = combinations(l,2)
print(list(comb))
comb2 = combinations(l,3)
print(list(comb2))


from itertools import combinations_with_replacement

combination_wr = combinations_with_replacement(l, 2) #makes also combinations with the each of the numbers itself.
print(combination_wr)
print(list(combination_wr))



from itertools import accumulate
my_custom_list = [4,5,4,4,4,4,3,3,3,3,3,3,6,7,8]
acc = accumulate(my_custom_list)
print(my_custom_list)
print(list(acc))



acc2 = accumulate(my_custom_list, func = max) #finds the current max while iterating the list, and creates a list with the current max numbers.
print(list(acc2))


from itertools import groupby

def smaller_than_5(x):
    return x<5

lst_val = [4,5,6,7,8]
group_object = groupby(lst_val, key=smaller_than_5) #groups the elements depending on the content of smaller_than_5 function.


for key,value in group_object:
    print(key,list(value))
    
    
    
    
group_object = groupby(lst_val, key = lambda x: x<5)
for key,value in group_object:
    print(key,list(value))
    
    
    
from itertools import count,cycle,repeat


for i in count(10):
    print(i)
    if i==1000:
        break
    
    
aLst = [1,2,3]
for j in cycle(aLst): 
    print(j)# will print 1,2,3 in repeated cycles
    if(j==3):
        break
     
     
     
for h in repeat(2,5):
    print(h) # it will print '2' 5 times.
    
    
#Lambda Function:
#lambda arguments: expression


add10 = lambda x: x + 10
print(add10(5))


def add10_func(y):
    return y + 15

print(add10_func(5))



multiply = lambda x,y: x*y


print(multiply(2,9))
print(multiply(8,76))



points2D = [(1,2),(15,1),(5,-1),(10,4)]
points2D_sorted = sorted(points2D, key=lambda x: x[0]+x[1])
points2D_sorted2 = sorted(points2D, key=lambda x: x[0])
points2D_sorted3 = sorted(points2D, key=lambda x: x[1])
    

print(points2D)
print(points2D_sorted)
print(points2D_sorted2)
print(points2D_sorted3)


#map function
b_list = [1,2,3,4,5]
b_map = map(lambda x: x*2, b_list)
print(list(b_map))



comp = [x*2 for x in b_list]
print(comp)


#filter function
b_list2 = [1,2,3,4,5,6]
b_filter = filter(lambda x: x%2==0,b_list2)
print(list(b_filter))


#reduce function
from functools import reduce
b_list3 = [1,2,3,4,5,6,7,8,9,10]
prod_b = reduce(lambda x,y: x*y, b_list3)
print(prod_b) #prints the product of all elements in the list.


#Errors and Exceptions

# a= 5 + '10' => TypeError: unsupported operand type(s) for +: 'int' and 'str'

#a = 5
#b = gsd NameError: name 'gsd' is not defined


#f = open('somefile.txt') FileNotFoundError: [Errno 2] No such file or directory: 'somefile.txt'

#b_list2.remove(9) ValueError: list.remove(x): x not in list


x = -5

if x < 0:
   # raise Exception('x should be positive !')
    
    
    
#assert(x >=0), 'x is not positive' AssertionError: x is not positive
    try:
        a = 11/0
    except Exception as e:
        print(e)
        print('An error happened !')
    
    
    try:
        k = 7 / 0
        v = k * 4
    except ZeroDivisionError as e:
        print(e)
    except TypeError as e:
        print(e)
    else:
        print("Everything is fine !")
    finally:
        print("cleaning up")
    
    
class ValueTooHighError(Exception):
    pass


class ValueTooSmallError(Exception):
    def __init__(self,message,value):
        self.message = message
        self.value = value
        


def test_value(x):
    if x > 100:
        raise ValueTooHighError('value is too high !')
    
    if x < 5:
        raise ValueTooSmallError('value is too small !')
        
        
        


test_value(90) 
test_value(101)
test_value(201)
test_value(110)
test_value(77)
test_value(3)
test_value(4)
test_value(5)
test_value(6)


#Logging in Python:

import logging 

logger = logging.getLogger(__name__)
logger.info('hello from helper')

formatter = logging.Formatter('%(asctime)s - %(name)s - %(levelname)s - %(message)s')

logging.debug('This is a debug message')
logging.info('This is am info message')
logging.warning('This is a warning message')
logging.error('This is an error message')
logging.critical('This is a critical message')


l = logging.getLogger(__name__)


stream_h = logging.StreamHandler()
file_h = logging.FileHandler('file.log')


#levvel an the format
stream_h.setLevel(logging.WARNING)
file_h.setLevel(logging.ERROR)



formatter = logging.formatter('%(name)s - %(levelname)s - %(message)s')
stream_h.setFormatter(formatter)

file_h.setFormatter(formatter)

logger.addHandler(stream_h)
logger.addHandler(file_h)


import json
person = {"name":"John", "age": 30, "city": "New York", "hasChildren":False}

personJSON = json.dumps(person,indent=4,sort_keys=True)

with open ('person.json', 'r') as file:
    person = json.load(personJSON)
print(person)





class User:
    
    def __init__(self,name,age):
        self.name = name
        self.age = age
        
        
user = User('max',33)


def encode_user(o):
    if isinstance(o,User):
        return {'name': o.name, 'age': o.age, o.__class__.__name__:True}
    else:
        raise TypeError('Object of type user is not JSON serializable !')
        
        
        

        
import random
random.seed(1)  
print(random.random()) 
print(random.randint(1,10))

random.seed(2) 
print(random.random()) 
print(random.randint(1,10))   

random.seed(1)  
print(random.random()) 
print(random.randint(1,10))


import secrets

a = secrets.randbelow(5)
b = secrets.randbits(5)

my_lst = list("ABCDEFG")
c = secrets.choice(my_lst)

print(a)
print(b)
print(c)



import numpy as np

my_arr = np.random.rand(5)
print(my_arr)


my_arr2 = np.random.rand(500)
print(my_arr2)


my_arr3 = np.random.randint(0,10,3)
print(my_arr3)

my_arr3 = np.random.randint(0,10,(4,3))
print(my_arr3)



arr = np.array([[1,2,3],[4,5,6],[7,8,9]])
print(arr)


np.random.shuffle(arr) #only changes the axis horizontally
print(arr)


from multiprocessing import Process, Value, Array,Lock
import os
import time


def square_numbers():
    for i in range(0,100):
        i*i
        time.sleep(0.1)
        
        
def add_100(number,lock):
    for i in range(0,100):
        time.sleep(0.01)
        lock.acquire()
        number.value+=1
        lock.release()
   
    
        
        
processes = []
num_processes = os.cpu_count()



#create the processes
for i in range(num_processes):
    p = Process(target = square_numbers)
    processes.append(p)
    
    
#start the processes
for p in processes:
    p.start()
    
    
#join the processes
for p in processes:
    p.join()
    
print('end main')


from threading import Thread,Lock,current_thread
from queue import Queue

import os
import time


def square_numbers():
    for i in range(0,100):
        i*i
        time.sleep(0.1)
        
        
threads = []
num_threads = os.cpu_count()



#create the processes
for i in range(num_threads):
    p = Thread(target = square_numbers)
    threads.append(p)
    
    
#start the threads
for t in threads:
    t.start()
    
    
#join the processes
for t in threads:
    t.join()
    
print('end main')


database_value = 0

def increase_value():
    global database_value
    lock.acquire()
    
    #processing
    local_copy = database_value
    local_copy+=1
    time.sleep(0.1)
    database_value = local_copy
    lock.release()
    
def worker(q,lock):
    while True:
        value = q.get()
        
        with lock:
        #processing ..
            print({current_thread().name},{value})
        
        q.task_done()

if __name__ == "__main__":
    
    lock = Lock()
    print('the start value: ', database_value)
    
    thread1 = Thread(target = increase_value(),args = (lock,))
    thread2 = Thread(target = increase_value(), args =(lock,))
    thread1.start()
    thread2.start()
    thread1.join()
    thread2.join()
    
    print('the end value: ', database_value)
    
    
    q = Queue()
    q.put(1)
    q.put(2)
    q.put(4)
    
    num_threads = 10
    for j in range(num_threads):
        thread = Thread(target=worker, args=(q,lock))
        thread.daemon = True
        thread.start()
        
        
    for i in range(1,21):
        q.put(i)
        
    q.join()
     
     
     # 4 2 1 -->
    first = q.get()
    print(first)
     
    second = q.get()
    print(second)
     
     
    print(q.empty()) # returns true if the queue is empty.
     
     
    q.task_done()
    q.join()
    
    print('end mainn')
    
    shared_number = Value('i',0)
    print('Number at the beginning is ',shared_number.value)
    
    p1 = Process(target=add_100,  args = (shared_number,lock))
    p2 = Process(target=add_100,  args = (shared_number,lock))
    
    p1.start()
    p2.start()
    
    p1.join()
    p2.join()
    
    
    print('Number at the end is',shared_number.value)
    
    
    
    
    
    
def foo(a,b,c):
    print(a,b,c)
    
    
ls = [0,1,2]
foo(*ls)



def foo2(a_list):
    a_list = [200,300,400]
    a_list.append(7)
    a_list[1]  = -334
    
def foo3(a_list):
    a_list.append(111)
    a_list[1]  = -334
    
    
    
    
my_list = [4,5,6,9,88]
foo2(my_list)
print(my_list)


foo3(my_list)
print(my_list)


result = 5 * 7
print(result)



r = 2 ** 4 #2 to the power of 4
print(r)


zeros = [0] * 10
print(zeros)

multipleInitials = "AB" * 12
print(multipleInitials)


def fooo(a,b, * args, **kwargs):
    print(a)
    for arg in args:
        print(arg)
    for key in kwargs:
        print(key,kwargs(key))
    
    
fooo(1,2,3,4,5,six=6,seven=7)


def f(x,y,z):
    print(x,y,z)
    
l = [2,3,4]
f(*l) #unpacking a list


dct = {'a': 1, 'b': 2, 'c': 3}
f(**dct) #unpacking a dictionary

number_vals = [1,2,3,4,5,6,7,8,9,10]
*beginning, last = number_vals
print(beginning) #1,2,3,4,5,6,7,8,9
print(last) #10


my_Tup = (1,2,3)
my_Lis = {4,5,6}

new_Lis = [*my_Tup,*my_Lis]
print(new_Lis)


#shallow copy: one level deep, only references of nested child objects
#deep copy: full independent copy

#A shallow copy means constructing a new collection 
#object and then populating it with references to 
#the child objects found in the original.


#Deep copy is a process in which the copying process 
#occurs recursively. It means first constructing a 
#new collection object and then recursively populating 
#it with copies of the child objects found in the original. 
orig = 5
cpy = orig
print(cpy)
cpy = 6
print(orig,cpy)


org = [1,2,3,4,5]
cop = org
cop[0] = -1000
print(cop)
print(org)


import copy

o = [1,2,3,4]
c = copy.copy(o) 
c[1] = 3000#original list is effected in copy
print(c)
print(org)
d = copy.deepcopy(o) 
d[2] = 50000#original list is not effected in deepcopy
print(d)
print(org)

    
