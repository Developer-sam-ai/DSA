class FIxed_hash:
    def __init__(self,size):
        self.size=size
        self.table=[None]*size 
    def hash_tab(key):
        return key%self.size
    def insert(key,value):
        index=self.hash_tab(key)
        Start_index=index

        while self.table[index] is not None and self.table[index]!='deleted':
            if self.table[0]==key:
                print('already ahve it')
                return
            index=(index+1)%self.size
            if(index==Start_index):
                print('array is full')
                return 
        self.table[index]=key
        print(f'inserted key ')


    def insert(self,key,value):
        index=self.hash_tab(key)
        start_index=index
        while self.table[index] is not None and self.table[index][0]!='deleted':
            if self.table[index][0]==key:
                print("already exist here")
                return
            index=(index+1)%key
            if index==start_index:
                print("full")
                return 
        self.table[index]=(key,value)
        print(f'hogaya bhai')

    def delete(self,key):
        index=self.hash_tab(key)
        starthash=index
        while self.table[index] !=None:
            if self.table[index]==key:
                self.table[index]='deleted'
                print('found the index')
                self.table.remove[key]
                return 
            index=(index+1)%key
            if(index== starthash):
                print('i win again')
        print('nothing there')


def __init__(self,size):
    self.size=size
    self.table=(None)*size