package aliif.arief.application;

import aliif.arief.data.Company;

public class NestedApp {
    public static void main(String[] args) {
        
        Company company = new Company();
        company.setName("Aliif soft inc");

        Company.Employee employee = company.new Employee();
        employee.setName("Aliif");

        System.out.println(employee.getCompany());
    }
}
