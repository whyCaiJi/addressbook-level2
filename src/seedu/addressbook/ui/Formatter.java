package seedu.addressbook.ui;

import static seedu.addressbook.common.Messages.*;

import java.util.List;

/**
 * Formatter class to process printing message for TextUi class
 */

public class Formatter {
    /** A decorative prefix added to the beginning of lines printed by AddressBook */
    private static final String LINE_PREFIX = "|| ";

    /** A platform independent line separator. */
    private static final String LS = System.lineSeparator();

    private static final String DIVIDER = "===================================================";

    /** Format of indexed list item */
    private static final String MESSAGE_INDEXED_LIST_ITEM = "\t%1$d. %2$s";


    /** Offset required to convert between 1-indexing and 0-indexing.  */
    public static final int DISPLAYED_INDEX_OFFSET = 1;

    /** Format of a comment input line. Comment lines are silently consumed when reading user input. */
    private static final String COMMENT_LINE_FORMAT_REGEX = "#.*";
    
    /**
     * @return comment line format regex string
     */
    public String getCommentLineFormatRegex() {
    	return COMMENT_LINE_FORMAT_REGEX;
    }
    
    /**
     * @return string for prompting user to enter commands 
     */
    public String getEnterCommandMessage() {
    	return LINE_PREFIX + "Enter command: ";
    }
    
    /**
     * @param fullInputLine from user command
     * @return full formatted string including user input
     */
    public String getInputCommand(String fullInputLine) {
    	return "[Command entered:" + fullInputLine + "]";
    }
    
    /**
     * @param version
     * @param storageFileInfo
     * @return full formatted string of welcome message
     */
    public String getWelcomeMessage(String version, String storageFileInfo) {
    	return DIVIDER + "\n" + DIVIDER + "\n" + MESSAGE_WELCOME + "\n" + version
    			+ "\n" + MESSAGE_PROGRAM_LAUNCH_ARGS_USAGE + "\n" + storageFileInfo
    			+ "\n" + DIVIDER;
    }
    
    /**
     * @return full formatted string of goodbye message
     */
    public String getGoodbyeMessage() {
    	return MESSAGE_GOODBYE + "\n" + DIVIDER + "\n" + DIVIDER;
    }
    
    /**
     * @return full formatted string of initialization failed message
     */
    public String getInitFailedMessage() {
    	return MESSAGE_INIT_FAILED + "\n" + DIVIDER + "\n" + DIVIDER;
    }
    
    /**
     * @param feedbackToUser
     * @return full formatted string of feedback to user
     */
    public String getFeedbackMessage(String feedbackToUser) {
    	return feedbackToUser + "\n" + DIVIDER;
    }
    
    /**
     * @param m
     * @return format the string input for showToUser() in TextUi class
     */
    public String getShowToUserString(String m) {
    	return LINE_PREFIX + m.replace("\n", LS + LINE_PREFIX);
    }
    
    /**
     * @param listItems
     * @return full formatted string of a indexed list
     */
    public String processIndexedListForViewing(List<String> listItems) {
    	final StringBuilder formatted = new StringBuilder();
        int displayIndex = 0 + DISPLAYED_INDEX_OFFSET;
        for (String listItem : listItems) {
            formatted.append(getIndexedListItem(displayIndex, listItem)).append("\n");
            displayIndex++;
        }
        
        return formatted.toString();
    }
    
    /**
     * Formats a string as a viewable indexed list item.
     *
     * @param visibleIndex visible index for this listing
     */
    private static String getIndexedListItem(int visibleIndex, String listItem) {
        return String.format(MESSAGE_INDEXED_LIST_ITEM, visibleIndex, listItem);
    }
}
