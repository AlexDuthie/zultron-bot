package com.zultron.bot.command;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class KillUser extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent event) {
        String [] msg = event.getMessage().getContentRaw().split(" ");

        if(msg[0].equals("z!kill")) {
            Member member = event.getMessage().getMentionedMembers().get(0);
            if(!member.getUser().isBot()) {
                event.getChannel().sendMessage(member.getUser().getAsMention() + " has been wiped out by " + event.getAuthor().getAsMention()).queue();
                event.getChannel().sendMessage("https://qph.fs.quoracdn.net/main-qimg-d8b626975a53daa4ac8f519cb9408ab6").queue();
            } else {
                event.getChannel().sendMessage("I will not kill my own kind.").queue();
            }
        }
    }

}
