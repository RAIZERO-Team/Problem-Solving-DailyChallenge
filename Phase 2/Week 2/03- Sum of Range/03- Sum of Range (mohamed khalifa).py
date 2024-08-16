# Author : mohamed khalifa

a,b=map(int,input().split())

x=max(a,b)
m=min(a,b)
all=(x * (x + 1)) // 2 - ((m - 1) * m) // 2

m_even = m if m % 2 == 0 else m + 1
x_even = x if x % 2 == 0 else x - 1
if m_even <= x_even:
    n_even = ( x_even - m_even ) // 2 + 1
    even = n_even * ( m_even + x_even ) // 2
else:
    even=0

m_odd = m if m % 2 != 0 else m + 1
x_odd = x if x % 2 != 0 else x - 1
if m_odd <= x_odd:
    n_odd = ( x_odd - m_odd ) // 2 + 1
    odd = n_odd * ( m_odd + x_odd ) // 2
else:
    odd=0


print(all)
print(even)
print(odd)



