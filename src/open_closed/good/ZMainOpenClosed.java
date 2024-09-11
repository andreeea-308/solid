package open_closed.good;

public class ZMainOpenClosed {

    public static void main(String[] args) {
        int salary = 3000;

        save(new DatabasePersistence(), salary);
        save(new FilePersistence(), salary);
        save(new CloudPersistence(), salary);
    }

    public static void save(SalaryPersistence salaryPersistence, int salary) {
        salaryPersistence.save(salary);
    }
}
