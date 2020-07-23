package testFinal;

public class Main {
    public static void main(String[] args) {
        int pw = 88990088;
        Password password = new Password(pw);
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(99337420);
        password.letMeIn(1234);
        password.letMeIn(88990088);
        password.letMeIn(234);



    }
}
