package ir.mci.cdrmanagertesti.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import ir.mci.cdrmanagertesti.Content;
import ir.mci.cdrmanagertesti.Mt;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;


@Data
@NoArgsConstructor

public class CdrRecordDtoMap {


    private Mt mt;

    private String IMSI;

    private String MSISDN;

    private String SubscriberType;

    private String CustomerSegmentID;
    private String CustomerSegmentName;

    private String TransactionID;

    private String CorrelationID;

    private String TransactionTime;

    private String ServiceID;

    private String ServiceKey;

    private String ServiceName;

    private String ServiceProviderID;
    private String ServiceProviderName;
    private String SubscriptionID;
    private String ContentID;
    private String Content_ItemMimeType;
    private String Content_ItemName;

    private String ContentProviderID;

    private String ContentProviderName;

    private String CategoryID = Content.MT.toString();
    private String CategoryName;

    private String SubCategoryID;
    private String SubCategoryName;
    private String EventType;
    private String DownloadSize;
    private String StreamDuration;
    private String ChargeCode;
    private String ActionType;

    private String ActualChargeapplied;

    private String BasePrice;
    private String TariffPlanId;
    private String TariffPlanName;
    private String DiscountPlanId;
    private String DiscountPlanName;
    private String CurrencyCode;
    private String ServiceCredits;
    private String LoyaltyCredits;
    private String RewardPoints;
    private String RewardChargeCode;
    private String UsageCredits;

    private String StatusCode;
    private String StatusDescription;

    private String BeneficiaryMSISDN;


    private String DeviceModel;
    private String IMEI;
    private String PromotionId;
    private String PromotionName;
    private String Keyword;
    private String DownloadURL;

    private String DeliveryChannel;


    private String DiscoveryPortalChannel;
    private String DiscoveryPortalID;

    private String DiscoveryPortalName;

    private String ByCSR;

    private String TextLength;


    private String UDHIMerged;
    private String UDHIPart;
    private String UDHITotalParts;

    private String DCS;

    private String ShortCode;

    private String Placeholder_1;
    private String Placeholder_2;
    private String Placeholder_3;
    private String Placeholder_4;
    private String Placeholder_5;
    //    SimpleDateFormat cdrTransactionTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private boolean isFine = true;
    private boolean isVas = false;

}
