from collections import deque
K = int(input())
lst = []
for i in range(K):
    N, M = map(int, input().split())
    level = list(map(int, input().split()))
    queue = deque()  # 큐 생성
    for i in range(N):
        queue.append((i, level[i]))  # 큐에 N 길이의 문서 번호와 각 중요도 넣기
    target = 0  # 문서의 순서
    while queue:
        file = queue.popleft()  # 큐에 들어간 첫 번째 문서 -> 반복문 내에서 계속 바뀌게 됨
        found = False  # 큐 내에서 조건문 반복되지 않도록 쓰는 변수
        for q in queue:
            if file[1] < q[1]:  # 큐 내에 첫 번째 문서보다 더 높은 중요도를 가진 문서가 있을 때
                found = True
                break
        if found:
            queue.append(file)  # 현재 문서를 뒤로 보내기
        else:  # 현재 문서가 가장 높은 중요도
            target += 1  # 인쇄 순서
            if file[0] == M:  # 현재 문서가 찾던 문서일 때
                lst.append(target)
                break
for l in lst:
    print(l)
