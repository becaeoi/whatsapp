package com.whatsapp.client.menu;

import com.whatsapp.client.ClientApplication;
import com.whatsapp.client.dto.MessageDto;
import com.whatsapp.client.dto.UserDto;
import org.springframework.web.client.RestTemplate;

import java.util.Scanner;

public class SendMessage implements MenuEntry {
    /**
     * Returns the menu entry name.
     *
     * @return Menu entry name.
     */
    @Override
    public String getName() {
        return "Enviar mensaje";
    }

    /**
     * Runs the entry.
     */
    @Override
    public void run() {
        Scanner      in  = new Scanner(System.in);
        RestTemplate tpl = new RestTemplate();

        System.out.print("Destinatario: ");
        String phone = in.nextLine();

        System.out.print("Mensaje: ");
        String message = in.nextLine();

        UserDto to = tpl.getForObject(ClientApplication.url + "/user/byPhone/" + phone, UserDto.class);

        if (to == null) {
            System.out.println("No existe el destinatario!");

            return;
        }

        MessageDto dto = new MessageDto();
        dto.setFrom_id(ClientApplication.me.getId());
        dto.setText(message);
        dto.setTo_id(to.getId());

        MessageDto result = tpl.postForObject(ClientApplication.url + "/message/send", dto, MessageDto.class);

        if (result == null) {
            System.out.println("No se ha podido enviar el mensaje!");

            return;
        }

        System.out.println("[" + to.getName() + " - " + to.getPhone() + "]: " + result.getText());
    }
}
