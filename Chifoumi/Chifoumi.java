public class Chifoumi {
    public static ChifoumiAction getActionBeatenBy(ChifoumiAction action) {
        return switch(action){
            case ROCK -> ChifoumiAction.SCISSOR;
            case SCISSOR -> ChifoumiAction.PAPER;
            case PAPER -> ChifoumiAction.ROCK;
        };
    }
}
