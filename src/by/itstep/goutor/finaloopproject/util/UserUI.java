package by.itstep.goutor.finaloopproject.util;


import by.itstep.goutor.finaloopproject.model.entity.artifact.Artifact;

public class UserUI {
    public static final StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static String getUserUI(boolean vinWithStartStaff, Artifact minStatArtifactUp) {

        BUILDER.append("\nWin hero bosses with start staff? ")
                .append(vinWithStartStaff ? "Yes" : "No")
                .append("\nMin artifact to hero win: ").append(minStatArtifactUp.getName());


        return BUILDER.toString();
    }

}
