/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.teste;


import com.sun.xml.internal.txw2.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


/**
 *
 * @author 01291187294
 */
public class Sistema {
    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = fabrica.newDocumentBuilder();
    org.w3c.dom.Document document =  builder.parse("src/vendas.xml");
    NodeList formasDePagamento = document.getElementsByTagName("formasDePagamento");
        Element fdp = (Element) formasDePagamento.item(0);
    String formaDePagamento = fdp.getTextContent();
    System.out.print(formaDePagamento);
    }
  
}
    
