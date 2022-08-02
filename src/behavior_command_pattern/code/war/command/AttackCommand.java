package behavior_command_pattern.code.war.command;

import behavior_command_pattern.code.war.receiver.Soldier;

public class AttackCommand implements Command{
    private Soldier soldier;
    public AttackCommand(Soldier soldier) {
        this.soldier = soldier;
    }

    @Override
    public void execute() {
        soldier.attack();
    }
}
