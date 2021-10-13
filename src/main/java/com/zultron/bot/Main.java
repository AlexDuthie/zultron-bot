package com.zultron.bot;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;

import javax.security.auth.login.LoginException;

public class Main {

    private static final String token = "ODk3MTYxODM1OTUyODY5NDU3.YWRpEg.3or-HNLoME2VFnSCTcrzgwJrTnM";

    public static void main(String[] args) {

        JDABuilder zultron = JDABuilder.createDefault(token);

        zultron.setStatus(OnlineStatus.ONLINE);

        try {
            zultron.build();
        } catch (LoginException exception) {
            exception.printStackTrace();
        }

    }

}
