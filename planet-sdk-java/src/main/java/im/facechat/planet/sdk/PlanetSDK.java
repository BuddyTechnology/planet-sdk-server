package im.facechat.planet.sdk;

import im.facechat.planet.cons.IReturnCode;
import im.facechat.planet.cons.PlanetConfig;
import im.facechat.planet.core.HttpCore;
import im.facechat.planet.core.SignUtil;
import im.facechat.planet.exp.PlanetException;
import im.facechat.planet.module.RTCChat;
import im.facechat.planet.module.RoomPolicy;
import im.facechat.planet.msg.Apns;
import im.facechat.planet.tool.RequestBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public final class PlanetSDK {

	public static List<RTCChat> getChats(String[] sessions) throws PlanetException{
		Map<String,String> params = new HashMap<String,String>();
		params.put("sessions",JSON.toJSONString(sessions));
		String result = signRequest(params,"/api/rtc/get_chats");
		return JSON.parseArray(result,RTCChat.class);
	}
	
	public static String createRoom() throws PlanetException{
		return createRoom(new RoomPolicy());
	}
	
	public static String createRoom(RoomPolicy recommendPolicy) throws PlanetException{
		Map<String,String> params = new HashMap<String,String>();
		params.put("quality",""+recommendPolicy.getQuality());
		if(recommendPolicy.getMembers() != null){
			params.put("members",JSON.toJSONString(recommendPolicy.getMembers()));
		}
		params.put("disableP2P",""+recommendPolicy.isDisableP2P());
		return signRequest(params,"/api/rtc/add_room");
	}

	private static String signRequest(Map<String, String> params,String path) throws PlanetException {
		params.put("ctime",""+System.currentTimeMillis());
		params.put("appId",PlanetConfig.appId);
		params.put("sign_type",PlanetConfig.signType);
		String link = RequestBuilder.createLinkString(params);
		try{
			params.put("sign",SignUtil.sign(PlanetConfig.signType,link));
		}catch(Exception e){
			throw new PlanetException(IReturnCode.PLANET_INVALID_SIGN,"error signature!",e);
		}
		String base = formatBaseURL(PlanetConfig.url);
		
		String json = HttpCore.post(base + path,params,"planet.sdk.client");
		if(json == null || json.equals("")){
			throw new PlanetException(IReturnCode.PLANET_NETWORK_ERROR,"network error!");
		}
		JSONObject jsonObj = JSON.parseObject(json);
		if(jsonObj.getIntValue("code") != 0){
			throw new PlanetException(jsonObj.getIntValue("code"),jsonObj.getString("msg"));
		}
		return jsonObj.getString("result");
	}
	
	private static String formatBaseURL(String planetURL) {
		if(planetURL.endsWith("/")){
			planetURL = planetURL.substring(0,planetURL.length() - 1);
		}
		return planetURL;
	}

	public static boolean sendIM(String[] members,String message,int expires) throws PlanetException{
		Map<String,String> params = new HashMap<String,String>();
		params.put("members",JSON.toJSONString(members));
		params.put("message",message);
		params.put("expires",""+expires);
		String result = signRequest(params,"/api/chat/sendIM");
		return Boolean.parseBoolean(result);
	}
	
	public static boolean sendIM(String members,String message,int expires) throws PlanetException{
		return sendIM(new String[]{members},message,expires);
	}
	
	public static boolean sendIMWithApns(String[] members,String message,Apns apns,int expires) throws PlanetException{
		Map<String,String> params = new HashMap<String,String>();
		params.put("members",JSON.toJSONString(members));
		params.put("message",message);
		params.put("apns",JSON.toJSONString(apns));
		params.put("expires",""+expires);
		String result = signRequest(params,"/api/chat/sendIMWithApns");
		return Boolean.parseBoolean(result);
	}
	
	public static boolean sendIMWithApns(String member,String message,Apns apns,int expires) throws PlanetException{
		return sendIMWithApns(new String[]{member},message,apns,expires);
	}
	
	public static boolean sendApns(String[] members,Apns apns) throws PlanetException{
		Map<String,String> params = new HashMap<String,String>();
		params.put("members",JSON.toJSONString(members));
		params.put("apns",JSON.toJSONString(apns));
		String result = signRequest(params,"/api/chat/sendApns");
		return Boolean.parseBoolean(result);
	}
	
	public static boolean sendApns(String member,Apns apns) throws PlanetException{
		return sendApns(new String[]{member},apns);
	}
	
	public static boolean sendApnsIfMessageOffline(String[] members,String message,Apns apns,int expires) throws PlanetException{
		Map<String,String> params = new HashMap<String,String>();
		params.put("members",JSON.toJSONString(members));
		params.put("message",message);
		params.put("apns",JSON.toJSONString(apns));
		params.put("expires",""+expires);
		String result = signRequest(params,"/api/chat/sendApnsIfMessageOffline");
		return Boolean.parseBoolean(result);
	}
	
	public static boolean sendApnsIfMessageOffline(String member,String message,Apns apns,int expires) throws PlanetException{
		return sendApnsIfMessageOffline(new String[]{member},message,apns,expires);
	}
}
