public class OptionalArguments {

    @Command("test")
    private String test(CommandSender sender, @OptionalArgument("player") Player player) {
        String name = player == null ? sender.getName() : player.getName();
        return "Hello " + name;
    }

}
