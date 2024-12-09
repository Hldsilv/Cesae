package GameStart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class login {

    public static boolean login(String login, String password) throws FileNotFoundException {
        File scannerFicheiro = new File("GameStartF/Gamestart_AdminLogin.csv");
        Scanner sc = new Scanner(scannerFicheiro);
        Scanner input = new Scanner(System.in);
        boolean log = false;

        String linha = sc.nextLine();
        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensDaLinha = linha.split(";");

            if (login.equals(itensDaLinha[0]) && password.equals(itensDaLinha[1])) {

                System.out.println("Login correcto");
                System.out.println(" ");
                log = true;
                break;
            }
        }
            if(!log) {
                System.out.println("Login incorrecto. Tente outra vez!");
                System.out.println(" ");
            }

        sc.close();

        return log;
    }



}
