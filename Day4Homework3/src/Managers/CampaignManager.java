package Managers;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {
    public void add(Campaign campaign) {
        System.out.println("Campaign Added: "+ campaign.toString());
    }

    public void update(Campaign campaign) {
        System.out.println("Campaign Updated: "+ campaign.toString());
    }

    public void delete(Campaign campaign) {
        System.out.println("Campaign Deleted: "+ campaign.toString());
    }
}
