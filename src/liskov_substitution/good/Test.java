package liskov_substitution.good;

public class Test {
    public static void main(String[] args) {
        FormaGeometrica[] formeGeometrice = new FormaGeometrica[3];

        Dreptunghi dreptunghi = new Dreptunghi(5, 6);
        Patrat patrat = new Patrat(10);
        Cerc cerc = new Cerc(2);

        formeGeometrice[0] = dreptunghi;
        formeGeometrice[1] = patrat;
        formeGeometrice[2] = cerc;

        for (int i = 0; i < formeGeometrice.length; i++) {
            int aria = formeGeometrice[i].calculeazaAria();
            System.out.println("aria pentru " + formeGeometrice[i] + " este " + aria);
        }
    }
}
