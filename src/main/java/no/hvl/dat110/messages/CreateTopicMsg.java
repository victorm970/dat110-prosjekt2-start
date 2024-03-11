package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {
	
	private String topic;
	// message sent from client to create topic on the broker

    public CreateTopicMsg(String user, String topic) {
    	super(MessageType.CREATETOPIC, user);
    	this.topic = topic;
    }

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	@Override
	public String toString() {
		return "Message [type=" + super.getType() + ", user=" + super.getUser() + ", topic=" + topic + "]";
	};

}
