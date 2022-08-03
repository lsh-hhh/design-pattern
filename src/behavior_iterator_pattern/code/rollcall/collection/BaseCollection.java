package behavior_iterator_pattern.code.rollcall.collection;

import behavior_iterator_pattern.code.rollcall.iterator.Iterator;

public abstract class BaseCollection<T> {

    public abstract Iterator<T> createIterator();

    public abstract void add(T t);

    public abstract void remove(T t);

    public abstract void addAll(T ...t);

    public abstract int size();

}
