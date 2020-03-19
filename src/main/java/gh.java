import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.management.Attribute;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class gh {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException, DocumentException {
        //拿到要解析的xml文件
        File file = new File("src/dg.xml");
        //建立DocumentBuilderFactor，用于获得DocumentBuilder对象：
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        //2.建立DocumentBuidler：
        DocumentBuilder builder = factory.newDocumentBuilder();
        //3.建立Document对象，获取树的入口：
        Document doc = builder.parse(file);
        //4.建立NodeList：
        NodeList node = doc.getElementsByTagName("id");
        //5.进行xml信息获取
        for(int i=0;i<node.getLength();i++) {
            System.out.println(node.item(i).getFirstChild().getNodeValue());
        }

        }
    }

