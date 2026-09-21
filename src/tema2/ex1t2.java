void main() {
    int numero = Integer.parseInt(IO.readln("Introdueix un número: "));
    if (numero == 0) {
        IO.println("El número es zero");
    } else if (numero % 2 == 0){
        if (numero > 0) {
            IO.println("El número " + numero + " es positiu i parell.");
        } else {
            IO.println("El número " + numero + " es negatiu i parell.");
        }
    } else if (numero > 0) {
        IO.println("El número " + numero + " es positiu i senar.");
    } else {
        IO.println("El número " + numero + " es negatiu i senar.");
    }
}