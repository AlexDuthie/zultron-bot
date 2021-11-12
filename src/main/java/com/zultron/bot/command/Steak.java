package com.zultron.bot.command;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Steak extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split(" ");

        String[] res = {
                "yeeee boi",
                "i love me some steak I do",
                "did somebody mention steak?",
                "great... now I'm hungry",
                "if(!steak.equals('rare'))... gtfo"
        };

        System.out.println(Arrays.toString(args));
        for(int i = 0; i < args.length; i++) {
            if(args[i].equals("steak")) {
                int rand = (int)(Math.random() * res.length);
                System.out.println(rand);
                event.getChannel().sendMessage(res[rand]).queue();
            }
        }
    }

}
