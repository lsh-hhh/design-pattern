package behavior_visitor_pattern.code.shape.visitor;

import behavior_visitor_pattern.code.shape.shape.Circle;
import behavior_visitor_pattern.code.shape.shape.CompoundShape;
import behavior_visitor_pattern.code.shape.shape.Dot;
import behavior_visitor_pattern.code.shape.shape.Rectangle;

public interface Visitor {

    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);

}
