package ex24;

public class PictureTest {

	public static void main(String[] args) {
		Dslr dslr = new Dslr();
		FilmCamera filmcamera = new FilmCamera();
		
		dslr.takePicture();
		filmcamera.takePicture();
		
		dslr.extraPicture();
		filmcamera.smallPicture();
	}

}
