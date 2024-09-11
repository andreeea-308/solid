package open_closed.good;

public class FilePersistence implements SalaryPersistence {

    @Override
    public void save(int salary) {
        System.out.println("Saving to file...");
    }
}
