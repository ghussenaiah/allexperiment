package com.concretepage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
public class FTLBlog {
      public static void main(String[] args) {
         try {
            //Instantiate Configuration class  
            Configuration cfg = new Configuration();
          
            //Create Data Model
            Map<String, Object> map = new HashMap<>();
            map.put("blogTitle", "Freemarker Template Demo");
            map.put("message", "Getting started with Freemarker.<br/>Find a simple Freemarker demo.");
            List<URL> references = new ArrayList<>();
            references.add(new URL("http://url1.com","URL One"));
            references.add(new URL("http://url2.com","URL Two"));
            references.add(new URL("http://url3.com","URL Three"));
            map.put("references", references);
            //Instantiate template
            Template template = cfg.getTemplate("test/helloworld.ftl");
            //Console output
            Writer console = new OutputStreamWriter(System.out);
            template.process(map, console);
            console.flush();
            // File output
            Writer file = new FileWriter (new File("D:/blog-template-output.html"));
            template.process(map, file);
            file.flush();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
      }
} 