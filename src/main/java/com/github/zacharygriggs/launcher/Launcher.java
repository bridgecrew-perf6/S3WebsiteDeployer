package com.github.zacharygriggs.launcher;

import com.github.zacharygriggs.deployer.WebsiteDeployer;
import com.github.zacharygriggs.deployer.WebsiteDownloader;
import com.github.zacharygriggs.utils.ConsoleUtils;

public class Launcher {

    public static void main(String[] args) {
        String actionType;
        if(args.length == 1) {
            actionType = args[0];
        } else {
            actionType = ConsoleUtils.promptAction("deploy", "download");
        }

        if(actionType.equalsIgnoreCase("deploy")) {
            new WebsiteDeployer().launch();
        } else if(actionType.equalsIgnoreCase("download")) {
            new WebsiteDownloader().launch();
        } else {
            System.out.println("Invalid action type: " + actionType);
        }
    }
}
