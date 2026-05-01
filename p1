# Selection Sort using user input

def selection_sort(arr):
    n = len(arr)
    
    for i in range(n):
        min_index = i
        
        for j in range(i + 1, n):
            if arr[j] < arr[min_index]:
                min_index = j
        
        # Swap
        arr[i], arr[min_index] = arr[min_index], arr[i]

# Taking input from user
n = int(input("Enter number of elements: "))

arr = []
print("Enter elements:")

for i in range(n):
    element = int(input())
    arr.append(element)

# Sorting
selection_sort(arr)

# Output
print("Sorted array is:")
print(arr)
