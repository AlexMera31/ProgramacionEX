void main() {
    int[] radar = {15, 23, 8, 42, 17, 31, 5, 28};
    IO.println("Objectes perillosos detectats:");
    for (int i = 0; i < 8; i++) {
        if (radar[i] < 10){
            IO.println(radar[i]);
        }
    }
}