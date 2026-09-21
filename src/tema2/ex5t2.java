void main() {
    int bateria = Integer.parseInt(IO.readln("Bateria actual (en %): "));
    if (bateria < 0) {
        IO.println("ERROR\nNo pots tindre bateria negativa");
    } else if (bateria > 100) {
        IO.println("ERROR\nNo pots tindre mes del 100% de bateria");
    } else if (bateria <= 5) {
        IO.println("Bateria crítica");
    } else if (bateria <= 20) {
        IO.println("Bateria baixa");
    } else if (bateria <= 99) {
        IO.println("Bateria mitjana");
    } else {
        IO.println("Bateria completa");
    }
}