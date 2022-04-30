def slidingWindow(Arr, K, N):
    end, currentMax = K, -10
    for i in range(N + 1 - K):
        if sum(Arr[i:end]) > currentMax: currentMax = sum(Arr[i:end])
        end += 1
    return currentMax

arr2 = [100,200,300,400]
print(slidingWindow(arr2, 2, len(arr2)))