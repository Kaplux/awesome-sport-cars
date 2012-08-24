package fr.mildlyusefulsoftware.awesomesportcars.activity;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.util.Log;
import fr.mildlyusefulsoftware.imageviewer.service.DatabaseHelper;
import fr.mildlyusefulsoftware.imageviewer.service.Picture;

public class ViewPictureActivity extends fr.mildlyusefulsoftware.imageviewer.activity.ViewPictureActivity {

	@Override
	protected String getAdMobId() {
		return "a1500a914d1839b";
	}

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//putNewPictures();
	}
	
	private void putNewPictures(){
		String[] url =new String[]{
				"http://www.arcars.info/model-lamborghini-sports-cars-activities.html/model-lamborghini-sports-cars-activities/",
				"http://1.bp.blogspot.com/-OF-8fq-gA2o/TbO0luKZocI/AAAAAAAADJE/RlOsC83QZP0/s1600/Sport+Cars+17.jpg",
				"http://www.sport-cars.org/site_img/large/1999-Lamborghini-Diablo-GT-2.jpg",
				"http://hybridsportcars.com/wp-content/uploads/2011/01/Sports-Car07.jpg",
				"http://www.thesupercars.org/wp-content/uploads/2008/03/mazda-furai-concept.jpg",
				"http://lordofdesign.com/wp-content/uploads/2010/08/sport-car.jpg",
				"http://2.bp.blogspot.com/-WMM0h-x_bPU/TZwRe1aYQKI/AAAAAAAAB2o/DEmfv8jQfiw/s400/Green-GT-Sport-Cars---Eco-Friendly-Racing-Car-1.jpg",
				"http://4.bp.blogspot.com/_HkbWdsz-H8g/S72bMLIw_cI/AAAAAAAAIHE/6erJ99FcWf4/s1600/Ronn+Motor+Company+Sport+Cars+2.jpg",
				"http://4.bp.blogspot.com/_yAjBlC13QEg/TKQ-Wnp3jBI/AAAAAAAAADU/sE-xSmg8Kto/s1600/SPORT+CAR+WALLPAPER.jpg",
				"http://3.bp.blogspot.com/-n5-y28zk8pk/TWoQO1L3pLI/AAAAAAAAAGA/ghuMe4TuKNg/s1600/dodge-viper-sports-cars.jpg",
				"http://hybridsportcars.com/wp-content/uploads/2011/04/Sport-Cars10.jpg",
				"http://1.bp.blogspot.com/_lTVfb4qUtJk/TE53bf6jb3I/AAAAAAAAAFQ/_5SwHn942h8/s400/2010-Ferrari-Sports-Cars-612-GTO-Concept-Cars-2.jpg",
				"http://www.autocarzine.com/wp-content/uploads/2011/01/Lexus_Sport_Cars_01-1024x683.jpg",
				"http://hybridsportcars.com/wp-content/uploads/2012/03/Pontiac-Sport-Cars3.jpg",
				"http://www.cars-images.com/images/wallpapers-sport-cars.jpg",
				"http://assets.inhabitat.com/wp-content/uploads/venturi_fetish_front.jpg",
				"http://assets.inhabitat.com/wp-content/uploads/c-metisse-06.jpg",
				"http://assets.inhabitat.com/wp-content/uploads/toyota_ft-hs_1_x.jpg",
				"http://assets.inhabitat.com/wp-content/uploads/2006-saab-aero-x-concept-f-side-1280x960.jpg",
				"http://4.bp.blogspot.com/_lTVfb4qUtJk/TK9C-2nnslI/AAAAAAAAAXs/nYRsRnKOHvo/s400/2010-E-Wolf-E-2-Electric-Sport-Cars-2.jpg",
				"http://hybridsportcars.com/wp-content/uploads/2011/04/Sport-Cars09.jpg",
				"http://1.bp.blogspot.com/_lTVfb4qUtJk/TMH3ygn_PuI/AAAAAAAAAhk/8A488lFP9-c/s400/Bentley-Sport-Cars-Bentley-Silver-Wings-Concept-3.jpg",
				"http://4.bp.blogspot.com/-KLw1EfMs8qA/Tt9gM0NpeXI/AAAAAAAABOY/qesJCSMKg_o/s1600/Aston+Martin+sports+car+pics-2.jpg",
				"http://www.cars-images.com/images/0-sport-cars-wallpapers-1024.jpg",
				"http://www.cars-images.com/images/0-wallpapers-sport-cars-1024.jpg",
				"http://www.cars-images.com/images/6-wallpapers-sport-cars-1024.jpg",
				"http://www.cars-images.com/images/sport-cars-wallpapers-1024.jpg",
				"http://www.motorauthority.com/content/thumbs/2/0/2009_fisker_karma_main630-0216-630x360.jpg",
				"http://2.bp.blogspot.com/_lTVfb4qUtJk/TTe1wH3AzuI/AAAAAAAABNY/ChpSMggMa7A/s400/Lancia-Stratos-Sport-Cars-Concept-3.jpg",
				"http://www.interestingmails.com/interestingmails.com/userfilesimage/cars.jpg",
				"http://hybridsportcars.com/wp-content/uploads/2012/01/Toyota-Ft-hs-Hybrid-Sports7.jpg",
				"http://3.bp.blogspot.com/-xy8pqegIpag/TiCCbf0Wp1I/AAAAAAAACiY/Ji2tQMKTAss/s1600/car+wallpapers-1.jpg",
				"http://hybridsportcars.com/wp-content/uploads/2010/12/1288698646sport-cars-images-02.jpg",
				"http://www.gotbroken.com/wp-content/uploads/2009/02/2008-bmw-320i-m-sport-convertible-front-angle-view-588x378.jpg",
				"http://media8.onsugar.com/files/2011/09/37/5/1893/18931368/898653b3e5348277_hybrid_sports_cars_B.jpg",
				"http://media28.onsugar.com/files/2011/09/37/5/1893/18931368/8ed7d85f6171ad13_hybrid_sports_cars_A.jpg",
				"http://funrocking.com/wp-content/uploads/2010/06/sports-car18.jpg",
				"http://i.dailymail.co.uk/i/pix/2009/07/10/article-0-0531E20F000005DC-727_468x328.jpg",
				"http://xaxor.com/images/other/11140/sport_cars_frankfurt_06.jpg",
				"http://www.helluvit.co.uk/UserFiles/Image/Ford%20Mustang%20at%20Goodwood%20WEB.jpg",
				"http://www.autoinfection.com/wp-content/uploads/2009/12/2010-Aston-Martin-V8-Vantage.jpg",
				"http://autocarspeed.com/wp-content/uploads/2010/12/2010-Lamborghini-Gallardo-LP560-4-Spyder2.jpg",
				"http://www.supercars.dk/cars/supercars/free-wallpapers-sports-car.jpg",
				"http://nissan-cube.poloyee-sporty.com/images/nissan-sports-car-1.jpg",
				"http://inspirationgreen.com/assets/images/Cars/Sport%20Cars/porsche%20hybrid.jpg",
				"http://topicden.com/wp-content/uploads/2011/01/imagesofsportscars.jpg",
				"http://garcya.us/wp-content/uploads/2009/05/super-sport-car-1024x529.png",
				"https://lh3.googleusercontent.com/_W8liNQJdPPY/TW2cXMYdgsI/AAAAAAAAA1U/7nTa0dQmjfE/101767_pengujian-mobil-mobil-sport-mewah.jpg",
				"http://latest-cars.com/wp-content/uploads/2012/01/2012-Bugatti-Veyron-Grand-Sport-Super-Sport1.jpg",
				"http://www.ridelust.com/wp-content/uploads/2011/01/2010-Toyota-FT-86G-Sports-Concept.jpg",
				"http://www.strangecosmos.com/images/content/175851.jpg",
				"http://wallpapers.boolsite.net/srv36/Images/Wallpapers/Vehicules/Porsche/Porsche07.jpg",
				"http://photos.stage-pilotage.net/conduire-une-voiture/porsche-997-gt3-rs--13-1.jpg",
				"http://www.voiture-miniature.com/images_miniatures/porsche_panamera_turbo_noire_img0880h",
				"http://www.blogtendances.com/wp-content/uploads/2009/04/porsche-panamera.jpg"
				
				
				
		};
		int i=40;
		List<Picture> pictures=new ArrayList<Picture>();
		for (int j=0;j<url.length;j++){
			try {
				Log.i("awesomesportcars",url[j]);
				Picture p = new Picture(j+i, url[j],Picture.getPictureThumbnail(url[j]));
				pictures.add(p);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		DatabaseHelper.connect(this).putPictures(pictures);
	}


}
