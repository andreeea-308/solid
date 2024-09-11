package liskov_substitution.good;

public class Cerc extends FormaGeometrica {
    private int raza;

    public Cerc(int raza) {
        this.raza = raza;
    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }

    @Override
    public int calculeazaAria() {
        return (int) Math.PI * raza * raza;
    }

    @Override
    public String toString() {
        return "Cerc{" +
                "raza=" + raza +
                '}';
    }
}
