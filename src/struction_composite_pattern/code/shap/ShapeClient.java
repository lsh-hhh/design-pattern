package struction_composite_pattern.code.shap;

import struction_composite_pattern.code.shap.editor.ImageEditor;
import struction_composite_pattern.code.shap.shapes.Circle;
import struction_composite_pattern.code.shap.shapes.CompoundShape;
import struction_composite_pattern.code.shap.shapes.Rectangle;
import struction_composite_pattern.code.shap.shapes.Dot;

import java.awt.*;

public class ShapeClient {

    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),
                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),
                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
