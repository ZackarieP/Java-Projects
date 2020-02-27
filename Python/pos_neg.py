def pos_neg(a, b, negative):
    if negative == True:
        if a < 0 and b < 0:
            return True
        else:
            return False
    elif a < 0 or b < 0:
        if a < 0 and b < 0:
            return False
        elif negative == False:
            return True
        else:
            return False
    return False


print(pos_neg(1, -1, False))  # True
print(pos_neg(-1, 1, False))  # True
print(pos_neg(-4, -5, True))  # True
print(pos_neg(-5, -6, False))  # False
print(pos_neg(1, 2, False))  # False
