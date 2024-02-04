#User function Template for python3

class Solution:
    def subLinkedList(self, l1, l2): 
        # Code here
        # return head of difference list
        a=""
        b=""
        cur=l1
        while cur:
            a+=str(cur.data)
            cur=cur.next
        cur1=l2
        while cur1:
            b+=str(cur1.data)
            cur1=cur1.next
        n1=int(a)
        n2=int(b)
        n3=str(abs(n1-n2))
        x = Node(n3[0])
        t = x
        for i, v in enumerate(n3):
            if i != 0:
                new = Node(v)
                t.next = new
                t = new
        
        return x



#{ 
 # Driver Code Starts
#Initial Template for Python 3

# Node Class
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

# Linked List Class
class LinkedList:
    def __init__(self):
        self.head = None
        self.tail = None

    # creates a new node with given value and appends it at the end of the linked list
    def insert(self, val):
        if self.head is None:
            self.head = Node(val)
            self.tail = self.head
        else:
            self.tail.next = Node(val)
            self.tail = self.tail.next

# prints the elements of linked list starting with head
def printList(n):
    while n:
        print(n.data,end='')
        n = n.next
    print()

if __name__ == '__main__':
    for _ in range(int(input())):
        
        n = int(input())
        arr1 = ( int(x) for x in input() )
        LL1 = LinkedList()
        for i in arr1:
            LL1.insert(i)
        
        m = int(input())
        arr2 = ( int(x) for x in input() )
        LL2 = LinkedList()
        for i in arr2:
            LL2.insert(i)
        
        ob = Solution()
        res = ob.subLinkedList(LL1.head, LL2.head)
        printList(res)
# } Driver Code Ends