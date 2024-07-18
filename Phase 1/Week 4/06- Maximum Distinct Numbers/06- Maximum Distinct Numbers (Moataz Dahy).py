"""M O A T A Z _ D A H Y"""


N = int(input().strip())

num_of_maxnumber = 0
sum_of_numbers = 0

while sum_of_numbers <= N:
    num_of_maxnumber += 1
    sum_of_numbers += num_of_maxnumber

print(num_of_maxnumber - 1)



