void main() {
    int n = Integer.parseInt(IO.readln("Introdueix el número de mes (1-12): "));
    String e = switch (n) {
        case 1, 3, 5, 7, 8, 10, 12  -> "31";
        case 4, 6, 9, 11   -> "30";
        case 2   -> "28";
        default        -> "Mes desconegut";
    };
    IO.println("Aquest mes té " + e + " dies.");
}