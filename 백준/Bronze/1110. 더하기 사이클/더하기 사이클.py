n = int(input())
original_n = n  # 원래 수를 기억해둡니다.
cycle = 0  # 사이클 길이를 0으로 초기화합니다.

while True:
    cycle += 1  # 사이클 길이를 1 증가시킵니다.
    tens = n // 10  # 십의 자리 수를 구합니다.
    ones = n % 10  # 일의 자리 수를 구합니다.
    new_ones = (tens + ones) % 10  # 새로운 수의 일의 자리 수를 구합니다.
    n = ones * 10 + new_ones  # 새로운 수를 만듭니다.
    if n == original_n:  # 새로운 수가 원래 수와 같으면 반복을 종료합니다.
        break

print(cycle)