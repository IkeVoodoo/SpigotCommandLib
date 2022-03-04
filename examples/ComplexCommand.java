/**
 * /rank
 * /rank give <player> <rank>
 * /rank take <player> <rank>
 * /rank info
 * /rank info list
 * */
@AutoComplete
@BaseCommand("rank")
public class Testing2 {
    
    @SubCommand("give")
    private String give(@Argument("player") Player player, @Argument("rank") String rank) {
        // Do something...
        return "&aDone!";
    }
    
    @SubCommand("take")
    private String take(@Argument("player") Player player, @Argument("rank") String rank) {
        // Do something...
        return "&aDone!";
    }
    
    @SubCommand("info")
    private String info() {
        // Do something...
        return "&aDone!";
    }
    
    @SubCommand(value = "list", previous = "info")
    private String list() {
        // Do something...
        return "&aDone!";
    }
}
