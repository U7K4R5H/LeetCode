/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {

List<Integer> list;//in which we ll store all integers while initialization.
int pointer;
int size;
public NestedIterator(List<NestedInteger> nestedList) {
    list=new ArrayList<Integer>();
    //check if all elements of nestedList following 
    for(NestedInteger ni:nestedList){
        //yes:  just add it to the list
        if(ni.isInteger()){
            list.add(ni.getInteger());
        }else{
            //no : then its NestedInteger hence we create an intence of NestedIterator and get all Integers of ni obj.
            NestedIterator itr=new NestedIterator(ni.getList());
            list.addAll(itr.list);
        }
    }
    pointer=0;
    size=list.size();
}

@Override
public Integer next() {
    return list.get(pointer++);
}

@Override
public boolean hasNext() {
    if(pointer<size){
        return true;
    }
    return false;
}
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */