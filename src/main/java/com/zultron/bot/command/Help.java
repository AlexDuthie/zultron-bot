package com.zultron.bot.command;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class Help extends ListenerAdapter {

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        String[] message = event.getMessage().getContentRaw().split(" ");

        if(message[0].equals("z!help")) {

            EmbedBuilder embedBuilder = new EmbedBuilder();

            embedBuilder.setTitle("Zultron Help");
            embedBuilder.setColor(0xF24343);
            embedBuilder.setDescription("Welcome to the Zultron Help Screen");
            embedBuilder.setFooter("Work In Progress", event.getMessage().getAuthor().getAvatarUrl());

            event.getChannel().sendMessage(embedBuilder.build()).queue();
        }
    }

}
