package struction_facade_pattern.code;

import struction_facade_pattern.code.facade.VideoConversionFacade;

import java.io.File;

public class FacadeClient {

    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
        System.out.println(mp4Video);
    }
}
