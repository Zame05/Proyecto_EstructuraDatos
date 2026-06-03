public class Validaciones {

    public static boolean soloLetras(String texto, int index) {
        if (index == texto.length()) return true;
        char c = texto.charAt(index);
        if (!Character.isLetter(c) && c != ' ') return false;
        return soloLetras(texto, index + 1);
    }

    public static boolean soloNumeros(String texto, int index) {
        if (index == texto.length()) return true;
        if (!Character.isDigit(texto.charAt(index))) return false;
        return soloNumeros(texto, index + 1);
    }

    public static boolean esPositivo(int numero) {
        return numero > 0;
    }

    public static boolean esPositivoDecimal(float numero) {
        return numero > 0;
    }

    public static boolean noVacio(String texto, int index) {
        if (index == texto.length()) return false;
        if (texto.charAt(index) != ' ') return true;
        return noVacio(texto, index + 1);
    }

    public static boolean longitudMinima(String texto, int index, int minimo) {
        if (index == texto.length()) return texto.length() >= minimo;
        return longitudMinima(texto, index + 1, minimo);
    }

    public static boolean alfanumerico(String texto, int index) {
        if (index == texto.length()) return true;
        if (!Character.isLetterOrDigit(texto.charAt(index))) return false;
        return alfanumerico(texto, index + 1);
    }

    public static boolean enRango(int numero, int min, int max) {
        return numero >= min && numero <= max;
    }
}