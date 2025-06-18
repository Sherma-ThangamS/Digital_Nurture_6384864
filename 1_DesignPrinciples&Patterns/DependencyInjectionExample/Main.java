package code.week1.DependencyInjectionExample;

public class Main {
    public static void main(String[] args) {

        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        service.printCustomerDetails("C123");
    }
}
