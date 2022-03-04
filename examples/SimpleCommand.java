public class SimpleCommand {

    @Command("hello")
    public void hello(CommandSender sender, @Argument("player") Player player) {
        player.sendMessage("Hello from " + sender.getName());
    }

}
