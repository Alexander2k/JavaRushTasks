package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

import static com.javarush.task.task16.task1631.common.ImageTypes.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes type){
        ImageReader imageReader = null;

            if (type == null)
            {
                throw new IllegalArgumentException("Неизвестный тип картинки");
            }
            else if (type == BMP)
            {
                imageReader = new BmpReader();
            }
            else if (type == JPG)
            {
                imageReader = new JpgReader();
            }
            else if (type == PNG)
            {
                imageReader = new PngReader();
            }

            else if ((type != BMP) && (type != JPG) && (type != PNG))
            {
                throw new IllegalArgumentException("Неизвестный тип картинки");
            }


        return imageReader;

    }
}
