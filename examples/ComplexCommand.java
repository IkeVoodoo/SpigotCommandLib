@BaseCommand(name = "rank", autoCompletion = true)
public class ComplexCommand {

    @SubCommand(path = "/give")
    @Argument(name = "player", type = Player.class)
    @Argument(name = "rank", type = String.class)
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
