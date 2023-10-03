public class Main {
    public static void main(String[] args) {

        System.out.println(getActivityAdvice(25, 15));
        System.out.println(getActivityAdvice(18, 20));
        System.out.println(getActivityAdvice(30, 35));
        System.out.println(getActivityAdvice(50, 5));
        System.out.println(getActivityAdvice(22, -5));
    }

    public static String getActivityAdvice(int age, int temperature) {


        if ((age >= 20 && age <= 40 && temperature >= -20 && temperature <= 30)
                || (age < 20 && temperature >= 0 && temperature <= 28)
                || (age < 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять ";
        } else {
            return "Остовайтесь дома";
        }
    }
}

             // Hay Sensei



