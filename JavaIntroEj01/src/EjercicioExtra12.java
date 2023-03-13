public class EjercicioExtra12 {
    public static void main(String[] args) {
           /* String  cambio;
            String modificacion = "";
            for (int i = 0; i < 1000; i++){
                String numero = String.format("%03d",i);
                numero = numero.replaceAll("(\\d{1})", "$1-");
                numero = numero.replaceAll("3","E");
                numero = numero.substring(0, numero.length() - 1);
                System.out.println(numero);
            }*/
        cambiar();
    }

    public static void cambiar() {
        int cont = 1;
        for (int i = 0 ; i < 1000 ; i++){
            String numero = String.format("%03d",i);
            numero = numero.replaceAll("3","E");
            numero = numero.substring(0, 1) + "-" + numero.substring(1);
            numero = numero.substring(0, 3) + "-" + numero.substring(3);
            System.out.println(numero);
        }
    }

}