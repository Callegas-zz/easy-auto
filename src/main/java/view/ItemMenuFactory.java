package view;

public class ItemMenuFactory {
    ColorFactory colorFactory = new ColorFactory();
    ClearScreen clearScreen = new ClearScreen();
    private static String errorLog = " ";
    private static String successLog = " ";

    public String getSuccessLog() {
        return successLog;
    }

    public void setSuccessLog(String successLog) {
        this.successLog = successLog;
    }

    public String getErrorLog() {
        return errorLog;
    }

    public void setErrorLog(String errorLog) {
        this.errorLog = errorLog;
    }


    public void facadeExitMessage(){
        System.out.println(colorFactory.ANSI_YELLOW + "  ________  _____    _   ____ _______    __________  ____     __________  __  _____  ________   ________\n" +
                        " /_  __/ / / /   |  / | / / //_/ ___/   / ____/ __ \\/ __ \\   / ____/ __ \\/  |/  /  |/  /  _/ | / / ____/\n" +
                        "  / / / /_/ / /| | /  |/ / ,<  \\__ \\   / /_  / / / / /_/ /  / /   / / / / /|_/ / /|_/ // //  |/ / / __  \n" +
                        " / / / __  / ___ |/ /|  / /| |___/ /  / __/ / /_/ / _, _/  / /___/ /_/ / /  / / /  / // // /|  / /_/ /  \n" +
                        "/_/ /_/ /_/_/  |_/_/ |_/_/ |_/____/  /_/    \\____/_/ |_|   \\____/\\____/_/  /_/_/  /_/___/_/ |_/\\____/   \n" +
                        "                                                                                                        ");

        System.out.println("visit callegasdev.wordpress.com");
    }

