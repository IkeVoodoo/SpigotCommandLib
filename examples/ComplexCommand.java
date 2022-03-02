@BaseCommand(name = "rank", autoCompletion = true)
public class ComplexCommand {

    @SubCommand(path = "/give")
    @Argument(name = "player", type = Player.class)
    @Argument(name = "rank", type = String.class)
    // The method here returns a string, however it can also return void, this is done to send a message to the sender
    private String give(Player player, String rank) {
        // Do something...
        return "&aDone!";
    }

    @SubCommand(path = "/take")
    @Argument(name = "player", type = Player.class)
    @Argument(name = "rank", type = String.class)
    private String take(Player player, String rank) {
        // Do something...
        return "&aDone!";
    }

}
