package application;

import concreteCommands.MoveRightCommand;
import concreteCommands.MoveUpCommand;
import invoker.Game;
import receiver.Player;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Game game = new Game();

        game.setCommand(new MoveUpCommand(player));
        game.executeCommand();

        game.setCommand(new MoveRightCommand(player));
        game.executeCommand();
    }
}

