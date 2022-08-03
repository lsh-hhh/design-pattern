package behavior_iterator_pattern.code.rollcall.collection;

import behavior_iterator_pattern.code.rollcall.iterator.DeadIterator;
import behavior_iterator_pattern.code.rollcall.iterator.Iterator;

public class DeadLinkedList extends BaseCollection<DeadInfo>{

    private DeadInfo head;
    private DeadInfo tail;

    private int size;

    public DeadLinkedList(DeadInfo firstDead, DeadInfo ...deadInfos) {
        head = firstDead;
        size = 1;
        for (DeadInfo deadInfo : deadInfos) {
            head.setNext(deadInfo);
            head = deadInfo;
            size++;
        }
        tail = head;
        head = firstDead;
    }

    @Override
    public Iterator<DeadInfo> createIterator() {
        return new DeadIterator(head);
    }

    @Override
    public void add(DeadInfo deadInfo) {
        tail.setNext(deadInfo);
        tail = deadInfo;
    }

    @Override
    public void remove(DeadInfo deadInfo) {
        DeadInfo temp = head;
        while (temp.getNext() != null) {
            DeadInfo next = temp.getNext();
            if (next.equals(deadInfo)) {
                temp.setNext(next.getNext());
                next.setNext(null);
                break;
            }
            temp = next;
        }
    }

    @Override
    public void addAll(DeadInfo... t) {
        for (DeadInfo deadInfo : t) {
            tail.setNext(deadInfo);
            tail = deadInfo;
        }
    }

    @Override
    public int size() {
        return size;
    }
}
