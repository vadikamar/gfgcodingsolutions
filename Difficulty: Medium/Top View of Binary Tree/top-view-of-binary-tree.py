'''
class Node:
    def __init__(self, val):
        self.data = val
        self.left = None
        self.right = None
'''
from collections import defaultdict
class Solution:
    def topView(self, root):
        # code here
        if not root:
            return
        d=defaultdict()
        q=deque()
        q.append([root,0])
        while q:
            node,vertical=q.popleft()
            if vertical not in d.keys():
                d[vertical]=node.data;
            if node.left:
                q.append([node.left,vertical-1])
            if node.right:
                q.append([node.right,vertical+1])
        ans=[]
        for i in sorted(d.keys()):
            t=d[i]
            ans.append(t)
        return ans
        
        