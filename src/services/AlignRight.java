package services;

import models.AlignStrategy;

public class AlignRight implements AlignStrategy {
    @Override
    public void render(String text) {
        System.out.printf("### %s #\n",text);
    }
}