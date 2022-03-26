n = input()
origin_n = n

i = 0
while True:
    if int(n) < 10:
        print(int(n))
        n += '0'

    new_n = str(int(n[0]) + int(n[1]))

    if int(new_n) > 9:
        n = n[1] + new_n[1]
    print(n)

    if n == origin_n:
        break
    n = new_n
    i += 1

print(i)