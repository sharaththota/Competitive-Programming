d = {
'A': '.-',
'B': "-...",
'C': "-.-.",
'D': "-..",
'E': ".",
'F': "..-.",
'G': "--.",
'H': "....",
'I': "..",
'J': ".---",
'K': "-.-",
'L': ".-..",
'M': "--",	
'N': "-.",
'O': "---",
'P': ".--.",
'Q': "--.-",
'R': ".-.",
'S': "...",
'T': "-",
'U': "..-",
'V': "...-",
'W': ".--",
'X': "-..-",
'Y': "-.--",
'Z': "--.."	}

n = int(input())
for i in range(n):
	words = eval(input())
	count = 0
	res = {}
	for word in words:
		res_s = ''
		for j in word:
			res_s = res_s + d[(j.upper())]
		if res.get(res_s) is not None:
			pass
		else:
			count += 1
		res[res_s] = 0
	print(count)
