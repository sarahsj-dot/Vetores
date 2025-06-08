import java.util.Scanner;

public class IdentificadorSenhas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Validador de Senhas Incomuns ===");
        System.out.println("A senha deve conter:");
        System.out.println("- Pelo menos uma letra maiúscula");
        System.out.println("- Pelo menos um número primo (2, 3, 5, 7)");
        System.out.println("- Pelo menos um caractere especial (!@#$%^&*)");
        System.out.println("- Não pode conter vogais duplicadas seguidas (aa, ee, ii, oo, uu)");
        System.out.print("\nDigite a senha para validação: ");

        String senha = sc.nextLine();
        boolean valida = validarSenha(senha);

        if (valida) {
            System.out.println("Senha válida! Atende a todos os critérios.");
        } else {
            System.out.println("Senha inválida! Não atende a todos os critérios.");
        }
    }

    public static boolean validarSenha(String senha) {
        boolean temMaiuscula = false;
        boolean temNumeroPrimo = false;
        boolean temCaractereEspecial = false;
        boolean semVogaisDuplicadas = true;

        String caracteresEspeciais = "!@#$%^&*";
        String vogais = "aeiouAEIOU";

        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);

            if (Character.isUpperCase(c)) {
                temMaiuscula = true;
            }

            if (Character.isDigit(c)) {
                int num = Character.getNumericValue(c);
                if (num == 2 || num == 3 || num == 5 || num == 7) {
                    temNumeroPrimo = true;
                }
            }


            if (caracteresEspeciais.indexOf(c) != -1) {
                temCaractereEspecial = true;
            }

            if (i > 0 && vogais.indexOf(c) != -1) {
                char anterior = senha.charAt(i - 1);
                if (vogais.indexOf(anterior) != -1 &&
                        Character.toLowerCase(anterior) == Character.toLowerCase(c)) {
                    semVogaisDuplicadas = false;
                }
            }
        }

        return temMaiuscula && temNumeroPrimo && temCaractereEspecial && semVogaisDuplicadas;
        }
}
