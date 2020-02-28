package com.whatsapp.client.menu;

/**
 * Menu entry.
 * ===========
 *
 * Common interface for all menu entries.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
public interface MenuEntry {
    /**
     * Returns the menu entry name.
     *
     * @return Menu entry name.
     */
    String getName();

    /**
     * Runs the entry.
     */
    void run();
}
