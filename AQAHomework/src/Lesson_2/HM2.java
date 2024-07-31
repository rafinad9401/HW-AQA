package Lesson_2;

public class HM2 {
    public static void main(String[] args) {

        //Task 1
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Ivanov Ivan", "Engineer",
                "ivivan@mailbox.com", "89231231212", 30000, 30);
        employees[1] = new Employee("Smirnov Nikolai", "Engineer",
                "smnik@mailbox.com", "89231231213", 30000, 34);
        employees[2] = new Employee("Sokolov Evgeniy", "Engineer",
                "skevg@mailbox.com", "89231231214", 30000, 32);
        employees[3] = new Employee("Soloviev Andrei", "Engineer",
                "solan@mailbox.com", "89231231215", 30000, 31);
        employees[4] = new Employee("Stepanov Vladislav", "Engineer",
                "stvl@mailbox.com", "89231231216", 30000, 29);

        //Task 2
        System.out.println("Информация о сотрудниках:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        //Task 3
        Park amusementPark = new Park("Funland");

        Park.Attraction rollerCoaster = amusementPark.new Attraction("Roller Coaster", "10:00 - 18:00", 10.0);
        Park.Attraction carousel = amusementPark.new Attraction("Carousel", "10:00 - 20:00", 5.0);

        System.out.println("\nИнформация о парке:");
        System.out.println("Название парка: " + amusementPark.getName());
        System.out.println("Аттракционы:");
        System.out.println(rollerCoaster.getName() + ", Время работы: " + rollerCoaster.getWorkingHours() + ", Цена: " + rollerCoaster.getPrice() + '$');
        System.out.println(carousel.getName() + ", Время работы: " + carousel.getWorkingHours() + ", Цена: " + carousel.getPrice() + '$');
    }
}

class Employee {
    private String fullName;
    private String job;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String job, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.job = job;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ФИО: " + fullName + "\n" +
                "Должность: " + job + "\n" +
                "Email: " + email + "\n" +
                "Телефон: " + phone + "\n" +
                "Зарплата: " + salary + "\n" +
                "Возраст: " + age;
    }
}

class Park {
    private String name;

    public Park(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public String getWorkingHours() {
            return workingHours;
        }

        public double getPrice() {
            return price;
        }
    }
}
