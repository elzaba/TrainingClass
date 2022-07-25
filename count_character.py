string = input("Enter the string : ")
char = input("Enter the character to count: ")
count = 0
for i in range(len(string)):
    if(string[i] == char):
        count = count + 1

print("Number of times ", char, " has occurred = " , count)
