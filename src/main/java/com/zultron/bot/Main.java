package com.zultron.bot;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;

import javax.security.auth.login.LoginException;

public class Main {

    private static JDABuilder zultron;

    public static void main(String[] args) {

        zultron = JDABuilder.createDefault("ODk3MTYxODM1OTUyODY5NDU3.YWRpEg.BWK2vILRrGkJDnZ59GlsmyEwNsc");

        zultron.setStatus(OnlineStatus.ONLINE);

        try {
            zultron.build();
        } catch (LoginException exception) {
            exception.printStackTrace();
        }

    }

}
