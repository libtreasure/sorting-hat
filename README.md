# The Booking.com Sorting Hat #
The focus of this exercise is to practise Mobbing.
![](MarkDownImages/)



## Rules: ##
* Use mob timer (see resources)
* Alternate driver/navigator every 10 mins
* Work in small iterations
* Everyone in the mob is active
* Use TDD (Optional)
* Predict using TDD Predict plug-in (Optional)


# Task 
**In order to boost productivity, the company has decided to introduce a house system similar to that in Harry Potter. 
Each employee will be allocated to one of the following houses: HOTELpuff, RIDESclaw, gryffINSURE and slythCARin will compete**

## Part 1 - Return a random house 
Allocate one of the following houses to an employee at random: Hotelpuff, Ridesclaw, Gryffinsure or Slythcarin.
```
output: "Ridesclaw!"
```
## Part 2 - Return a random house given a name 
Allocate one of the houses to an employee after recieving their name.
```
input: "Harry"

output: "Ridesclaw!"
```

## Part 3 - Add a personalised greeting 
Personalise the house message.
```
input: "Harry"

output: "Harry, you are in Ridesclaw!"
```

## Part 4 - Names beginning with H 
Employees whose names begin with H, such as "Hermione" or "harry" have certain skills therefore they must be allocated to Gryffinsure.
```
input: "Harry"

output: "Harry, you are in Gryffinsure!"
```

## Part 5 - Tom or Voldemort 
If an employees name is Tom or Voldemort then they are not allowed to work at the company.
```
input: "Tom"

output: "Dark Lords are not permitted to work here!"
```

## Part 6 - Surname 
Introduce a surname to the input to avoid confusion when employees have the same name.
```
input: "Harry" "Potter"

output: "Harry, you are in Gryffinsure!"
```
## Part 7 - Families 
Employees with the same surname must be in the same house.
```
input: "Ron" "Weasley"

output: "Ron, you are in Gryffinsure!"

input: "Ginny" "Weasley"

output: "Ginny, you are in Gryffinsure!"
```
## Part 8 - Register 
The CEO wants to be able to see which employees belong to each house. 
```
input: "Gryffinsure"

output: "Ron Weasley", Ginny Weasley", "Harry Potter"
```
## Resources ##

Mob timer https://miro.com/app/board/uXjVKKBUqJI=/?moveToWidget=3458764588329805824&cot=14  

Git Mob Commands https://miro.com/app/board/uXjVKKBUqJI=/?moveToWidget=3458764588324698182&cot=14 
