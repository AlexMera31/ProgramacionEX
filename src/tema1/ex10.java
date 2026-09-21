void main() {
    int n1 = Integer.parseInt(IO.readln("Introdueix la quantitat a retirar (múltiple de 10): "));
    IO.println("Desglossament de bitllets: ");
    int n50 = n1 / 50;
    int n20 = (n1 - (n50 * 50)) / 20;
    int n10 = (n1 - (n50 * 50) - (n20 * 20)) / 10;
    IO.println("- Bitllets de 50 €: " + n50);
    IO.println("- Bitllets de 20 €: " + n20);
    IO.println("- Bitllets de 10 €: " + n10);
}