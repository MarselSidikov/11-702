package ru.itis;

/**
 * 07.11.2017
 * Button
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Button {
    private ActionHandler actionHandler;

    public void click() {
        actionHandler.handle();
    }

    public void setActionHandler(ActionHandler actionHandler) {
        this.actionHandler = actionHandler;
    }
}
