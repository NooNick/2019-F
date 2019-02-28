package Lesson_5;

public class Main {
    public static void main(String[] args) {
        int age = 40;
        User[] persArray = new User[5];
        persArray[0] = new User("Иванов", "Иван", "Иванович", "Engineer", "ivivan@mailbox.com", 892312312, 30000.0F, 30);
        persArray[1] = new User("Бакланов", "Алексей", "Евгеньевич", "Engineer", "sasha@mail.ru", 899999999, 40000.0F, 45);
        persArray[2] = new User("Панина", "Галина", "Анатольевна", "Engineer", "gkurio@mail.ru", 877777777, 35000.0F, 31);
        persArray[3] = new User("Насонова", "Инна", "Александровна", "Engineer", "innainna3@mail.ru", 866666666, 20000.0F, 33);
        persArray[4] = new User("Лазарева", "Елена", "Вячеславовна", "Engineer", "levbb@mail.ru", 832326596, 31000.0F, 55);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].ageLimit(age)) {
                persArray[i].printUser();
            }
        }
    }
}
