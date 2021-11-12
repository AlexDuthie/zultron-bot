package com.zultron.bot.command;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class Greetings extends ListenerAdapter {

    @Override
    public void onGuildMemberJoin(@NotNull GuildMemberJoinEvent event) {
        if(!event.getMember().getUser().isBot()) {
            TextChannel textChannel = event.getGuild().getSystemChannel();
            if(textChannel != null) {
                EmbedBuilder embedBuilder = new EmbedBuilder();

                embedBuilder.setColor(0xD788EA);
                embedBuilder.setTitle("New Member!");
                embedBuilder.setDescription(event.getMember().getAsMention() + " just joined the server!");
                embedBuilder.setThumbnail(event.getMember().getUser().getAvatarUrl());

                textChannel.sendMessage(embedBuilder.build()).queue();
            }
        }
    }
}
