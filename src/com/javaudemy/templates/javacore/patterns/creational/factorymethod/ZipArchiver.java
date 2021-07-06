package com.itbulls.learnit.javacore.patterns.creational.factorymethod;

import java.io.File;

public class ZipArchiver implements Archiver {

    @Override
    public void archive(File directory) {
        System.out.println("Zip Archiver");
    }

}
