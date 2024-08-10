package concreteCommands;

import command.Command;
import receiver.Player;

public class MoveRightCommand implements Command {
    private Player player;

    public MoveRightCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.moveRight();
    }
}
