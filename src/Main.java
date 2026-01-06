import java.util.List;

class Main {

    private final List<String> resistorColours = List.of(
            "black", "brown", "red", "orange", "yellow",
            "green", "blue", "violet", "grey", "white"
    );

    String label(String[] colors) {
        int grund = resistorColours.indexOf(colors[0]) * 10 + resistorColours.indexOf(colors[1]);
        int base = resistorColours.indexOf(colors[2]);
        long multiply = (long) Math.pow(10, base);

    }
}
