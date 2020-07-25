package com.test;

import java.util.Optional;

public class optionalTest {

    public static void main(String[] args) {
        Optional<String> gender = Optional.of("MALE");
        String answer1 = "Yes";
        String answer2 = null;

        System.out.println("Non-Empty Optional:" + gender);
        System.out.println("Non-Empty Optional: Gender value : " + gender.get());
        System.out.println("Empty Optional: " + Optional.empty());

        System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
        System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(answer2));

        // java.lang.NullPointerException
        //System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(answer2));

        System.out.println(getMobileScreenWidthCorrectOptional(Optional.ofNullable(null)));
        System.out.println(getMobileScreenWidth(null));
    }



    public static int getMobileScreenWidth(Mobile mobile){

        if(mobile != null){
            if(mobile.getDisplayFeatures().isPresent()){
                DisplayFeatures dfeatures = mobile.getDisplayFeatures().get();
                Optional<ScreenResolution> resolution = dfeatures.getResolution();

                if(resolution.isPresent()){
                    return resolution.get().getWidth();
                }
            }
        }
        return 0;
    }

    public static Integer getMobileScreenWidthCorrectOptional(Optional<Mobile> mobile) {
        return mobile.flatMap(Mobile::getDisplayFeatures)
                .flatMap(DisplayFeatures::getResolution)
                .map(ScreenResolution::getWidth)
                .orElse(0);

    }
}


class Mobile {

    private Optional<DisplayFeatures> displayFeatures;

    public Mobile(Optional<DisplayFeatures> displayFeatures) {
        this.displayFeatures = displayFeatures;
    }

    public Optional<DisplayFeatures> getDisplayFeatures() {
        return displayFeatures;
    }

}


class DisplayFeatures {

    private Optional<ScreenResolution> resolution;

    public DisplayFeatures(Optional<ScreenResolution> resolution) {
        this.resolution = resolution;
    }

    public Optional<ScreenResolution> getResolution() {
        return resolution;
    }

}

class ScreenResolution {

    private int width;

    public ScreenResolution(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}
