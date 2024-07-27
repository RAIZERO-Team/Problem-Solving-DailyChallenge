# Author: mohamed khalifa
print("\n".join("Good" if "010"  in (s:=input()) or "101" in s else "Bad" for _ in range(int(input())))) 