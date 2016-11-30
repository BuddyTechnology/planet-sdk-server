package im.facechat.test;

import im.facechat.planet.cons.PlanetConfig;
import im.facechat.planet.exp.PlanetException;
import im.facechat.planet.msg.Apns;
import im.facechat.planet.sdk.PlanetSDK;

public class TestSendApns {

	public static void main(String[] args) {
		try{
			PlanetConfig.appId = "582e75b7b80baa67261354e9";
			PlanetConfig.appToken = "3d922c108c521a6605969653528ca7ca";
			
			
			Apns apns = new Apns();
			apns.setAwake(true);
			apns.setBackgroud(true);
			apns.setContent("Hello");
			apns.setTitle("Tiki-马甲");
			apns.setIncrBadges(1);
//			66fd89018de2-2c7e38ef-33d4-4e8b-a6a2-1fbd7a369643
//			66fd89018de2-3fdde76f-b325-4f2c-8826-ab6e9a129970
			System.out.println(PlanetSDK.sendApns("66fd89018de2-5244b88c-317d-48fe-b2e7-0927c969f808",apns));
		}catch(PlanetException e){
			e.printStackTrace();
		}
	}
}
