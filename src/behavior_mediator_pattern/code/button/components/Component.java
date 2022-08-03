package behavior_mediator_pattern.code.button.components;

import behavior_mediator_pattern.code.button.mediator.Mediator;

public interface Component {

    void setMediator(Mediator mediator);

    String getName();

}
