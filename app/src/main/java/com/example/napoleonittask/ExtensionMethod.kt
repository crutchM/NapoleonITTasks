package com.example.napoleonittask

fun ArrayList<Product>.Sort(): ArrayList<Product>{
    val sortedCollection = this;
    for(i in 0 .. sortedCollection.count()-1)
        for(j in  0 .. sortedCollection.count()-1)
            if(sortedCollection[j].count > sortedCollection[i].count)
            {
                var tmp = sortedCollection[i];
                sortedCollection[i] = sortedCollection[j]
                sortedCollection[j] = tmp
            }
    return sortedCollection;
}