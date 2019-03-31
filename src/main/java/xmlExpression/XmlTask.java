package xmlExpression;

import org.apache.log4j.Logger;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class XmlTask {
    private static final Logger LOGGER = Logger.getLogger(XmlTask.class);

    public void createStructer() {
        List<Map<List<Set<Integer>>, String>> list = new ArrayList<>();
        Integer value = 10;
        HashSet<Integer> set = new HashSet<>(value);
        List<Set<Integer>> list1 = new ArrayList<>();
        list1.add(set);
        Map<List<Set<Integer>>, String> map = new HashMap<>();
        map.put(list1, "Task");
        list.add(map);
    }

    public void converteToXml(List list) {
        try (FileOutputStream xmlFile = new FileOutputStream("listStructure.xml")) {
            XMLEncoder xmlEncoder = new XMLEncoder(xmlFile);
            xmlEncoder.writeObject(list);
        } catch (IOException e) {
            LOGGER.info(e.getMessage());
        }
    }
}
