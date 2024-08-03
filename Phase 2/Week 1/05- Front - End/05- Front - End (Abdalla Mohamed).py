n = int(input())
a= list(map(int, input().split()))
left, right = 0, n - 1
result = []
while left <= right:
    result.append(a[left])
    left += 1
    if left <= right:
        result.append(a[right])
        right -= 1
print(' '.join(map(str, result)))
