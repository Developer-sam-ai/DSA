from collections import Counter
class library:

    def __init__(self,records):
        self.records=records
    
    def average(self):
        total=0
        for books in self.records.values():
            total=total+len(books)
        average=total/len(self.records)
        return average
    
    def min_max(self):
        book_count=[]
        for books in self.records.values():
            for book in books:
                book_count.append(book)
        
        indi=Counter(book_count)
        maximum=max(indi)
        print(maximum)
    
    def count_non_borrower(self):
        count=0
        for books in self.records.values():
            if(len(books)==0):
                count=count+1
        print(count)
        return count

    def mi_max(self):
        book_count=[]
        for books in self.records.values():
            for book in books:
                book_count.append(book)
        
        indi=Counter(book_count)
        maximum=max(indi)
        print(indi)
        #! we want the most frequent book occuring 

        


records = {
    "Alice": ["Python101", "AI"],
    "Bob": [],
    "Charlie": ["Networking", "Python101", "Algorithms"],
    "David": ["DataStructures"],
    "Eva": [],
    "Frank": ["Networking", "Python101", "Networking"]
}

lib = library(records)
lib.mi_max()
# lib.count_non_borrower()