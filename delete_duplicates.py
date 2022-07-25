string = input("Enter the string : ")
str2 = []
for letter in string:
    if letter not in str2:
        str2.append(letter)
for i in range(0,len(str2)):
    print(str2[i],end="")
