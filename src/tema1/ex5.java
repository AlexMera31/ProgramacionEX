void main() {
    double n = Double.parseDouble(IO.readln("Introdueix la temperatura en °C: "));
    IO.println(n + " °C equivalen a " + ((n * 1.8)+32) + " °F");
}