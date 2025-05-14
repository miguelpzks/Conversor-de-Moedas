public class Conversor {
    // Taxas fixas simuladas (Valores meramente ilustrativos)
    private static final double USD_TO_BRL = 5.10;
    private static final double BRL_TO_USD = 1 / USD_TO_BRL;

    private static final double EUR_TO_BRL = 5.60;
    private static final double BRL_TO_EUR = 1 / EUR_TO_BRL;

    public static double converter(String origem, String destino, double valor) {
        if (origem.equals("BRL") && destino.equals("USD")) {
            return valor *BRL_TO_USD;
        } else if (origem.equals("USD") && destino.equals("BRL")) {
            return valor * USD_TO_BRL;
        } else if (origem.equals("BRL") && destino.equals("EUR")) {
            return valor * BRL_TO_EUR;
        } else if (origem.equals("EUR") && destino.equals("BRL")) {
            return valor * EUR_TO_BRL;
        } else if (origem.equals(destino)) {
            return valor; // mesma moeda, se conversão
        } else {
            return -1; //sem conversão
        }
    }
}
