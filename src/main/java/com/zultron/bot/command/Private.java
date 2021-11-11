package com.zultron.bot.command;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.message.priv.PrivateMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class Private extends ListenerAdapter {

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        String message[] = event.getMessage().getContentRaw().split(" ");
        if (message[0].equals("z!private")) {
            Member member = event.getMessage().getMentionedMembers().get(0);
            member.getUser().openPrivateChannel().queue(privateChannel -> {
                privateChannel.sendMessage("HEY " + privateChannel.getUser().getAsMention() + "!").queue();
            });
        }
    }

    @Override
    public void onPrivateMessageReceived(@NotNull PrivateMessageReceivedEvent event) {
        if(!event.getAuthor().isBot()) {
            event.getChannel().sendMessage("you messaged me!").queue();
        }
    }
}
