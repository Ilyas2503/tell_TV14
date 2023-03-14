import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите что желаете телефон или телевизор? и укажите какую модель: ");
        createObject(scanner.nextLine());
    }

    public static Object createObject(String className) {
        switch (className) {
            case "Chigo":
                Chigo chigo = new Chigo("Chigo", "У современных Chigo автоматическое выравнивание " +
                        "громкости,\nобъемное звучание, стереозвук.", 120, 60);
                chigo.print();
                return chigo;

                case "LG":
                Lg lg = new Lg("LG", "Сегодня у LG с экраном QLED можно назвать улучшенным " +
                        "вариантом LED-экрана.", 120, 60);
                lg.print();
                return lg;

            case "Sony":
                Sony sony = new Sony("Sony", "Некоторые современные " +
                        "телевизоры, произведенные компанией Sony, оснащаются специальными " + "\n" +
                        "слотами для подключения фирменных карт памяти стандарта Memory Stick.",
                        120, 60);
                sony.print();
                return sony;

            case "Samsung":
                Samsung samsung = new Samsung ("12GB", "samsung",
                        "micro SDHC 32GB");
                samsung.print();
                return samsung;

            case "Redmi":
                Redmi redmi = new Redmi("6GB", "redmi", "13 mpx");
                redmi.print();
                return redmi;

            case "Huawei":
                Huawei huawei = new Huawei("8GB", "huawei", "Lite/10i HB396286");
                huawei.print();
                return huawei;
        }
            return null;
        }
    }

