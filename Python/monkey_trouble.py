def monkey_trouble(a_smile, b_smile):
    if a_smile == True and b_smile == True:
        return True
    elif a_smile == False and b_smile == False:
        return True
    else:
        return False


if __name__ == '__main__':
    print(monkey_trouble(True, True))  # True
    print(monkey_trouble(False, False))  # True
    print(monkey_trouble(True, False))  # False
