import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.management.Attribute;
import javax.xml.parsers.*;
import java.io.*;
import java.util.List;

public class doms {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, JDOMException {
        //1.创建DocumentBuilderFactory对象
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        //2.创建DocumentBuilder对象
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document d = builder.parse("src/main/resources/demo.xml");
            NodeList sList = d.getElementsByTagName("student");
           // node(sList);
        } catch (Exception e) {
            e.printStackTrace();
        }

//        //1.或去SAXParserFactory实例
//        SAXParserFactory factorys = SAXParserFactory.newInstance();
//        //2.获取SAXparser实例
//        SAXParser saxParser = factorys.newSAXParser();
//        //创建Handel对象
//        SAXDemoHandel handel = new SAXDemoHandel();
//        saxParser.parse("src/DOMS.xml",handel);
//
//
//        //1.创建SAXBuilder对象
//        SAXBuilder saxBuilder = new SAXBuilder();
//        //2.创建输入流
//        InputStream is = new FileInputStream(new File("src/DOMS.xml"));
//        //3.将输入流加载到build中
//        Document document = (Document) saxBuilder.build(is);
//        //4.获取根节点
//        Element rootElement = document.getRootElement();
//        //5.获取子节点
//        List<Element> children = rootElement.getChildren();
//        for (Element child : children) {
//            System.out.println("通过rollno获取属性值:"+child.getAttribute("rollno"));
//            List<Attribute> attributes = (List<Attribute>) child.getAttributes();
//            //打印属性
//            for (Attribute attr : attributes) {
//                System.out.println(attr.getName()+":"+attr.getValue());
//            }
//            List<Element> childrenList = child.getChildren();
//            System.out.println("======获取子节点-start======");
//            for (Element o : childrenList) {
//                System.out.println("节点名:"+o.getName()+"---"+"节点值:"+o.getValue());
//            }
//            System.out.println("======获取子节点-end======");
//        }
//    }
//    public static void node(NodeList list){
//        for (int i = 0; i <list.getLength() ; i++) {
//            Node node = list.item(i);
//            NodeList childNodes = node.getChildNodes();
//            for (int j = 0; j <childNodes.getLength() ; j++) {
//                if (childNodes.item(j).getNodeType()==Node.ELEMENT_NODE) {
//                    System.out.print(childNodes.item(j).getNodeName() + ":");
//                    System.out.println(childNodes.item(j).getFirstChild().getNodeValue());
//                }
//            }
//        }
    }
}


