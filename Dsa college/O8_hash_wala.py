class HashTable:
    def __init__(self):
        self.size=10
        self.table=[[] for _ in range(self.size)]
    def hash_funct(self,key):
        return key%self.size
    def insert(self,key,value):
        index=self.hash_funct(key)
        for pair in self.table[index]:
            if pair[0]==key:
                pair[1]=value
                return
                print(f'updated new {key} with vaue{value}')
        self.table.append([key,value])
        print(f'inserted things ')
        print(self.table)

    def delete(self,key,value):
        index=self.hash_funct(key)
        for pair in self.table[index]:
            if pair[0]==key:
                self.table[index].remove(pair)
                return
        print(not found)
    def search(self,key):
        index=self.hash_funct(key)
        for pair in self.table[index]:
            if pair[0]==key:
                return pair[1]
        else


h= HashTable()
h.insert(3,"ram")


# pair = [15, 'Ram']
# where

# pair[0] → the key (15)
# pair[1] → the value ('Ram')