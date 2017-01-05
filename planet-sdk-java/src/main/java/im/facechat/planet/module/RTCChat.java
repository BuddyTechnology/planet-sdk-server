package im.facechat.planet.module;

import java.util.List;


public class RTCChat {
	
	public String session;
	
	public long start;//开始聊天的时间
	
	public long end;//最后一次聊天的时间
	
	public boolean finished;//是否已经结束
	
	public List<String> members;//通话的两个人

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
