void main() {
    double b = Double.parseDouble(IO.readln("Introdueix la base: "));
    double a = Double.parseDouble(IO.readln("Introdueix l'altura : "));
    IO.println("Perímetre: " + ((2*b)+(2*a)));
    IO.println("Àrea: " + (b*a));
}