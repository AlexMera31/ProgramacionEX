void main() {
    int edad = Integer.parseInt(IO.readln("Introdueix l'edat: "));
    if (edad < 3){
        IO.println("El preu de l'entrada és gratis");
    } else if (edad <= 12) {
        IO.println("El preu de l'entrada és de 5 €.");
    } else if (edad <= 17) {
        IO.println("El preu de l'entrada és de 10 €.");
    } else if (edad <= 64) {
        IO.println("El preu de l'entrada és de 15 €.");
    } else if (edad <= 122) {
        IO.println("El preu de l'entrada és de 7 €.");
    } else {
        IO.println("El record de años que una persona ha vivido es de 122, no tienes mas de 122 años.");
    }
}