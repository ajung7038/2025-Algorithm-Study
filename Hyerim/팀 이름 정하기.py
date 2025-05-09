name = input()
N = int(input())
candidate = []
for i in range(N):
    candidate.append(input())
team_score = 0
team_name = candidate[0]

def word_count(names):
    L = names.count("L")
    O = names.count("O")
    V = names.count("V")
    E = names.count("E")
    return ((L+O) * (L+V) * (L+E) * (O+V) * (O+E) * (V+E)) % 100


for c in candidate:
    score = word_count(name+c)
    if (score > team_score) or (score == team_score and c < team_name):
        team_score = score
        team_name = c
print(team_name)
