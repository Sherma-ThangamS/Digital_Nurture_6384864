package code.week1.DependencyInjectionExample;

public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void printCustomerDetails(String customerId) {
        Customer customer = customerRepository.findCustomerById(customerId);
        System.out.println("Customer Details:");
        System.out.println("ID: " + customer.getId());
        System.out.println("Name: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
    }
}