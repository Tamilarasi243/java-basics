import java.util.*;
class media{
    public void login(){
        System.out.println("Logging in done");
    }
    public void logout(){
        System.out.println("Logging out done");
    }
}
class apps extends media{
    public void watsapp(String name){
        if(name.equals("audio")){
            System.out.println("Audio notes");
        }
        else if(name.equals("video")){
            System.out.println("Video notes");
        }
    }
    public void instagram(String name){
        if(name.equals("reels")){
            System.out.println("Reels choosed in instagram");
        }
        else if(name.equals("post")){
            System.out.println("posts choosed in instagram");
        }
    }
    public void facebook(String name){
        if(name.equals("like")){
            System.out.println("Liked the posts");
        }
        else if(name.equals("dislike")){
            System.out.println("disliked the posts");
        }
    }
}
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Choose one media ..... watsapp or facebook or instagram");
        Scanner sc=new Scanner(System.in);
        while(true){
        String apps=sc.nextLine();
        media m=new apps();
        if(apps.equals("watsapp")){
            
            System.out.println("Enter login");
            String log=sc.nextLine();
            m.login();
            System.out.println("Enter audio or video");
              String name=sc.nextLine();
              ((apps)m).watsapp(name);
              while(true){
              System.out.println("need to logout or further files to open (audio or video or logout)");
              String out=sc.nextLine();
              if(out.equals("logout")){
                  m.logout();
                  break;
              }
              else{
                  ((apps)m).watsapp(out);
              }
              }
        }
        else if(apps.equals("instagram")){
            System.out.println("Enter login");
            String log=sc.nextLine();
            m.login();
            System.out.println("Enter post or reels");
              String name=sc.nextLine();
              ((apps)m).instagram(name);
              while(true){
              System.out.println("need to logout or further files to open (reels or post or logout)");
              String out=sc.nextLine();
              if(out.equals("logout")){
                  m.logout();
                  break;
              }
              else{
                  ((apps)m).instagram(out);
              }
              }
        }
        else if(apps.equals("facebook")){
            System.out.println("Enter login");
            String log=sc.nextLine();
            m.login();
            System.out.println("Enter like or dislike");
              String name=sc.nextLine();
              ((apps)m).facebook(name);
              while(true){
              System.out.println("need to logout or further details to open (like or dislike or logout)");
              String out=sc.nextLine();
              if(out.equals("logout")){
                  m.logout();
                  break;
              }
              else{
                  ((apps)m).facebook(out);
              }
              }
        }
        else{
            System.out.println("entered wrong name");
        }
        System.out.println("want to open other apps type yes or no");
        String again=sc.nextLine();
        if(again.equals("yes")){
            System.out.println("want to open other apps(watsapp or facebook or instagram)");
        }
        else{
            System.out.println("End...... Thank you......");
            break;
        }
        }

    }
