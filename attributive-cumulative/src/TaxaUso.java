void main() {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int minutos = sc.nextInt();
    double conta = 50;


    if (minutos > 100){
       conta += (minutos - 100) * 2;
    }

    System.out.printf("Valor a pagar: %.2f%n",conta);

    sc.close();
}