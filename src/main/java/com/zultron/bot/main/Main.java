package com.zultron.bot.main;

import com.zultron.bot.command.Greetings;
import com.zultron.bot.command.Help;
import net.dv8tion.jda.api.*;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;

public class Main extends ListenerAdapter {

    private static final String token = System.getenv("Zultron_Token");

    public static void main(String[] args) {

        JDABuilder zultron = JDABuilder.createDefault(token);

        zultron.setStatus(OnlineStatus.ONLINE);
        zultron.setActivity(Activity.playing("z!help"));

        zultron.addEventListeners(new Help());
        zultron.addEventListeners(new Greetings());
        zultron.enableIntents(GatewayIntent.GUILD_MEMBERS);

        try {
            zultron.build();
        } catch (LoginException exception) {
            exception.printStackTrace();
        }

    }

}
