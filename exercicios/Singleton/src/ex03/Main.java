package ex03;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        UserSessionManager novaSessao1 = UserSessionManager.getInstance();

        System.out.println("Token de acesso: " + novaSessao1.getSessionToken());
        System.out.println("Último acesso: " + novaSessao1.getLastAccess());

        sleep(10000);
        novaSessao1.updateLastAccess();
        System.out.println("Token de acesso: " + novaSessao1.getSessionToken());
        System.out.println("Último acesso: " + novaSessao1.getLastAccess());

    }
}
