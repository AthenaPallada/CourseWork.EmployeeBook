public class Main {
    private static final Employee[] employee = new Employee[10];
    public static void main(String[] args) {
        employee[0] = new Employee("Орлов Антоний Александрович", 2, 35000);
        employee[1] = new Employee("Волков Николай Петрович", 3, 33700);
        employee[2] = new Employee("Тигров Александр Николаевич", 5, 36400);
        employee[3] = new Employee("Безухов Алексей Александрович", 4, 39800);
        employee[4] = new Employee("Майоров Михаил Алексеевич", 1, 34000);
        employee[5] = new Employee("Птицын Сергей Генадьеевич", 2, 35555);
        employee[6] = new Employee("Королев Кадмий Ермолаевич", 5, 37200);
        employee[7] = new Employee("Субботов Артем Михайлович", 4, 36666);
        employee[8] = new Employee("Кузнецов Иван Иванович", 3, 35990);
        employee[9] = new Employee("Кураносов Пьер Абромович", 2, 38880);
        printEmployee();
        printFullName();
        System.out.println("Сумма затрат на зарплаты в месяц: " + calculateTotalSum() + " рублей");
        System.out.println("Сотрудник с минимальной зарплатой: " + calculateMin() + " рублей");
        System.out.println("Сотрудник с максимальной зраплатой: " + calculateMax() + " рублей");
        System.out.println("Среднее значение зарплат: " + calculateTotalSum() / employee.length + " рублей");
    }
    private static void printEmployee(){
        for (Employee i : employee) {
            System.out.println(i);
        }
    }
    public static double calculateTotalSum() {
        double sum = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sum += employee[i].getSalary();
            }
        }
        return sum;
    }
    public static double calculateMin() {
        double min = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                if (min > employee[i].getSalary()) {
                    min = employee[i].getSalary();
                }
            }
        }
        return min;
    }
    public static double calculateMax() {
        double max = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                if (max < employee[i].getSalary()) {
                    max = employee[i].getSalary();
                }
            }
        }
        return max;
    }
    private static void printFullName(){
        for (Employee i : employee) {
            if (i != null)
                System.out.println(i.getFullName());
        }
    }
}