import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println(conditionsOfTheProblem(25, 15));
        System.out.println(conditionsOfTheProblem(18, 20));
        System.out.println(conditionsOfTheProblem(30, 35));
        System.out.println(conditionsOfTheProblem(50, 5));
        System.out.println(conditionsOfTheProblem(31, -5));
        System.out.println(conditionsOfTheProblem(generateRandomAge(), -30));
        System.out.println(conditionsOfTheProblem(generateRandomAge(), 25));
    }

    public static String conditionsOfTheProblem(int age, int temperature) {


        if ((age >= 20 && age <= 40 && temperature >= -20 && temperature <= 30)
                || (age < 20 && temperature >= 0 && temperature <= 28)
                || (age < 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять ";
        } else {
            return "Остовайтесь дома";
        }
    }

    public class OutdoorActivityAdvisor {
        public static void main(String[] args) {

            // Hay Sensei Aleksey

            System.out.println(conditionsOfTheProblem(23, 10));
            System.out.println(conditionsOfTheProblem(generateRandomAge(), 10));
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(45) + 1;
    }
}







