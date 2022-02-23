package com.cydeo;

import com.cydeo.config.ProjectConfig;
import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {

        Comment comment=new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(ProjectConfig.class);

//        CommentService commentService01=applicationContext.getBean(CommentService.class);
//        CommentService commentService02=applicationContext.getBean(CommentService.class);
//
//        System.out.println("commentService01 = " + commentService01);
//        System.out.println("commentService02 = " + commentService02);
//
//        System.out.println(commentService01==commentService02);
//-------------------------------------------------------------------------------

    }


}
