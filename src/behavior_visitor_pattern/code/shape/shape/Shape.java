package behavior_visitor_pattern.code.shape.shape;

import behavior_visitor_pattern.code.shape.visitor.Visitor;

public interface Shape {

    void move(int x, int y);

    void draw();

    String accept(Visitor visitor);

}
