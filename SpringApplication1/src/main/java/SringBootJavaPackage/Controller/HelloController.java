package SringBootJavaPackage.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/hello")
	public List<Topic> getAllTopics() {
	return topicService.getAllTopics();
    }
	
	@RequestMapping("/hello/{pos}")
	public Topic getTopic(@PathVariable String pos) {
		return topicService.getTopics(pos);
	}
	
	@RequestMapping(method=RequestMethod.POST, value ="/hello")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value ="/hello/{pos}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable String pos) {
		topicService.updateTopic(pos, topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value ="/hello/{pos}")
	public void deleteTopic(@PathVariable String pos) {
		topicService.deleteTopic(pos);
		
	}
}
