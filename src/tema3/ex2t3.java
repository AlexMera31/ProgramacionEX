void main() {
    int[] puntuacion = {120, 450, 230, 800, 320};
    IO.println("Primera partida " + puntuacion[0]);
    IO.println("Ultima partida " + puntuacion[4]);
    IO.println("Puntuacions:");
    for (int i = 0; i < 5; i++) {
        IO.println(puntuacion[i]);
    }
}