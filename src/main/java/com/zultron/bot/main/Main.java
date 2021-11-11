package com.zultron.bot.main;

import com.zultron.bot.command.Help;
import com.zultron.bot.command.Private;
import net.dv8tion.jda.api.*;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;

public class Main extends ListenerAdapter {

    private static final String token = System.getenv("Zultron_Token");

    public static void main(String[] args) {

        JDABuilder zultron = JDABuilder.createDefault(token);

        zultron.setStatus(OnlineStatus.ONLINE);

        zultron.addEventListeners(new Private());

        try {
            zultron.build();
        } catch (LoginException exception) {
            exception.printStackTrace();
        }

    }

}