package testFinal;

public class Password {
    private static final int KEY = 99337420;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password) {
        return password ^ KEY;
    }

    public void storePassword() {
        System.out.println("Salvando sua senha como "+ this.encryptedPassword);
    }

    public boolean letMeIn(int password){
        if(encryptDecrypt(password) == this.encryptedPassword){
            System.out.println("Seja bem vindo");
            return true;
        } else {
            System.out.println("Senha incorreta");
            return false;
        }
    }
}
