public class Sum {

    public static void main(String[] args) {
        int sum = 0;
        StringBuilder number = new StringBuilder();

        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args[i].length(); j++) {

                char character = args[i].charAt(j);
                if (!Character.isWhitespace(character)) {
                    number.append(character);
                    if (j == args[i].length() - 1) {
                        sum += Integer.parseInt(number.toString());
                        number.setLength(0);
                    }
                } else {
                    if (number.length() > 0)
                        sum += Integer.parseInt(number.toString());
                    number.setLength(0);
                }
            }
        }
        System.out.println(sum);
    }
}
