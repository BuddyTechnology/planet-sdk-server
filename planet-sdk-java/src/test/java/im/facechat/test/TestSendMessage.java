package im.facechat.test;

import im.facechat.planet.exp.PlanetException;
import im.facechat.planet.sdk.PlanetSDK;

public class TestSendMessage {

	public static void main(String[] args) {
		try{
			System.out.println(PlanetSDK.sendIM("dbc3c0983b58f6ba-8976cca0-c61e-4f66-8ec7-1828b9a85a79","ni hao"));
		}catch(PlanetException e){
			e.printStackTrace();
		}
	}
}
