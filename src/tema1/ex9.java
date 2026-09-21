void main() {
    int n1 = Integer.parseInt(IO.readln("Introdueix un nombre de dues xifres: "));
    int x1 = n1/10;
    int x2 = n1%10;
    IO.println("Xifra de les desenes: " + x1);
    IO.println("Xifra de les unitats: " + x2);
    IO.println("Suma dels dígits: " + (x1 + x2));

}