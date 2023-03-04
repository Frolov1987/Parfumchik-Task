package org.example.app.utils;

public class Constants {
    public final static String DB_DRIVER = "jdbc:sqlite:";
    public final static String DB_BASE_URL = "src/main/resources/database/";
    public final static String DB_NAME = "parfumsdb.db";
    public final static String TABLE_NAME = "parfums";
    public final static String TABLE_TYPE = "parfum";
    public final static String TABLE_SUBTYPE = "parfums";
    public final static String TABLE_SEX = "parfums";

    public final static String NO_SUCH_OPTION_MSG = "There is no such option! Try again: ";
    public final static String NAN_NUMBER_MSG = "\"%s\" - not a number! Try again: ";
    public final static String DB_ABSENT_MSG = "\n>> No database!";
    public final static String DATA_ABSENT_MSG = "\n>> No data.";
    public final static String APP_CLOSED_MSG = "\n>> App closed.";
}
