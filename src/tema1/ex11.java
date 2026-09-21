void main() {
    int n = Integer.parseInt(IO.readln("Introdueix el número de mes (1-12): "));
    String e = switch (n) {
        case 12, 1, 2  -> "Hivern";
        case 3, 4, 5   -> "Primavera";
        case 6, 7, 8   -> "Estiu";
        case 9, 10, 11 -> "Tardor";
        default        -> "Mes desconegut";
    };
    IO.println("El mes 4 correspon a l'estació: " + e);
}