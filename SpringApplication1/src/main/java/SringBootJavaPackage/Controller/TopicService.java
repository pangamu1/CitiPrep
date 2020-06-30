package SringBootJavaPackage.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Rashford",10,"Forward"),
			new Topic("Martial",9,"Forward"),
			new Topic("Maguire",5,"Defence"),
			new Topic("Pogba",6,"Midfield")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopics(String pos) {
		return topics.stream().filter(x -> x.getPos().contentEquals(pos)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);		
	}

	public void updateTopic(String pos, Topic topic) {
		for (int i=0;i<topics.size();i++) {
			Topic t = topics.get(i);
			if(t.getPos().equals(pos)) {
				topics.set(i, topic);
			return;
			}
		}
	}

	public void deleteTopic(String pos) {
		topics.removeIf(x -> x.getPos().equals(pos));
	}
	
	

}
