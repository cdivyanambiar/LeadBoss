package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 */
@Document
public class AdditionalLeadDetails
{
    private LeadPriority leadPriority;
    private LeadStatus leadStatus;
    private LeadOwner leadOwner;

    public AdditionalLeadDetails(LeadPriority leadPriority, LeadStatus leadStatus, LeadOwner leadOwner)
    {
        super();
        this.leadPriority = leadPriority;
        this.leadStatus = leadStatus;
        this.leadOwner = leadOwner;
    }

    public LeadPriority getLeadPriority()
    {
        return leadPriority;
    }

    public void setLeadPriority(LeadPriority leadPriority)
    {
        this.leadPriority = leadPriority;
    }

    public LeadStatus getLeadStatus()
    {
        return leadStatus;
    }

    public void setLeadStatus(LeadStatus leadStatus)
    {
        this.leadStatus = leadStatus;
    }

    public LeadOwner getLeadOwner()
    {
        return leadOwner;
    }

    public void setLeadOwner(LeadOwner leadOwner)
    {
        this.leadOwner = leadOwner;
    }

}
