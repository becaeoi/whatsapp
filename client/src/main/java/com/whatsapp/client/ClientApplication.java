package com.whatsapp.client;

import com.whatsapp.client.dto.UserDto;
import com.whatsapp.client.menu.Inbox;
import com.whatsapp.client.menu.SendMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.util.Scanner;

@SpringBootApplication
public class ClientApplication {
    public static final String url = "http://localhost:8080/";
    public static UserDto me;

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
        Scanner in = new Scanner(System.in);

        System.out.println("Registrate!");
        System.out.print("N. teléfono: ");
        String phone = in.nextLine();

        System.out.print("Nombre: ");
        String name = in.nextLine();

        UserDto dto = new UserDto();
        dto.setName(name);
        dto.setPhone(phone);

        RestTemplate tpl = new RestTemplate();
        me = tpl.postForObject(url + "/user/register", dto, UserDto.class);

        Menu menu = new Menu(
                new SendMessage(),
                new Inbox()
        );
        menu.start();
    }

}
