n = int(input())
li = list(map(int, input().split()))

prime = [True] * 1001

# 에라토스 테네스의 채
prime[0] = False
prime[1] = False
for i in range(2, 1000):
    for j in range(2, 500):
        if i * j > 1000:
            break
        prime[i*j] = False

cnt = 0
for l in li:
    if prime[l]:
        cnt += 1

print(cnt)