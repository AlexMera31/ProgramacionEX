void main() {
    double n1 = Double.parseDouble(IO.readln("Nota tasca 1: "));
    double n2 = Double.parseDouble(IO.readln("Nota tasca 2: "));
    double n3 = Double.parseDouble(IO.readln("Nota tasca 3: "));
    double nm = ((n1 + n2 + n3)/3);
    IO.println("Nota mitjana: " + nm);
    String b = nm >= 5.0 ? "Qualificació final: Aprovat" : "Qualificació final: Suspès";
    IO.println(b);

}