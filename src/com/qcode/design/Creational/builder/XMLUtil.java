package com.qcode.design.Creational.builder;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * xml工具类
 * 通过读取XML反射获取实体类
 * Created by jiaqi,zhang on 2017/9/5.
 */
class XMLUtil
{
    //该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
    public  static Object getBean()
    {
        try
        {
            //创建文档对象
            DocumentBuilderFactory  dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder  builder = dFactory.newDocumentBuilder();
            Document  doc;
            //D:\gitRepositories\designModel\com\qcode\design\Creational\builder\config\config.xml
            File directory = new File("");//参数为空
            doc  = builder.parse(directory.getCanonicalPath()+"/src/com/qcode/design/Creational/builder/config/config.xml");

            //获取包含类名的文本节点
            NodeList  nl = doc.getElementsByTagName("className");
            Node  classNode=nl.item(0).getFirstChild();
            String  cName=classNode.getNodeValue();

            //通过类名生成实例对象并将其返回
            Class c=Class.forName(cName);
            Object obj=c.newInstance();
            return obj;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}