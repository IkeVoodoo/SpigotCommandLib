public class Example1 {

    @Command(name = "hello")
    @Argument(name = "player", type = Player.class)
    public void hello(CommandSender sender, Player player) {
        player.sendMessage("Hello from " + sender.getName());
    }

}