    public void facadeMainMenu(){

        System.out.println(colorFactory.ANSI_BLUE + "  _      ________   __  _________  __  _______   __________      _______   _____  __   ___  __  ____________ \n" +
                " | | /| / / __/ /  / / / ___/ __ \\/  |/  / __/  /_  __/ __ \\    / __/ _ | / __\\ \\/ /  / _ |/ / / /_  __/ __ \\\n" +
                " | |/ |/ / _// /__/ /_/ /__/ /_/ / /|_/ / _/     / / / /_/ /   / _// __ |_\\ \\  \\  /  / __ / /_/ / / / / /_/ /\n" +
                " |__/|__/___/____/____\\___/\\____/_/  /_/___/    /_/  \\____/   /___/_/ |_/___/  /_/  /_/ |_\\____/ /_/  \\____/ \n " +
                "                                                                                                             ");
        System.out.println("                                                                                        By Fellipe Callegas"+ colorFactory.ANSI_RESET);

        System.out.println(colorFactory.ANSI_YELLOW +"          ╔════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("                                      SELECT THE CURRENT OPTION                               ");
        System.out.println("                                                                                              ");
        System.out.println("                                           1. Customer                                        ");
        System.out.println("                                           2. Car                                             ");
        System.out.println("                                           3. Service                                         ");
        System.out.println("                                           0. Exit                                            ");
        System.out.println("          ╚════════════════════════════════════════════════════════════════════════════════════════════════╝\n" + ColorFactory.ANSI_RESET);

        if(getErrorLog() != " ") {
            System.out.println(colorFactory.ANSI_RED + getErrorLog() + colorFactory.ANSI_RESET);
            setErrorLog(" ");
        }
    }

    public void facadeCustomerMenu(){


        System.out.println(colorFactory.ANSI_BLUE + "                      ________  _________________  __  _____________     _____ ________________ ________  _   __\n" +
                "                     / ____/ / / / ___/_  __/ __ \\/  |/  / ____/ __ \\   / ___// ____/ ___/ ___//  _/ __ \\/ | / /\n" +
                "                    / /   / / / /\\__ \\ / / / / / / /|_/ / __/ / /_/ /   \\__ \\/ __/  \\__ \\\\__ \\ / // / / /  |/ / \n" +
                "                   / /___/ /_/ /___/ // / / /_/ / /  / / /___/ _, _/   ___/ / /___ ___/ /__/ // // /_/ / /|  /  \n" +
                "                   \\____/\\____//____//_/  \\____/_/  /_/_____/_/ |_|   /____/_____//____/____/___/\\____/_/ |_/   \n" +
                "                                                                                                                " + colorFactory.ANSI_RESET);

        System.out.println(colorFactory.ANSI_YELLOW +"          ╔════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("                                      SELECT THE CURRENT OPTION                               ");
        System.out.println("                                                                                              ");
        System.out.println("                                      1. Register a new customer                              ");
        System.out.println("                                      2. Remove customer                                      ");
        System.out.println("                                      3. Find Customer                                        ");
        System.out.println("                                      0. Return to main menu                                  ");
        System.out.println("          ╚════════════════════════════════════════════════════════════════════════════════════════════════╝\n" + ColorFactory.ANSI_RESET);

        if(getErrorLog() != " ") {
            System.out.println(colorFactory.ANSI_RED + getErrorLog() + colorFactory.ANSI_RESET);
            setErrorLog(" ");
        }

        if(getSuccessLog() != " ") {
            System.out.println(colorFactory.ANSI_GREEN + getSuccessLog() + colorFactory.ANSI_RESET);
            setSuccessLog(" ");
        }
    }


    public void facadeRegisterCustomer(){
        System.out.println(colorFactory.ANSI_BLUE + "    ____  _____________________________________     _   _________       __   ________  _________________  __  _____________ \n" +
                "   / __ \\/ ____/ ____/  _/ ___/_  __/ ____/ __ \\   / | / / ____/ |     / /  / ____/ / / / ___/_  __/ __ \\/  |/  / ____/ __ \\\n" +
                "  / /_/ / __/ / / __ / / \\__ \\ / / / __/ / /_/ /  /  |/ / __/  | | /| / /  / /   / / / /\\__ \\ / / / / / / /|_/ / __/ / /_/ /\n" +
                " / _, _/ /___/ /_/ // / ___/ // / / /___/ _, _/  / /|  / /___  | |/ |/ /  / /___/ /_/ /___/ // / / /_/ / /  / / /___/ _, _/ \n" +
                "/_/ |_/_____/\\____/___//____//_/ /_____/_/ |_|  /_/ |_/_____/  |__/|__/   \\____/\\____//____//_/  \\____/_/  /_/_____/_/ |_|  \n" +
                "                                                                                                                            " + colorFactory.ANSI_RESET);

        System.out.println("\n\n\n");
    }

    public void facadeDeleteCustomer(){
        System.out.println(colorFactory.ANSI_BLUE + "    ____  ________    __________________   ________  _________________  __  _____________ \n" +
                "   / __ \\/ ____/ /   / ____/_  __/ ____/  / ____/ / / / ___/_  __/ __ \\/  |/  / ____/ __ \\\n" +
                "  / / / / __/ / /   / __/   / / / __/    / /   / / / /\\__ \\ / / / / / / /|_/ / __/ / /_/ /\n" +
                " / /_/ / /___/ /___/ /___  / / / /___   / /___/ /_/ /___/ // / / /_/ / /  / / /___/ _, _/ \n" +
                "/_____/_____/_____/_____/ /_/ /_____/   \\____/\\____//____//_/  \\____/_/  /_/_____/_/ |_|  \n" +
                "                                                                                          " + colorFactory.ANSI_RESET);
        System.out.println("\n\n\n");
    }


    public void facadeFindCustomer(){
        System.out.println(colorFactory.ANSI_BLUE + "    ___________   ______     ________  _________________  __  _____________ \n" +
                "   / ____/  _/ | / / __ \\   / ____/ / / / ___/_  __/ __ \\/  |/  / ____/ __ \\\n" +
                "  / /_   / //  |/ / / / /  / /   / / / /\\__ \\ / / / / / / /|_/ / __/ / /_/ /\n" +
                " / __/ _/ // /|  / /_/ /  / /___/ /_/ /___/ // / / /_/ / /  / / /___/ _, _/ \n" +
                "/_/   /___/_/ |_/_____/   \\____/\\____//____//_/  \\____/_/  /_/_____/_/ |_|  \n" +
                "                                                                            " + colorFactory.ANSI_RESET);
        System.out.println("\n\n\n");
    }

    public void facadeCarMenu(){

        System.out.println(colorFactory.ANSI_BLUE + "   _________    ____     _____ ________________ ________  _   __\n" +
                "                     / ____/   |  / __ \\   / ___// ____/ ___/ ___//  _/ __ \\/ | / /\n" +
                "                    / /   / /| | / /_/ /   \\__ \\/ __/  \\__ \\\\__ \\ / // / / /  |/ / \n" +
                "                   / /___/ ___ |/ _, _/   ___/ / /___ ___/ /__/ // // /_/ / /|  /  \n" +
                "                   \\____/_/  |_/_/ |_|   /____/_____//____/____/___/\\____/_/ |_/   \n" +
                "                                                                                   " + colorFactory.ANSI_RESET);

        System.out.println(colorFactory.ANSI_YELLOW +"          ╔════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("                                      SELECT THE CURRENT OPTION                               ");
        System.out.println("                                                                                              ");
        System.out.println("                                      1. Register a new car                                   ");
        System.out.println("                                      2. Remove car                                           ");
        System.out.println("                                      3. Find car                                             ");
        System.out.println("                                      0. Return to main menu                                  ");
        System.out.println("          ╚════════════════════════════════════════════════════════════════════════════════════════════════╝\n" + ColorFactory.ANSI_RESET);

        if(getErrorLog() != " ") {
            System.out.println(colorFactory.ANSI_RED + getErrorLog() + colorFactory.ANSI_RESET);
            setErrorLog(" ");
        }

        if(getSuccessLog() != " ") {
            System.out.println(colorFactory.ANSI_GREEN + getSuccessLog() + colorFactory.ANSI_RESET);
            setSuccessLog(" ");
        }
    }

    public void facadeRegisterCar(){
        System.out.println(colorFactory.ANSI_BLUE + "    ____  _____________________________________     _   _________       __   _________    ____ \n" +
                "   / __ \\/ ____/ ____/  _/ ___/_  __/ ____/ __ \\   / | / / ____/ |     / /  / ____/   |  / __ \\\n" +
                "  / /_/ / __/ / / __ / / \\__ \\ / / / __/ / /_/ /  /  |/ / __/  | | /| / /  / /   / /| | / /_/ /\n" +
                " / _, _/ /___/ /_/ // / ___/ // / / /___/ _, _/  / /|  / /___  | |/ |/ /  / /___/ ___ |/ _, _/ \n" +
                "/_/ |_/_____/\\____/___//____//_/ /_____/_/ |_|  /_/ |_/_____/  |__/|__/   \\____/_/  |_/_/ |_|  \n" +
                "                                                                                               " + colorFactory.ANSI_RESET);

        System.out.println("\n\n\n");
    }

    public void facadeDeleteCar(){
        System.out.println(colorFactory.ANSI_BLUE + "    ____  ________    __________________   _________    ____ \n" +
                "   / __ \\/ ____/ /   / ____/_  __/ ____/  / ____/   |  / __ \\\n" +
                "  / / / / __/ / /   / __/   / / / __/    / /   / /| | / /_/ /\n" +
                " / /_/ / /___/ /___/ /___  / / / /___   / /___/ ___ |/ _, _/ \n" +
                "/_____/_____/_____/_____/ /_/ /_____/   \\____/_/  |_/_/ |_|  \n" +
                "                                                             " + colorFactory.ANSI_RESET);
        System.out.println("\n\n\n");
    }


    public void facadeFindCar(){
        System.out.println(colorFactory.ANSI_BLUE + "    ___________   ______     _________    ____ \n" +
                "   / ____/  _/ | / / __ \\   / ____/   |  / __ \\\n" +
                "  / /_   / //  |/ / / / /  / /   / /| | / /_/ /\n" +
                " / __/ _/ // /|  / /_/ /  / /___/ ___ |/ _, _/ \n" +
                "/_/   /___/_/ |_/_____/   \\____/_/  |_/_/ |_|  \n" +
                "                                               " + colorFactory.ANSI_RESET);
        System.out.println("\n\n\n");
    }

    public void facadeService(){

        System.out.println(colorFactory.ANSI_BLUE + "                      _____ __________ _    __________________   _____ ________________ ________  _   __\n" +
                "                     / ___// ____/ __ \\ |  / /  _/ ____/ ____/  / ___// ____/ ___/ ___//  _/ __ \\/ | / /\n" +
                "                     \\__ \\/ __/ / /_/ / | / // // /   / __/     \\__ \\/ __/  \\__ \\\\__ \\ / // / / /  |/ / \n" +
                "                     __/ / /___/ _, _/| |/ // // /___/ /___    ___/ / /___ ___/ /__/ // // /_/ / /|  /  \n" +
                "                   /____/_____/_/ |_| |___/___/\\____/_____/   /____/_____//____/____/___/\\____/_/ |_/   \n" +
                "                                                                                                        ");

        System.out.println(colorFactory.ANSI_YELLOW +"          ╔════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("                                      SELECT THE CURRENT OPTION                               ");
        System.out.println("                                                                                              ");
        System.out.println("                                      1. New Rent                                             ");
        System.out.println("                                      2. Finish Rent                                          ");
        System.out.println("                                      0. Return to main menu                                  ");
        System.out.println("          ╚════════════════════════════════════════════════════════════════════════════════════════════════╝\n" + ColorFactory.ANSI_RESET);

        if(getErrorLog() != " ") {
            System.out.println(colorFactory.ANSI_RED + getErrorLog() + colorFactory.ANSI_RESET);
            setErrorLog(" ");
        }

        if(getSuccessLog() != " ") {
            System.out.println(colorFactory.ANSI_GREEN + getSuccessLog() + colorFactory.ANSI_RESET);
            setSuccessLog(" ");
        }
    }

    public void facadeNewRent(){
        System.out.println(colorFactory.ANSI_BLUE + "    _   _________       __   ____  _______   ________\n" +
                "   / | / / ____/ |     / /  / __ \\/ ____/ | / /_  __/\n" +
                "  /  |/ / __/  | | /| / /  / /_/ / __/ /  |/ / / /   \n" +
                " / /|  / /___  | |/ |/ /  / _, _/ /___/ /|  / / /    \n" +
                "/_/ |_/_____/  |__/|__/  /_/ |_/_____/_/ |_/ /_/     \n" +
                "                                                     " + colorFactory.ANSI_RESET);

        System.out.println("\n\n\n");
    }

    public void facadeFinishRent(){
        System.out.println(colorFactory.ANSI_BLUE + "    ___________   ___________ __  __   ____  _______   ________\n" +
                "   / ____/  _/ | / /  _/ ___// / / /  / __ \\/ ____/ | / /_  __/\n" +
                "  / /_   / //  |/ // / \\__ \\/ /_/ /  / /_/ / __/ /  |/ / / /   \n" +
                " / __/ _/ // /|  // / ___/ / __  /  / _, _/ /___/ /|  / / /    \n" +
                "/_/   /___/_/ |_/___//____/_/ /_/  /_/ |_/_____/_/ |_/ /_/     \n" +
                "                                                               " + colorFactory.ANSI_RESET);

        System.out.println("\n\n\n");

    }

    public void eraseLog() {
        setErrorLog(" ");
        setSuccessLog(" ");
    }
}
