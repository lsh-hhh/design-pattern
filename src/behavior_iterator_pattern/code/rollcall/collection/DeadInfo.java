package behavior_iterator_pattern.code.rollcall.collection;

import java.time.LocalDate;

public class DeadInfo {

    private String name;

    private LocalDate deadDate;

    private DeadInfo next;

    public DeadInfo(String name, LocalDate deadDate) {
        this.name = name;
        this.deadDate = deadDate;
    }

    public DeadInfo(String name, String deadDate) {
        this.name = name;
        this.deadDate = LocalDate.parse(deadDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDeadDate() {
        return deadDate;
    }

    public void setDeadDate(LocalDate deadDate) {
        this.deadDate = deadDate;
    }

    public DeadInfo getNext() {
        return next;
    }

    public void setNext(DeadInfo next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "DeadInfo{" +
                "name='" + name + '\'' +
                ", deadTime=" + deadDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeadInfo deadInfo = (DeadInfo) o;

        if (name != null ? !name.equals(deadInfo.name) : deadInfo.name != null) return false;
        return deadDate != null ? deadDate.equals(deadInfo.deadDate) : deadInfo.deadDate == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (deadDate != null ? deadDate.hashCode() : 0);
        return result;
    }
}
