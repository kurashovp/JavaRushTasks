package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageType) {
        if (imageType == null) throw new IllegalArgumentException();
        ImageReader reader;
        switch (imageType) {
            case BMP:
                reader = new BmpReader();
                break;
            case JPG:
                reader = new JpgReader();
                break;
            case PNG:
                reader = new PngReader();
                break;
            default:
                throw new IllegalArgumentException();
        }
        return reader;
    }
}
