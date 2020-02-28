package com.whatsapp.client.menu;

import com.whatsapp.client.ClientApplication;
import com.whatsapp.client.dto.MessageDto;
import com.whatsapp.client.dto.UserDto;
import org.springframework.web.client.RestTemplate;

public class Inbox implements MenuEntry {
    /**
     * Returns the menu entry name.
     *
     * @return Menu entry name.
     */
    @Override
    public String getName() {
        return "Bandeja de entrada";
    }

    /**
     * Runs the entry.
     */
    @Override
    public void run() {
        RestTemplate tpl = new RestTemplate();
        MessageDto[] inbox = tpl.getForObject(
                ClientApplication.url + "message/inbox/" + ClientApplication.me.getId(),
                MessageDto[].class
        );

        if (inbox == null) {
            System.out.println("No se ha encontrado la bandeja de entrada!");

            return;
        }

        for(MessageDto message : inbox) {
            UserDto author = tpl.getForObject(
                    ClientApplication.url + "user/byId/" + message.getFrom_id(),
                    UserDto.class
            );

            if (author == null) {
                System.out.println("No se ha encontrado al usuario!");

                continue;
            }

            System.out.printf(
                    "[%s - %s]: %s\n",
                    author.getName(),
                    author.getPhone(),
                    message.getText()
            );
        }
    }
}
