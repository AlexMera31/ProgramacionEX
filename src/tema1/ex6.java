void main() {
    double b = Double.parseDouble(IO.readln("Preu base (€): "));
    int p = Integer.parseInt(IO.readln("Percentatge de descompte (%): "));
    double r = (b-(b*(p/100.0)));
    IO.println("Preu rebaixat: " + r  + " €");
    double i = r * 0.21;
    IO.println("IVA (21%): " + String.format("%.2f",i)  + " €");
    IO.println("Preu final: " + (r + i)  + " €");


}