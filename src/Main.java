public class Main {
    public static void main(String[] args) {

        VideoConversionFacade conversor = new VideoConversionFacade();
        conversor.convertVideo("fichero.ogg", "fichero.mp4");
    }
}