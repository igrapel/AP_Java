/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frq2013q1;
import java.util.*;

public class MusicDownloads 
{
private List<DownloadInfo> downloadList;  

public MusicDownloads()
{
    downloadList = new ArrayList<DownloadInfo>();
}

public void addToList(DownloadInfo song)
{
    downloadList.add(song);
}

public DownloadInfo getDownloadInfo(String title)
{
    for(DownloadInfo x : downloadList)
    {
        if(x.getTitle().equalsIgnoreCase(title))
        {
            return x;
        }
    }
    return null;
}

public void updateDownloads(ArrayList<String> list)
{
    for(String x : list)
    {
        DownloadInfo currentSongObj = new DownloadInfo(x);
        if(currentSongObj==null)
        {
           downloadList.add(currentSongObj);
        }
        else
        {
            currentSongObj.incrementTimesDownloaded();
        }
    }
}

 public static void main(String[] args) 
    {
        DownloadInfo s1 = new DownloadInfo("Hey Jude");
        DownloadInfo s2 = new DownloadInfo("Soul Sister");
        DownloadInfo s3 = new DownloadInfo("Aqualung");
        
        MusicDownloads webMusica = new MusicDownloads();
        webMusica.downloadList.add(s1);
        webMusica.downloadList.add(s2);
        webMusica.downloadList.add(s3);
        
        System.out.println(s3.getTitle());
        System.out.println(webMusica.getDownloadInfo("Aqualung"));
    } 
}
