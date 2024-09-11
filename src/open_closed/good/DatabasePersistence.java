package open_closed.good;

public class DatabasePersistence implements SalaryPersistence {

    @Override
    public void save(int salary) {
        System.out.println("Saving to database...");
    }
}
