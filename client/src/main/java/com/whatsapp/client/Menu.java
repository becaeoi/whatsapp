package com.whatsapp.client;

import com.whatsapp.client.menu.MenuEntry;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Menu class.
 * ===========
 *
 * Prints and handles the menu.
 *
 * The constructor accepts as parameter the menu entries.
 *
 * To run the menu call `start`, to stop call `stop`.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
public class Menu implements Runnable {
    /**
     * Menu entries.
     */
    private final List<MenuEntry> entries = new ArrayList<>();

    /**
     * Scanner.
     */
    private final Scanner in = new Scanner(System.in);

    /**
     * Menu thread.
     */
    private final Thread thread = new Thread(this);

    /**
     * Whether the menu is running or not.
     */
    private boolean isRunning = false;

    /**
     * Constructor.
     *
     * @param entries Menu entries.
     */
    public Menu(MenuEntry... entries) {
        this.add(entries);
    }

    /**
     * Starts the menu.
     */
    public void start() {
        if (this.isRunning) {
            return;
        }

        this.thread.start();
        this.isRunning = true;
    }

    /**
     * Stops the menu.
     */
    public void stop() {
        if (!this.isRunning) {
            return;
        }

        this.isRunning = false;
    }

    /**
     * Starts the menu.
     */
    public void run() {
        while(this.isRunning) {
            System.out.println("PRODUCTATOR V1");
            System.out.println("-------------------------------");

            for (int i = 0; i < this.entries.size(); i++) {
                MenuEntry entry = this.entries.get(i);

                System.out.println(i + " - " + entry.getName());
            }

            System.out.println("-------------------------------");
            System.out.print("Elige la opción: ");

            try {
                int option = this.in.nextInt();

                this.entries.get(option).run();
            } catch (Exception e) {
                System.out.println("No se ha podido encontrar la opción!");
            }
        }
    }

    /**
     * Adds an entry to the menu.
     *
     * @param entry Entry to add.
     */
    public void add(MenuEntry entry) {
        this.entries.add(entry);
    }

    /**
     * Adds some entries to the menu.
     *
     * @param entries Entries to add.
     */
    public void add(MenuEntry[] entries) {
        for (MenuEntry entry : entries) {
            this.add(entry);
        }
    }
}
