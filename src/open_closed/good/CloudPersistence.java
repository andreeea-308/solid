package open_closed.good;

public class CloudPersistence implements SalaryPersistence{
    @Override
    public void save(int salary) {
        System.out.println("Saving to cloud... ");
    }
}
