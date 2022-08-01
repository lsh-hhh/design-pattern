package struction_facade_partner.code;

import struction_facade_partner.code.facade.VideoConversionFacade;

import java.io.File;

public class FacadeClient {

    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
        System.out.println(mp4Video);
    }
}
