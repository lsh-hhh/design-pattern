package behavior_memento_pattern.code.editor;

import behavior_memento_pattern.code.editor.editor.Editor;
import behavior_memento_pattern.code.editor.shapes.Circle;
import behavior_memento_pattern.code.editor.shapes.CompoundShape;
import behavior_memento_pattern.code.editor.shapes.Dot;
import behavior_memento_pattern.code.editor.shapes.Rectangle;

import java.awt.*;

public class EditorClient {
    public static void main(String[] args) {
        Editor editor = new Editor();
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
