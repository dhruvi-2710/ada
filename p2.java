import time
import random

def bubble_sort(arr):
    n = len(arr)
    
    for i in range(n):
        swapped = False
        
        for j in range(0, n - i - 1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
                swapped = True
        
        # Optimization: stop if already sorted
        if not swapped:
            break

# Generate large dataset
size = 5000
data = [random.randint(1, 10000) for _ in range(size)]

# Measure execution time
start_time = time.time()

bubble_sort(data)

end_time = time.time()

print("Execution Time:", end_time - start_time, "seconds")
