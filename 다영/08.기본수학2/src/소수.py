m = int(input())
n = int(input())


# 에라토스 테네스의 채
prime = [True] * 10001  # m,n은 10000이하 자연수
prime[0] = False
prime[1] = False
for i in range(2, 10001):
    for j in range(2, 5001):
        if i * j > 1000:
            break
        prime[i*j] = False


min_prime = 10001
total = 0
is_prime = False
for num in range(m, n+1):
    if prime[num]:
        is_prime = True
        total += num
        min_prime = min(min_prime, num)

if is_prime:
    print(total)
    print(min_prime)
else:
    print(-1)
