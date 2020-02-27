

def add(x, y):
    return int(x) + int(y)


def subtract(x, y):
    return int(x) - int(y)


def multiply(x, y):
    return int(x) * int(y)


def divide(x, y):

    return float(x) / float(y)


# take input from the user
print("Select operation.")
print("1.Add")
print("2.Subtract")
print("3.Multiply")
print("4.Divide")

choice = input("Enter preferred operation: ")

num1 = input("Enter first number: ")
num2 = input("Enter second number: ")

# print("First number is " + num1)
# print("Second number is " + num2)

if choice == '1':
    print(add(num1, num2))
elif choice == '2':
    print(subtract(num1, num2))
elif choice == '3':
    print(multiply(num1, num2))
elif choice == '4':
    print(divide(num1, num2))
