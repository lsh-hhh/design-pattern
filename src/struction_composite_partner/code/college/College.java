package struction_composite_partner.code.college;

public abstract class College {

    protected String name;

    protected String level;

    public void add(College college) {
        throw new UnsupportedOperationException();
    }

    public void remove(College college) {
        throw new UnsupportedOperationException();
    }

    public abstract void print();
}
