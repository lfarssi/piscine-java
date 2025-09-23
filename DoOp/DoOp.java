public class DoOp {
    public static String operate(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[2]);
        String op = args[1];
        return switch(op){
            case "+" -> String.valueOf(n1 + n2);
            case "-" -> String.valueOf(n1 - n2);
            case "*" -> String.valueOf(n1 * n2);
            case "/" -> String.valueOf(n1 / n2);
            case "%" -> String.valueOf(n1 % n2);
            default ->"Error";
        };
    }
}