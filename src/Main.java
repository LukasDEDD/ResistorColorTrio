import java.util.List;

class Main {

    private final List<String> resistorColours = List.of(
            "black", "brown", "red", "orange", "yellow",
            "green", "blue", "violet", "grey", "white"
    );

    String label(String[] colors) {
        int basisFormula = resistorColours.indexOf(colors[0]) * 10 + resistorColours.indexOf(colors[1]);
        int base = resistorColours.indexOf(colors[2]);
        long multiply = (long) Math.pow(10, base);

        if (colors[2].equals ("black")) {
            return  basisFormula * multiply + " " + "ohms";
        }
        else if (colors[2].equals ("brown")) {
            return  basisFormula * multiply + " " +  "ohms";
        }
        else if (colors[2].equals ("red")) {
            return   basisFormula * multiply / 1000 + " " +  "kiloohms";
        }
        else if (colors[2].equals ("orange")) {
            return   basisFormula * multiply / 1000 + " " +  "kiloohms";
        }
        else if (colors[2].equals ("yellow")) {
            return  basisFormula * multiply / 1000 + " " +  "kiloohms";
        }
        else if (colors[2].equals ("green")) {
            return basisFormula + multiply /1000 + " " +  "kiloohms";
        }
        else if (colors[2].equals ("blue")) {
            return basisFormula * multiply  /1000000 + " " +  "megaohms";
        }
        else if (colors[2].equals ("violet")) {
            return basisFormula * multiply /1000000 + " " +  "megaohms";
        }
        else if (colors[2].equals ("grey")) {
            return basisFormula * multiply / 1000000 + " " +  "megaohms";
        }
        else if (colors[2].equals ("white")) {
            return basisFormula * multiply/1000000000 + " " +  "gigaohms";
        }
        else {return "incorect color";
        }
    }
}



