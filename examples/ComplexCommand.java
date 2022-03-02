@BaseCommand("rank")
@AutoComplete
public class ComplexCommand {

    // A path always starts with a / indicating root
    // Example would be /a/b/c where you need to run /rank a b c to access it
    @SubCommand("/give")
    @Argument(name = "player", type = Player.class)
    @Argument(name = "rank", type = String.class)
    // The method here returns a string, however it can also return void, this is done to send a message to the sender
    private String give(Player player, String rank) {
        // Do something...
        return "&aDone!";
    }

    @SubCommand("/take")
    @Argument(name = "player", type = Player.class)
    @Argument(name = "rank", type = String.class)
    private String take(Player player, String rank) {
        // Do something...
        return "&aDone!";
    }

}
