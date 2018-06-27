import math
import sys

def prim(n):
	nr = 2
	flag = 0
	prim = []
	while nr <= n:
		flag = 0
		for p in prim:
			if (nr % p == 0):
				flag = 1
				break
		if (flag == 0):
			prim.append(nr)
			#print(nr)
		nr += 1
	return prim

def primfaktoren(n,m):	
	if n < 2:
		n = 2
	if m < n:
		m = n
	primes = prim(m)
	margin = math.log(m, 10) + 1
	for i in range(n,m+1):
		primfaktoren = []
		product = 1
		while product != i:
			for x in primes:
				if (i / product) % x == 0:
					primfaktoren.append(x)
					product *= x
					break
		print(("{:>10}").format(i), ": ", primfaktoren)
		
if (len(sys.argv) == 3):
	primfaktoren(int(sys.argv[1]), int(sys.argv[2]))
else:
	print("Falsche Anzahl an Argumenten")