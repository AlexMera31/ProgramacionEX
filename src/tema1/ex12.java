void main() {
    String nom = IO.readln("ntrodueix un codi d'emoticona: ");
    String e = switch (nom) {
        case ":lol:", "risa" -> "\uD83D\uDE00";
        default -> "❓";
    };
}