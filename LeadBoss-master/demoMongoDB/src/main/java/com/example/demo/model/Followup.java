package com.example.demo.model;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Followup
{
    private FollowupMedium followupMedium;
    private Date date;
    private String time;

    public Followup(FollowupMedium followupMedium, Date date, String time)
    {
        super();
        this.followupMedium = followupMedium;
        this.date = date;
        this.time = time;
    }

    public FollowupMedium getFollowupMedium()
    {
        return followupMedium;
    }

    public void setFollowupMedium(FollowupMedium followupMedium)
    {
        this.followupMedium = followupMedium;
    }

    public Date getDate()
    {
        return this.date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public String getTime()
    {
        return time;
    }

    public void setTime(String time)
    {
        this.time = time;
    }

}
