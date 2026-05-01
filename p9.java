# Coin Change (Minimum Coins) using Dynamic Programming

def coin_change(coins, amount):
    dp = [float('inf')] * (amount + 1)
    dp[0] = 0

    for coin in coins:
        for i in range(coin, amount + 1):
            dp[i] = min(dp[i], dp[i - coin] + 1)

    return dp[amount] if dp[amount] != float('inf') else -1


n = int(input("Enter number of coin types: "))
coins = list(map(int, input("Enter coin values: ").split()))
amount = int(input("Enter amount: "))

result = coin_change(coins, amount)

if result != -1:
    print("Minimum coins required:", result)
else:
    print("Change cannot be made")
