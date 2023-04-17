public class Main {
    public static void main(String[] args) {
        Man person1 = new Man(" Aman ", 20, 65);
        Man person2 = new Man(" Altynbek ", 21, 56);
        Man person3 = new Man(" Nazira ", 38, 85);
        Man person4 = new Man(" Nurdin ", 58, 52);
        Man person5 = new Man(" Almira ", 48, 40);

        int persons = person1.getAge() + person2.getAge() + person3.getAge() + person4.getAge() + person5.getAge();
        double personCount = (double) persons / 5.0;
        System.out.println(personCount);

    }
}