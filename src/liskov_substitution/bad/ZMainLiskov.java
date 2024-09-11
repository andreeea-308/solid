package liskov_substitution.bad;

public class
ZMainLiskov {
    public static void main(String[] args) {
        Dreptunghi[] formeGeometriceDreptunghiulare = new Dreptunghi[2];

        Dreptunghi forma1 = new Dreptunghi(2, 3);
        Dreptunghi forma2 = new Patrat(4);

        formeGeometriceDreptunghiulare[0] = forma1;
        formeGeometriceDreptunghiulare[1] = forma2;

        for (int i = 0; i < formeGeometriceDreptunghiulare.length; i++) {
            int aria = formeGeometriceDreptunghiulare[i].calculeazaAria();
            System.out.println("aria pentru " + formeGeometriceDreptunghiulare[i] + " este " + aria);
        }
    }
}
