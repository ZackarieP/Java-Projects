def parrot_trouble(talking, hour):
    if talking == True and (hour < 7 or hour > 20):
        return True
    else:
        return False


if __name__ == "__main__":
    print(parrot_trouble(True, 6))  # True
    print(parrot_trouble(True, 7))  # False
    print(parrot_trouble(False, 6))  # False
