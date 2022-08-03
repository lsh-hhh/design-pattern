package behavior_mediator_pattern.code.button;

import behavior_mediator_pattern.code.button.components.*;
import behavior_mediator_pattern.code.button.mediator.Editor;
import behavior_mediator_pattern.code.button.mediator.Mediator;

import javax.swing.*;

public class ButtonMediatorClient {

    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
