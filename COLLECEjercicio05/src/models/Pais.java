package models;

import java.util.Objects;

public class Pais implements Comparable<Pais> {
    private String pais;

    public Pais() {
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public int compareTo(Pais pais) {
        return 0;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "pais='" + pais + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pais pais1 = (Pais) o;
        return pais.equals(pais1.pais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pais);
    }
}
