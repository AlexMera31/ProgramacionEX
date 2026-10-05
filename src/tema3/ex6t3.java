void main() {
    int puntuacion[] = new int[8];
    for (int i = 0; i < 8; i++) {
        puntuacion[i] = Integer.parseInt(IO.readln("Introdueix la puntuació " + (i + 1) + ": "));
    }
    IO.println("Puntuacions que superen 500:");
    for (int i = 0; i < 8; i++) {
        if (puntuacion[i] > 500){
            IO.println(puntuacion[i]);
        }
    }
}