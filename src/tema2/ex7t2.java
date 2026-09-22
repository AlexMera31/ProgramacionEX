void main() {
    String tipo = IO.readln("Tipo de tu Pokémon (fuego, agua, planta, eléctrico, tierra, roca): ");
    String debilidad = switch (tipo) {
        case "fuego" -> "Agua, Tierra y Roca";
        case "agua" -> "Planta y Eléctrico";
        case "planta" -> "Fuego";
        case "eléctrico" -> "Tierra";
        case "tierra", "roca" -> "Agua y Planta";
        default -> "Tipo desconocido: ¡consulta la Pokédex!";
    };
    IO.println("Débil ante: " + debilidad);
}