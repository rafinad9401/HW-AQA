package Lesson_3.HM3_1;

public class HM3 {

        public static void main(String[] args) {
            Dog bobik = new Dog("Бобик");
            Dog tuzik = new Dog("Тузик"); // Добавлена собака Тузик
            Cat murka = new Cat("Мурка");
            Cat murzik = new Cat("Мурзик"); // Добавлена кошка Мурзик

            bobik.run(150);
            bobik.run(500);
            bobik.run(600); // Превышение предела бега
            bobik.swim(10);
            bobik.swim(15); // Превышение предела плавания

            tuzik.run(100); // Добавлены действия для Тузика
            tuzik.run(250);
            tuzik.swim(5);

            murka.run(100);
            murka.run(200);
            murka.run(250); // Превышение предела бега
            murka.swim(5); // Кот не умеет плавать

            murzik.run(50); // Добавлены действия для Мурзика
            murzik.run(150);
            murzik.swim(5); // Кот не умеет плавать

            // Подсчет созданных животных
            int dogCount = 2;
            int catCount = 2;
            int totalAnimalCount = dogCount + catCount;

            System.out.println("Создано собак: " + dogCount);
            System.out.println("Создано котов: " + catCount);
            System.out.println("Всего создано животных: " + totalAnimalCount);

            // Кошачий код с миской:
            Cat[] cats = {murka, murzik};
            FoodBowl bowl = new FoodBowl(10); // Миска с 10 единицами еды

            for (Cat cat : cats) {
                cat.eat(bowl);
                System.out.println(cat.getName() + " сыт: " + cat.isEaten());
            }

            System.out.println("Еды в миске осталось: " + bowl.getFoodAmount());

            bowl.addFood(5); // Добавляем 5 единиц еды в миску
            System.out.println("Еды в миске добавлено, теперь: " + bowl.getFoodAmount());
        }
    }

    class Animal {
        protected String name;

        public Animal(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void run(int distance) {
            System.out.println(name + " пробежал " + distance + " метров");
        }

        public void swim(int distance) {
            System.out.println(name + " проплыл " + distance + " метров");
        }
    }

    class Dog extends Animal {

        private int maxRunDistance = 500;
        private int maxSwimDistance = 10;

        public Dog(String name) {
            super(name);
        }

        @Override
        public void run(int distance) {
            if (distance <= maxRunDistance) {
                super.run(distance);
            } else {
                System.out.println(name + " не может пробежать " + distance + " метров");
            }
        }

        @Override
        public void swim(int distance) {
            if (distance <= maxSwimDistance) {
                super.swim(distance);
            } else {
                System.out.println(name + " не может проплыть " + distance + " метров");
            }
        }
    }

    class Cat extends Animal {

        private int maxRunDistance = 200;
        private boolean eaten = false; // Поле сытости

        public Cat(String name) {
            super(name);
        }

        @Override
        public void run(int distance) {
            if (distance <= maxRunDistance) {
                super.run(distance);
            } else {
                System.out.println(name + " не может пробежать " + distance + " метров");
            }
        }

        @Override
        public void swim(int distance) {
            System.out.println(name + " не умеет плавать");
        }

        public boolean isEaten() {
            return eaten;
        }

        public void eat(FoodBowl bowl) {
            if (bowl.getFoodAmount() >= 1) {
                eaten = true;
                bowl.eatFood(1);
            }
        }
    }

    class FoodBowl {
        private int foodAmount;

        public FoodBowl(int foodAmount) {
            this.foodAmount = foodAmount;
        }

        public int getFoodAmount() {
            return foodAmount;
        }

        public void eatFood(int amount) {
            if (foodAmount >= amount) {
                foodAmount -= amount;
            }
        }

        public void addFood(int amount) {
            foodAmount += amount;
        }
    }