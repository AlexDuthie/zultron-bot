package com.zultron.bot.command;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.events.message.guild.react.GuildMessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Poll extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split(" ");
        String question;

        System.out.println(Arrays.toString(args));

        question = args[1];
        String choice_a = args[2];
        String choice_b = args[3];
        String choice_c = args[4];

        System.out.println(question + choice_a + choice_b + choice_c);

        if(args[0].equals("z!poll")) {
            EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setTitle(question);
            embedBuilder.setColor(Color.blue);
            embedBuilder.setDescription(
                    ":one: " + choice_a
                    + "\n" +
                    ":two: " + choice_b
                    + "\n" +
                    ":three: " + choice_c);
            embedBuilder.setFooter("Select Below");
            event.getChannel().sendMessage(embedBuilder.build()).queue();
        }
    }

}
