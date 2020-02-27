def makes10(a, b):
    if a == 10 or b == 10:
        return True
    elif a + b == 10:
        return True
    else:
        return False


if __name__ == "__main__":
    print(makes10(9, 10))  # True
    print(makes10(9, 9))  # False
    print(makes10(1, 9))  # True
