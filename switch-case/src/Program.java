/*
void main() {

    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    String dia;

    if (x == 1) {
        dia = "domingo";
    } else if (x == 2) {
        dia = "segunda-feira";
    } else if (x == 3) {
        dia = "terça-feira";
    } else if (x == 4) {
        dia = "quarta-feira";
    } else if (x == 5) {
        dia = "quinta-feira";
    } else if (x == 6) {
        dia = "sexta-feira";
    } else if (x == 7) {
        dia = "sábado";
    } else {
        dia = "Inválido";
    }

    System.out.println("Dia da semana: " + dia);
    sc.close();
}
*/

void main() {

    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    String dia = switch (x) {

        case 1 -> "Domingo";
        case 2 -> "Segunda";
        case 3 -> "terça";
        case 4 -> "quarta";
        case 5 -> "quinta";
        case 6 -> "sexta";
        case 7 -> "sábado";
        default -> "Inválido";

    };

    IO.println("Dia da semana: " + dia);
}
