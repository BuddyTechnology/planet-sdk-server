package im.facechat.test;

import im.facechat.planet.exp.PlanetException;
import im.facechat.planet.sdk.PlanetSDK;

public class TestSendApns {

	public static void main(String[] args) {
		try{
			System.out.println(PlanetSDK.sendIM("dbc3c0983b58f6ba-f367b48c-845f-4602-b275-afbac81ce6a0","ni hao",0));
		}catch(PlanetException e){
			e.printStackTrace();
		}
	}
}
