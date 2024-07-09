public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("Comienzo la conversion de video");
        VideoFile file = new VideoFile("fichero.mp4");
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinarionCodec;

        if (format.equals("mp4")) {
            destinarionCodec = new OggCompressionCodec();
        } else {
            destinarionCodec = new MPEG4CompressionCodec();
        }

        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinarionCodec);

        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("Ya he terminado");
        return result;
    }
}
