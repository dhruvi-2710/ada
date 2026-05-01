# Quick Sort with large dataset and execution time

import time
import random

def quick_sort(arr):
    if len(arr) <= 1:
        return arr
    
    pivot = arr[len(arr) // 2]
    left = [x for x in arr if x < pivot]
    middle = [x for x in arr if x == pivot]
    right = [x for x in arr if x > pivot]
    
    return quick_sort(left) + middle + quick_sort(right)

size = int(input("Enter size of dataset: "))
data = [random.randint(1, 10000) for _ in range(size)]

start = time.time()
data = quick_sort(data)
end = time.time()

print("Execution Time:", end - start, "seconds")
