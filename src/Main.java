public class Main {
    public static void main(String[] args) {
        float numeroIf = 0;

        if (numeroIf < 0) {
            System.out.println("el numero es negativo");
        } else if (numeroIf > 0) {
            System.out.println("el numero es positivo");
        } else {
            System.out.println("el numero es  0 ");
        }
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        int numeroDoWhile = 5;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 5);


        for (int numeroFor = 0; numeroFor <= 10; numeroFor++) {
            System.out.println(numeroFor);
        }
        String  estacion = "verano";

        switch (estacion) {
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("No es una estacion");

        }
    }
}
