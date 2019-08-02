package xml;
/*
 ===============================================================
 This program uses java API JDOM2 to give xml file as a output.
 JDOM web site at ===> http://jdom.org/
 -------------------------------------------------------------
 OUTPUT:
 
<?xml version="1.0" encoding="UTF-8"?>
<books>
	<book>
	<Name Author="siva">java program</Name>
	<Category>programming</Category>
	<price>250</price>
        </book>
	
	
	<book>
        <Name Author="prakash">Stotic way</Name>
	<price>500</price>
	<Category>philosophy</Category>
	</book>
</books>

 
 
 ===============================================================
 */







import java.io.IOException;
import org.jdom2.*;
import org.jdom2.output.*;

public class xmlapp {

	public static void main(String[] args) throws IOException {
		Element root =new Element("books");
		Document doc = new Document(root);
		
		
		
		Element book = new Element("book");
		Element name = new Element("Name");
		name.setAttribute("Author", "siva");
		name.addContent("java program");
		Element price = new Element("price");
		price.addContent("250");
		Element cat = new Element("Category");
		cat.addContent("programming");
		root.addContent(book);
		book.addContent(name);
		book.addContent(cat);
	        book.addContent(price);
	    
	        Element book2 =new Element("book");
	        Element name2 =new Element("Name");
	        name2.setAttribute("Author","prakash");
	        name2.addContent("Stotic way");
	        Element price2 = new Element("price");
	        price2.addContent("500"); 
	        Element cat2 = new Element("Category");
	        cat2.addContent("philosophy");
	        root.addContent(book2);
	        book2.addContent(name2);
	        book2.addContent(price2);
	        book2.addContent(cat2);
	    
	    
	    
	 
	    
		XMLOutputter out = new XMLOutputter();
		out.output(doc,System.out);
		
		
		

	}

}
