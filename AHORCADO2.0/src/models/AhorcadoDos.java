package models;

public class AhorcadoDos {
    private String[] palabrasFaciles = new String[]{"perro", "gato", "papa", "agua", "arbol", "casa", "panza", "loco", "loro", "llave"};
    private String[] palabrasMedias = new String[]{"palabra", "escritorio", "zapato", "esqueleto", "programa", "television", "pantalla", "automovil", "cristiano", "vertebras"};
    private String[] palabrasDificiles = new String[]{"murcielago", "educacion", "eucalipto", "esternocleidomastoideo", "anticonstitucional", "estratosfera", "desertico"};
    private String[] palabraEscogida;
    private String palabraEscogidaNormal;
    private int palabrasEncontradas;
    private int vidas;

    public AhorcadoDos() {
    }

    public AhorcadoDos(String[] palabrasFaciles, String[] palabrasMedias, String[] palabrasDificiles, String[] palabraEscogida, String palabraEscogidaNormal, int palabrasEncontradas, int vidas) {
        this.palabrasFaciles = palabrasFaciles;
        this.palabrasMedias = palabrasMedias;
        this.palabrasDificiles = palabrasDificiles;
        this.palabraEscogida = palabraEscogida;
        this.palabraEscogidaNormal = palabraEscogidaNormal;
        this.palabrasEncontradas = palabrasEncontradas;
        this.vidas = vidas;
    }

    public String[] getPalabrasFaciles() {
        return palabrasFaciles;
    }

    public void setPalabrasFaciles(String[] palabrasFaciles) {
        this.palabrasFaciles = palabrasFaciles;
    }

    public String[] getPalabrasMedias() {
        return palabrasMedias;
    }

    public void setPalabrasMedias(String[] palabrasMedias) {
        this.palabrasMedias = palabrasMedias;
    }

    public String[] getPalabrasDificiles() {
        return palabrasDificiles;
    }

    public void setPalabrasDificiles(String[] palabrasDificiles) {
        this.palabrasDificiles = palabrasDificiles;
    }

    public String[] getPalabraEscogida() {
        return palabraEscogida;
    }

    public void setPalabraEscogida(String[] palabraEscogida) {
        this.palabraEscogida = palabraEscogida;
    }

    public String getPalabraEscogidaNormal() {
        return palabraEscogidaNormal;
    }

    public void setPalabraEscogidaNormal(String palabraEscogidaNormal) {
        this.palabraEscogidaNormal = palabraEscogidaNormal;
    }

    public int getPalabrasEncontradas() {
        return palabrasEncontradas;
    }

    public void setPalabrasEncontradas(int palabrasEncontradas) {
        this.palabrasEncontradas = palabrasEncontradas;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public void escogerPalabra(int nivel) {
        switch (nivel) {
            case 1:
                this.palabraEscogidaNormal = this.palabrasFaciles[(int) (Math.random() * 10)];
                break;
            case 2:
                this.palabraEscogidaNormal = this.palabrasMedias[(int) (Math.random() * 10)];
                break;
            case 3:
                this.palabraEscogidaNormal = this.palabrasDificiles[(int) (Math.random() * 7)];
                break;
        }
    }

    public void rellenarPalabra() {
        this.palabraEscogida = new String[this.palabraEscogidaNormal.length()];
        for (int i = 0; i < palabraEscogida.length; i++) {
            this.palabraEscogida[i] = palabraEscogidaNormal.substring(i, i + 1);
        }
    }

    public void calcularVidas() {
        this.vidas = Math.round(this.palabraEscogidaNormal.length() / 2);
    }

    public void restarVidas() {
        this.vidas--;
    }

    public void aumentarEncontradas(int repetidas) {
        this.palabrasEncontradas += repetidas;
    }
}
