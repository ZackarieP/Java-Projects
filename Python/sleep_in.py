def sleep_in(weekday, vacation):
    if vacation == True:
        return True
    elif weekday == False and vacation == True:
        return True
    elif weekday == False and vacation == False:
        return True
    else:
        return False


if __name__ == "__main__":

    print(sleep_in(False, False))  # True
    print(sleep_in(True, False))  # False
    print(sleep_in(False, True))  # True
