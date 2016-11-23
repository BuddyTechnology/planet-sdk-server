package im.facechat.test;

import im.facechat.planet.exp.PlanetException;
import im.facechat.planet.sdk.PlanetSDK;

public class TestSendMessage {

	public static void main(String[] args) {
		try{
			System.out.println(PlanetSDK.sendIM("dbc3c0983b58f6ba-61d16dd5-d030-4d9f-b05f-9b68f60a9bac","ni hao"));
		}catch(PlanetException e){
			e.printStackTrace();
		}
	}
}
