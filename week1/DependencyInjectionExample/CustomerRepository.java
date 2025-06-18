package code.week1.DependencyInjectionExample;

public interface CustomerRepository {
    Customer findCustomerById(String id);
}