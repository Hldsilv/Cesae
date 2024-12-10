package GameStart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class login {
    /**
     * Compara os dados inseridos com os que estão no ficheiro
     * @param login o user introduz o login
     * @param password o user introduz a password
     * @return true se os dados estiverem de acordo com o ficheiro, false se não estiverem de acordo
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
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
                System.out.println("Login incorrecto!");
                System.out.println(" ");
            }

        sc.close();

        return log;
    }



}
