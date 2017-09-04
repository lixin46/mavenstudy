package com.lixin;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by lixin46 on 2017/9/1.
 */
public class A {
    public static final String[] NEW_DEFAULTEXCLUDES = {
            // Miscellaneous typical temporary files
            "**/*~", "**/#*#", "**/.#*", "**/%*%", "**/._*",
            // CVS
            "**/CVS", "**/CVS/**", "**/.cvsignore",
            // RCS
            "**/RCS", "**/RCS/**",
            // SCCS
            "**/SCCS", "**/SCCS/**",
            // Visual SourceSafe
            "**/vssver.scc",
            // MKS
            "**/project.pj",
            // Subversion
            "**/.svn", "**/.svn/**",
            // Arch
            "**/.arch-ids", "**/.arch-ids/**",
            //Bazaar
            "**/.bzr", "**/.bzr/**",
            //SurroundSCM
            "**/.MySCMServerInfo",
            // Mac
            "**/.DS_Store",
            // Serena Dimensions Version 10
            "**/.metadata", "**/.metadata/**",
            // Mercurial
            "**/.hg", "**/.hgignore", "**/.hg/**",
            // git
            "**/.git", "**/.gitignore", "**/.gitattributes", "**/.git/**",
            // BitKeeper
            "**/BitKeeper", "**/BitKeeper/**", "**/ChangeSet", "**/ChangeSet/**",
            // darcs
            "**/_darcs", "**/_darcs/**", "**/.darcsrepo", "**/.darcsrepo/**", "**/-darcs-backup*", "**/.darcs-temp-mail"};

    public static final String[] DEFAULTEXCLUDES = new String[]{
            "**/*~", "**/#*#", "**/.#*", "**/%*%", "**/._*",
            "**/CVS", "**/CVS/**", "**/.cvsignore",
            "**/RCS", "**/RCS/**",
            "**/SCCS", "**/SCCS/**",
            "**/vssver.scc",
            "**/project.pj",
            "**/.svn", "**/.svn/**",
            "**/.arch-ids", "**/.arch-ids/**",
            "**/.bzr", "**/.bzr/**",
            "**/.MySCMServerInfo",
            "**/.DS_Store",
            "**/.metadata", "**/.metadata/**",
            "**/.hg", "**/.hg/**",
            // git
            "**/.git", "**/.git/**",
            "**/BitKeeper", "**/BitKeeper/**", "**/ChangeSet", "**/ChangeSet/**",
            "**/_darcs", "**/_darcs/**", "**/.darcsrepo", "**/.darcsrepo/**", "**/-darcs-backup*", "**/.darcs-temp-mail"};

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.set(2017,Calendar.SEPTEMBER,1,5,0,0);
        long time = calendar.getTimeInMillis();
        System.out.println(time);
//        calendar.setTimeInMillis(1504233145735L);
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String s = format.format(calendar.getTime());
//        System.out.println(s);
    }
}
