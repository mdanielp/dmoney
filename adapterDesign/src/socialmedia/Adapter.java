/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialmedia;

/**
 *
 * @author dmoney
 */
public class Adapter extends YouTubeVideo implements SocialMediaEntry 
{
    //vars
    private YouTubeVideo youTube;
    
    //methods
    public Adapter(String author, String title, String description) 
    {
        youTube = new YouTubeVideo (author,title,description);
    }

    @Override
    public String getUser() 
    {
        return  youTube.getAuthor();
    }

    @Override
    public String getPostText() 
    {
        return (youTube.getTitle() + " "  + youTube.getDescription());
    }

}
