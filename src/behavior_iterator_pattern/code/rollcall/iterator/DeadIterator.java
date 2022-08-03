package behavior_iterator_pattern.code.rollcall.iterator;

import behavior_iterator_pattern.code.rollcall.collection.DeadInfo;

public class DeadIterator implements Iterator<DeadInfo> {

    private DeadInfo deadInfo;

    public DeadIterator(DeadInfo deadInfo) {
        this.deadInfo = deadInfo;
    }

    @Override
    public boolean hasNext() {
        return deadInfo != null;
    }

    @Override
    public DeadInfo getNext() {
        if (!hasNext()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        DeadInfo next = deadInfo;
        deadInfo = next.getNext();
        return next;
    }
}
