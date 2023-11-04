package seminar6.employee;

public class PayRoll {
private Employee employee;
    public double calculateSalary(int districtCoefficient, int tax) {
        return employee.getSalary() * districtCoefficient * (1 - tax);
    }

}
