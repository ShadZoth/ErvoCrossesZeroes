package ru.hse.se.g272.ervo.ooaip.crosszeros;

import ru.hse.se.g272.ervo.ooaip.Form;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Form for choosing an action.
 *
 * @author Ervo Victor
 * @since 07.04.2014
 */
public class ChooseForm extends Form {

    /**
     * Form that called this form.
     */
    private final ru.hse.se.g272.ervo.ooaip.crosszeros.CrossZerosForm invoker;

    /**
     * Constructs new form.
     * @param form Form that called this form
     */
    public ChooseForm(final ru.hse.se.g272.ervo.ooaip.crosszeros.CrossZerosForm form) {
        this.invoker = form;
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setDefaultSize(THIRDSCREEN);
        JPanel main = new JPanel(new GridLayout(2, 1));
        main.add(new JLabel("Choose action"));
        JPanel buttons = new JPanel(new GridLayout(1, 2));
        JButton createServerButton = new JButton("Create server");
        createServerButton.addActionListener(event -> {
            setVisible(false);
            createServer();
        });
        buttons.add(createServerButton);
        JButton joinGameButton = new JButton("Join game");
        joinGameButton.addActionListener(event -> {
            setVisible(false);
            joinGame();
        });
        buttons.add(joinGameButton);
        main.add(buttons);
        add(main);
    }

    /**
     * Joins game.
     */
    private void joinGame() {
        try {
            invoker.setClientSocket(new Socket(getHostnameFromUser(),
                    getPortFromUser()));
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets hostname from user.
     *
     * @return localhost
     */
    private String getHostnameFromUser() throws InterruptedException {
        //return getDataGetterGUI().getString("Input hostname");
        return "localhost";
    }

    /**
     * Creates new server.
     */
    private void createServer() {
        try {
            invoker.setServerSocket(new ServerSocket(getPortFromUser()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @return 8080
     */
    private int getPortFromUser() {
        return 8080;
    }
}
