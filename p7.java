# Prim's Algorithm (Minimum Spanning Tree) using Greedy Strategy

import sys

def prim_mst(graph, n):
    selected = [False] * n
    selected[0] = True

    no_edge = 0

    print("Edge : Weight")

    while no_edge < n - 1:
        minimum = sys.maxsize
        x = 0
        y = 0

        for i in range(n):
            if selected[i]:
                for j in range(n):
                    if (not selected[j]) and graph[i][j]:
                        if minimum > graph[i][j]:
                            minimum = graph[i][j]
                            x = i
                            y = j

        print(x, "-", y, ":", graph[x][y])
        selected[y] = True
        no_edge += 1


n = int(input("Enter number of vertices: "))

print("Enter adjacency matrix:")
graph = []
for i in range(n):
    row = list(map(int, input().split()))
    graph.append(row)

prim_mst(graph, n)
