public class Janitor extends Employee {
    // Janitors work twice as many hours per week as other employees (80 hours/week)
    public int getHours(){
        return super.getHours()*2;
    }
    // they make $30,000 ($10,000 less than general employees)
    public double getSalary() {
        return super.getSalary()-10000;
    }
    // they get half as much vacation as other employees (only 5 days)
    public int getVacationDays() {
        return super.getVacationDays()/2;
    }
    // they have an additional method clean that prints "Workin' for the man."
    private void clean(){
        System.out.println("Workin' for the man.");
    }
}
