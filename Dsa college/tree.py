class location:
    def __init__(self,value):
        # ? just remeber the value of left and right are none that meanse 
        # *  none and null are same meanse nothing is stored
        root=value
        right=None
        left=None

    def add(self,root,value):
        #* creating a node is 1 error 
        if value>root:
            if self.left==None:
                self.left=location(value)
            else:
                self.left=self.add(value)
        elif root>value:
            if self.right==None:
                self.right=location(value)
            else:
                self.right=self.add(value)
        else:
            self.root=value
        print("location added")


dist=location(5)

dist.add(4,24)