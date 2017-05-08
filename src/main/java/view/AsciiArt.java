package view;

public class AsciiArt {
    ColorFactory colorFactory = new ColorFactory();
    private String errorLog = "";

    public String getErrorLog() {
        return errorLog;
    }

    public void setErrorLog(String errorLog) {
        this.errorLog = errorLog;
    }

    public void asciiFacede(){
        System.out.println(colorFactory.ANSI_CYAN_BACKGROUND);
        System.out.println(colorFactory.ANSI_RESET);
    }

    public void asciiExitMessage(){
        System.out.println(colorFactory.ANSI_YELLOW +" ________            __         ___                                _         \n" +
                "/_  __/ / ___ ____  / /_____   / ____  ____  _______  __ _  __ _  (____ ___ _\n" +
                " / / / _ / _ `/ _ \\/  '_(_-<  / _/ _ \\/ __/ / __/ _ \\/  ' \\/  ' \\/ / _ / _ `/\n" +
                "/_/ /_//_\\_,_/_//_/_/\\_/___/ /_/ \\___/_/    \\__/\\___/_/_/_/_/_/_/_/_//_\\_, / \n" +
                "                                                                      /___/  ");
    }

    public void asciiMainMenu(){
        asciiFacede();

        System.out.println(getErrorLog());
        setErrorLog("");

        System.out.println(colorFactory.ANSI_BLUE + "  _      ________   __  _________  __  _______   __________      _______   _____  __   ___  __  ____________ \n" +
                " | | /| / / __/ /  / / / ___/ __ \\/  |/  / __/  /_  __/ __ \\    / __/ _ | / __\\ \\/ /  / _ |/ / / /_  __/ __ \\\n" +
                " | |/ |/ / _// /__/ /_/ /__/ /_/ / /|_/ / _/     / / / /_/ /   / _// __ |_\\ \\  \\  /  / __ / /_/ / / / / /_/ /\n" +
                " |__/|__/___/____/____\\___/\\____/_/  /_/___/    /_/  \\____/   /___/_/ |_/___/  /_/  /_/ |_\\____/ /_/  \\____/ \n " +
                "                                                                                                             ");
        System.out.println("                                                                                        By Fellipe Callegas"+ colorFactory.ANSI_RESET);

        System.out.println(colorFactory.ANSI_YELLOW +"          ╔════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("          ║                           SELECT THE CURRENT OPTION                              ║");
        System.out.println("          ║                                                                                  ║");
        System.out.println("          ║                                1. Customer                                       ║");
        System.out.println("          ║                                2. Car                                            ║");
        System.out.println("          ║                                3. Service                                        ║");
        System.out.println("          ║                                0. Exit                                           ║");
        System.out.println("          ╚════════════════════════════════════════════════════════════════════════════════════════════════╝\n" + ColorFactory.ANSI_RESET);

    }

    public void asciiCustomerMenu(){
        asciiFacede();

        System.out.println(getErrorLog());
        setErrorLog("");

        System.out.println(colorFactory.ANSI_BLUE + "               _______  ________________  __  __________    ________________________  _  __\n" +
                "              / ___/ / / / __/_  __/ __ \\/  |/  / __/ _ \\  / __/ __/ __/ __/  _/ __ \\/ |/ /\n" +
                "             / /__/ /_/ /\\ \\  / / / /_/ / /|_/ / _// , _/ _\\ \\/ _/_\\ \\_\\ \\_/ // /_/ /    / \n" +
                "             \\___/\\____/___/ /_/  \\____/_/  /_/___/_/|_| /___/___/___/___/___/\\____/_/|_/  \n" +
                "                                                                              " + colorFactory.ANSI_RESET);

        System.out.println(colorFactory.ANSI_YELLOW +"          ╔════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("          ║                           SELECT THE CURRENT OPTION                              ║");
        System.out.println("          ║                                                                                  ║");
        System.out.println("          ║                           1. Register a new customer                             ║");
        System.out.println("          ║                           2. Remove customer                                     ║");
        System.out.println("          ║                           3. Find Customer                                       ║");
        System.out.println("          ║                           0. Return to main menu                                 ║");
        System.out.println("          ╚════════════════════════════════════════════════════════════════════════════════════════════════╝\n" + ColorFactory.ANSI_RESET);

    }

    public void asciiRegisterCustomer(){
        System.out.println(colorFactory.ANSI_BLUE + "   ___  ______________________________      _  _______      __    _______  ________________  __  __________ \n" +
                "  / _ \\/ __/ ___/  _/ __/_  __/ __/ _ \\    / |/ / __/ | /| / /   / ___/ / / / __/_  __/ __ \\/  |/  / __/ _ \\\n" +
                " / , _/ _// (_ // /_\\ \\  / / / _// , _/   /    / _/ | |/ |/ /   / /__/ /_/ /\\ \\  / / / /_/ / /|_/ / _// , _/\n" +
                "/_/|_/___/\\___/___/___/ /_/ /___/_/|_|   /_/|_/___/ |__/|__/    \\___/\\____/___/ /_/  \\____/_/  /_/___/_/|_|" + colorFactory.ANSI_RESET);

        System.out.println("\n\n\n\n\n\n\n\n\n\n");
    }


}
