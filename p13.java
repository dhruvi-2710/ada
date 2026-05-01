# Shortest Common Supersequence (SCS) using Dynamic Programming

def scs(X, Y):
    m, n = len(X), len(Y)

    dp = [[0]*(n+1) for _ in range(m+1)]

    for i in range(m+1):
        for j in range(n+1):
            if i == 0:
                dp[i][j] = j
            elif j == 0:
                dp[i][j] = i
            elif X[i-1] == Y[j-1]:
                dp[i][j] = 1 + dp[i-1][j-1]
            else:
                dp[i][j] = 1 + min(dp[i-1][j], dp[i][j-1])

    # reconstruct SCS string
    i, j = m, n
    scs_str = []

    while i > 0 and j > 0:
        if X[i-1] == Y[j-1]:
            scs_str.append(X[i-1])
            i -= 1
            j -= 1
        elif dp[i-1][j] < dp[i][j-1]:
            scs_str.append(X[i-1])
            i -= 1
        else:
            scs_str.append(Y[j-1])
            j -= 1

    while i > 0:
        scs_str.append(X[i-1])
        i -= 1

    while j > 0:
        scs_str.append(Y[j-1])
        j -= 1

    return "".join(reversed(scs_str))


X = input("Enter first string: ")
Y = input("Enter second string: ")

result = scs(X, Y)

print("Shortest Common Supersequence:", result)
