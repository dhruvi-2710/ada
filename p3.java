# Insertion Sort with large dataset and execution time

import time
import random

def insertion_sort(arr):
    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1
        
        while j >= 0 and arr[j] > key:
            arr[j + 1] = arr[j]
            j -= 1
        
        arr[j + 1] = key

size = int(input("Enter size of dataset: "))
data = [random.randint(1, 10000) for _ in range(size)]

start = time.time()
insertion_sort(data)
end = time.time()

print("Execution Time:", end - start, "seconds")
