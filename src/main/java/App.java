import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App{
    public static void main(String[] args){
        staticFileLocation("/public");
        String layout = "templates/layout.vtl";

        ProcessBuilder process = new ProcessBuilder();
        Integer port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 4567;
        }
    
       setPort(port);

        get("/", (request, respond) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/index.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        // post("/login", (request, response) -> {
        //     Map<String, Object> model = new HashMap<String, Object>();
        //     String username = request.queryParams("username");
        //     String password = request.queryParams("password");
        //     Login newLogin = new Login(username,password);
        //     newLogin.save();
        //     model.put("template", "templates/homepage.vtl");
        //     return new ModelAndView(model, layout);
        //   }, new VelocityTemplateEngine());

        get("/signup", (request, respond) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/signup.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/homepage", (request, respond) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/homepage.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/contacts", (request, respond) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/contacts.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/about", (request, respond) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/about.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());
    }
}