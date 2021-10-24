public class TV
{
    int channel;
    int volumelevel;
    boolean on;
    public TV()
    {
        channel = 1;
        volumelevel = 1;
        on = true;
        
    }
    public void turnOn()
    {
        on = true;
    }
    public void turnOff()
    {
        on = false;
    }
    public void setChannel(int newChannel)
    {
        if (newChannel <= 120 && newChannel >= 1) 
        {
            channel = newChannel;
        }
        else
        {
            System.out.println("This channel is not found");
        }
    }
    public void setVolume(int newVolumeLevel)
    {
        if (newVolumeLevel <=7 && newVolumeLevel >= 1) 
        {
        volumelevel = newVolumeLevel;            
        }
        else
        {
            System.out.println("Error");
        }
    }
    public void channelUp()
    {
        if (channel != 120) 
        {
            channel++;            
        }
    }
    public void channelDown()
    {
        if (channel != 1) 
        {
        channel--;            
        }
    }
    public void volumeUp()
    {
        if(volumelevel != 7)
        {
        volumelevel++;
        }
    }
    public void volumeDown()
    {
        if(volumelevel != 1)
        {
        volumelevel--;
        }    
    }
}
