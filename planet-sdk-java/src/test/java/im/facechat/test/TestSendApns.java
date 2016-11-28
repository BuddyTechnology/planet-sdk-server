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
			System.out.println(PlanetSDK.sendApns("74281bf4333d-1a2857c6-9fc9-4641-9e05-5ab5d0a76af3",apns));
		}catch(PlanetException e){
			e.printStackTrace();
		}
	}
}
