package by.itstep.goutor.finaloopproject.util;


public class UserUI {
    public static final StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static String getUserUI(boolean vinWithStartStaff) {

        BUILDER.append("\nWin hero bosses with start staff? ")
                .append(vinWithStartStaff ? "Yes" : "No");


        return BUILDER.toString();
    }

}
