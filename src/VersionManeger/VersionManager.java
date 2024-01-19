package VersionManeger;

import java.text.Format;

public class VersionManager {
    private int MAJOR = 0;
    private int MINOR = 0;
    private int PATCH = 0;

    public VersionManager() {
        this.MAJOR = 0;
        this.MINOR = 0;
        this.PATCH = 1;
    }

    public VersionManager(int MAJOR) {
        try {
            if (MAJOR > 0)
                this.MAJOR = MAJOR;
            else
                throw new NumberFormatException();
        } catch (NumberFormatException num) {
            System.out.println("Error occured while parsing version!");
        }
    }

    public VersionManager(int MAJOR, int MINOR) {
        try {
            if (MAJOR > 0 && MINOR > 0) {
                this.MAJOR = MAJOR;
                this.MINOR = MINOR;
            } else
                throw new NumberFormatException();
        } catch (NumberFormatException num) {
            System.out.println("Error occured while parsing version!");
        }
    }

    public VersionManager(int MAJOR, int MINOR, int PATCH) {
        try {
            if (MAJOR > 0 && MINOR > 0 && PATCH > 0) {
                this.MAJOR = MAJOR;
                this.MINOR = MINOR;
                this.PATCH = PATCH;

            } else
                throw new NumberFormatException();
        } catch (NumberFormatException num) {
            System.out.println("Error occured while parsing version!");
        }
    }

    public void major() {
        MAJOR += 1;
        MINOR = 0;
        PATCH = 0;
    }

    public void minor() {
        MINOR += 1;
        PATCH = 0;
    }

    public void patch() {
        PATCH += 1;
    }

    public void rollback() {
        try {
            if (PATCH > 1) {
                PATCH -= 1;
            } else if (MINOR > 1) {
                MINOR -= 1;
            } else if (MAJOR > 1) {
                MAJOR -= 1;
            } else {
                throw new Exception();
            }
        } catch (Exception exception) {
            System.out.println("Cannot rollback!");
        }
    }

    public void release() {
        System.out.printf("%s.%s.%s%n", MAJOR, MINOR, PATCH);
    }
}
