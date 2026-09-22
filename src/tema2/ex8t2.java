void main() {
    String hand1 = IO.readln("Elige tu mano (piedra, papel, tijera): ");
    String hand2 = IO.readln("Elige la mano de tu oponente (piedra, papel, tijera): ");
    switch (hand1 + hand2) {
        case "piedrapiedra", "papelpapel", "tijeratijera" -> IO.println("Resultado: Empate");
        case "piedratijera", "papelpiedra", "tijerapapel" -> IO.println("Resultado: Ganaste");
        case "piedrapapel", "papeltijera", "tijerapiedra" -> IO.println("Resultado: Perdiste");
        default -> IO.println("Mano desconocida: ¡elige piedra, papel o tijera!");
    }
}