#User function Template for python3
from typing import List
import heapq

class Solution:
    def findCity(self, n: int, m: int, edges: List[List[int]], distanceThreshold: int) -> int:
        # Build adjacency list representation of the graph
        graph = {i: [] for i in range(n)}
        for u, v, w in edges:
            graph[u].append((v, w))
            graph[v].append((u, w))

        # Function to perform Dijkstra's algorithm
        def dijkstra(source):
            distances = [float('inf')] * n
            distances[source] = 0
            pq = [(0, source)]  # priority queue to store (distance, node)
            while pq:
                dist, node = heapq.heappop(pq)
                if dist > distances[node]:
                    continue
                for neighbor, weight in graph[node]:
                    new_dist = dist + weight
                    if new_dist < distances[neighbor]:
                        distances[neighbor] = new_dist
                        heapq.heappush(pq, (new_dist, neighbor))
            return distances

        min_neighbors = float('inf')
        city_with_min_neighbors = 0

        # Perform Dijkstra's algorithm from each city and count reachable cities
        for i in range(n):
            distances = dijkstra(i)
            neighbors_within_threshold = sum(1 for d in distances if d <= distanceThreshold)
            if neighbors_within_threshold < min_neighbors or (neighbors_within_threshold == min_neighbors and i > city_with_min_neighbors):
                min_neighbors = neighbors_within_threshold
                city_with_min_neighbors = i

        return city_with_min_neighbors

sol = Solution()

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    T = int(input())
    for t in range(T):
        
        n, m = map(int, input().strip().split())
        edges = []
        for i in range(m):
            u, v, wt = map(int, input().strip().split())
            edges.append([u, v, wt])
        distanceThreshold = int(input())
        obj = Solution()
        ans = obj.findCity(n, m, edges, distanceThreshold)
        print(ans)
            

# } Driver Code Ends