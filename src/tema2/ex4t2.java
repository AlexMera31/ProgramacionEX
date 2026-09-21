void main() {
    int temps = Integer.parseInt(IO.readln("Hores de pantalla diàries: "));
    if (temps < 0) {
        IO.println("ERROR\nNo pots tindre temps negatiu");
    } else if (temps > 24) {
        IO.println("ERROR\nNo pots tindre mes temps que hores diàries n'hi ha en un dia");
    } else if (temps <= 2) {
        IO.println("Ús saludable");
    } else if (temps <= 4) {
        IO.println("Ús moderat");
    } else if (temps <= 6) {
        IO.println("Ús elevat");
    } else {
        IO.println("Possible addicció");
    }
}