package im.facechat.planet.msg;

import java.util.Map;

public class Apns {
	
	private String toMember;
	private int incrBadges = 0;
	private String content;
	private String sound;
	private String title;
	private boolean backgroud;
	private Map<String,String> params;//include 'keywords'
	private String logo;
	private boolean awake;
	
	public Apns(){}
	
	public Apns(String content,Map<String,String> params){
		this.content = content;
		this.params = params;
	}

	public String getToMember() {
		return toMember;
	}

	public void setToMember(String toMember) {
		this.toMember = toMember;
	}

	public int getIncrBadges() {
		return incrBadges;
	}

	public void setIncrBadges(int incrBadges) {
		this.incrBadges = incrBadges;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isBackgroud() {
		return backgroud;
	}

	public void setBackgroud(boolean backgroud) {
		this.backgroud = backgroud;
	}

	public Map<String, String> getParams() {
		return params;
	}

	public void setParams(Map<String, String> params) {
		this.params = params;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public boolean isAwake() {
		return awake;
	}

	public void setAwake(boolean awake) {
		this.awake = awake;
	}	
}
