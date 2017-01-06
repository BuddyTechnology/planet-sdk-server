package im.facechat.planet.module;

import java.util.List;


public class RTCChat {
	
	public String session;
	
	public long start;//开始聊天的时间
	
	public long end;//最后一次聊天的时间
	
	public boolean hadCalled;//是否已经结束
	
	public List<String> members;//通话的两个人
	
	public String nt;//netType类型，2G,3G,4G,wifi
	public String isp;//运营商,netProvider
	public double[] locs;//lng,lat
	public String ip;
	public long rsb;//remindSendBandwidth,剩余上行带宽
	public long rrb;//remindReceiveBandWidth,剩余下行带宽
	public long sr;//sendRate,发送速度
	public long rr;//receiveRate,接收速度
	public float sl;//sendLoss,发送丢包率
	public float rl;//receiveLoss,接收丢包率
	public int link;//当前用户使用的连接类型host,p2p,relay
	public int quality;//高清，标清，普通

	public long getStart() {
		return start;
	}

	public void setStart(long start) {
		this.start = start;
	}

	public long getEnd() {
		return end;
	}

	public void setEnd(long end) {
		this.end = end;
	}
	
	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public boolean isHadCalled() {
		return hadCalled;
	}

	public void setHadCalled(boolean hadCalled) {
		this.hadCalled = hadCalled;
	}

	public List<String> getMembers() {
		return members;
	}

	public void setMembers(List<String> members) {
		this.members = members;
	}
	
	
}
