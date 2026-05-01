# Kruskal’s Algorithm (Minimum Spanning Tree) using Greedy Strategy

def find(parent, i):
    if parent[i] != i:
        parent[i] = find(parent, parent[i])
    return parent[i]

def union(parent, rank, x, y):
    root_x = find(parent, x)
    root_y = find(parent, y)

    if rank[root_x] < rank[root_y]:
        parent[root_x] = root_y
    elif rank[root_x] > rank[root_y]:
        parent[root_y] = root_x
    else:
        parent[root_y] = root_x
        rank[root_x] += 1

def kruskal_mst(vertices, edges):
    result = []
    i = 0
    e = 0

    edges = sorted(edges, key=lambda item: item[2])

    parent = []
    rank = []

    for node in range(vertices):
        parent.append(node)
        rank.append(0)

    while e < vertices - 1:
        u, v, w = edges[i]
        i += 1

        x = find(parent, u)
        y = find(parent, v)

        if x != y:
            result.append((u, v, w))
            union(parent, rank, x, y)
            e += 1

    print("Edge : Weight")
    for u, v, w in result:
        print(u, "-", v, ":", w)


v = int(input("Enter number of vertices: "))
e = int(input("Enter number of edges: "))

edges = []
print("Enter edges (u v weight):")
for _ in range(e):
    u, v, w = map(int, input().split())
    edges.append((u, v, w))

kruskal_mst(v, edges)
