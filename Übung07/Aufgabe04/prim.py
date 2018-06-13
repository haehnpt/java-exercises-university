
def prim():
	nr = 2
	flag = 0
	prim = []
	while True:
		flag = 0
		for p in prim:
			if (nr % p == 0):
				flag = 1
				break
		if (flag == 0):
			prim.append(nr)
			print(nr)
		nr += 1
	return
	
prim()
