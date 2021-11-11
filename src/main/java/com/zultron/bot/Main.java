package com.zultron.bot;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.MessageReaction;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.events.message.guild.react.GuildMessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import javax.security.auth.login.LoginException;
import java.util.Arrays;

public class Main extends ListenerAdapter {

    private static final String token = System.getenv("Zultron_Token");

    public static void main(String[] args) {

        JDABuilder zultron = JDABuilder.createDefault(token);

        zultron.setStatus(OnlineStatus.ONLINE);

        zultron.addEventListeners(new Main());

        try {
            zultron.build();
        } catch (LoginException exception) {
            exception.printStackTrace();
        }

    }

    

}
