package im.facechat.test;

import im.facechat.planet.cons.PlanetConfig;
import im.facechat.planet.exp.PlanetException;
import im.facechat.planet.msg.Apns;
import im.facechat.planet.sdk.PlanetSDK;

public class TestSendMessage {

	public static void main(String[] args) {
		try{
			PlanetConfig.appId = "";
			PlanetConfig.appToken = "";
			Apns apns = new Apns();
			apns.setAwake(true);
			apns.setBackgroud(true);
			apns.setContent("Hello");
			apns.setTitle("Tiki-马甲");
			apns.setIncrBadges(1);
			
			System.out.println(PlanetSDK.sendApns("", apns));
		}catch(PlanetException e){
			e.printStackTrace();
		}
	}
}
