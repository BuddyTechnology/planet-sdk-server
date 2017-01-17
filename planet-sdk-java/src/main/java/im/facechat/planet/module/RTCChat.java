package im.facechat.planet.module;

import java.util.List;


public class RTCChat {
	
	public String session;
	public long start;//开始聊天的时间
	public long end;//最后一次聊天的时间
	public boolean finished;//是否已经结束
	public List<String> members;//通话的两个人
	public String nt;//netType类型，2G,3G,4G,wifi
	public String isp;//运营商,netProvider
	public String locs;//lng-lat
	public String ip;
	public long rsb;//remindSendBandwidth,剩余上行带宽
	public long rrb;//remindReceiveBandWidth,剩余下行带宽
	public long sr;//sendRate,发送速度
	public long rr;//receiveRate,接收速度
	public float sl;//sendLoss,发送丢包率
	public float rl;//receiveLoss,接收丢包率
	public int link;//当前用户使用的连接类型host,p2p,relay
	public int quality;//高清，标清，普通

	public String getLocs() {
		return locs;
	}

	public void setLocs(String locs) {
		this.locs = locs;
	}

	public String getNt() {
		return nt;
	}

	public void setNt(String nt) {
		this.nt = nt;
	}

	public String getIsp() {
		return isp;
	}

	public void setIsp(String isp) {
		this.isp = isp;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public long getRsb() {
		return rsb;
	}

	public void setRsb(long rsb) {
		this.rsb = rsb;
	}

	public long getRrb() {
		return rrb;
	}

	public void setRrb(long rrb) {
		this.rrb = rrb;
	}

	public long getSr() {
		return sr;
	}

	public void setSr(long sr) {
		this.sr = sr;
	}

	public long getRr() {
		return rr;
	}

	public void setRr(long rr) {
		this.rr = rr;
	}

	public float getSl() {
		return sl;
	}

	public void setSl(float sl) {
		this.sl = sl;
	}

	public float getRl() {
		return rl;
	}

	public void setRl(float rl) {
		this.rl = rl;
	}

	public int getLink() {
		return link;
	}

	public void setLink(int link) {
		this.link = link;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

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
	
	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	public List<String> getMembers() {
		return members;
	}

	public void setMembers(List<String> members) {
		this.members = members;
	}
	
	
}
