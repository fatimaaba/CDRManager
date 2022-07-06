package ir.mci.cdrmanagertesti;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;

@Data
@Slf4j
@NoArgsConstructor

public class CdrRecordDto {


    private String IMSI = "";
    private String MSISDN = "";
    private String SubscriberType = "";
    private String CustomerSegmentID = "";
    private String CustomerSegmentName = "";
    private String TransactionID = "";
    private String CorrelationID = "";
    private String TransactionTime = "";
    private String ServiceID = "";
    private String ServiceKey = "";
    private String ServiceName = "";
    private String ServiceProviderID = "";
    private String ServiceProviderName = "";
    private String SubscriptionID = "";
    private String ContentID = "";
    private String Content_ItemMimeType = "";
    private String Content_ItemName = "";
    private String ContentProviderID = "";
    private String ContentProviderName = "";
    private String CategoryID = "";
    private String CategoryName = "";
    private String SubCategoryID = "";
    private String SubCategoryName = "";
    private String EventType = "";
    private String DownloadSize = "";
    private String StreamDuration = "";
    private String ChargeCode = "";
    private String ActionType = "";
    private String ActualChargeapplied = "";
    private String BasePrice = "";
    private String TariffPlanId = "";
    private String TariffPlanName = "";
    private String DiscountPlanId = "";
    private String DiscountPlanName = "";
    private String CurrencyCode = "";
    private String ServiceCredits = "";
    private String LoyaltyCredits = "";
    private String RewardPoints = "";
    private String RewardChargeCode = "";
    private String UsageCredits = "";
    private String StatusCode = "";
    private String StatusDescription = "";
    private String BeneficiaryMSISDN = "";
    private String DeviceModel = "";
    private String IMEI = "";
    private String PromotionId = "";
    private String PromotionName = "";
    private String Keyword = "";
    private String DownloadURL = "";
    private String DeliveryChannel = "";
    private String DiscoveryPortalChannel = "";
    private String DiscoveryPortalID = "";
    private String DiscoveryPortalName = "";
    private String ByCSR = "";
    private String TextLength = "";
    private String UDHIMerged = "";
    private String UDHIPart = "";
    private String UDHITotalParts = "";
    private String DCS = "";
    private String ShortCode = "";
    private String Placeholder_1 = "";
    private String Placeholder_2 = "";
    private String Placeholder_3 = "";
    private String Placeholder_4 = "";
    private String Placeholder_5 = "";
    SimpleDateFormat cdrTransactionTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private boolean isFine = true;
    private boolean isVas = false;


    public CdrRecordDto(String IMSI, String MSISDN, String subscriberType, String customerSegmentID, String customerSegmentName, String transactionID, String correlationID, String transactionTime, String serviceID, String serviceKey, String serviceName, String serviceProviderID, String serviceProviderName, String subscriptionID, String contentID, String content_ItemMimeType, String content_ItemName, String contentProviderID, String contentProviderName, String categoryID, String categoryName, String subCategoryID, String subCategoryName, String eventType, String downloadSize, String streamDuration, String chargeCode, String actionType, String actualChargeapplied, String basePrice, String tariffPlanId, String tariffPlanName, String discountPlanId, String discountPlanName, String currencyCode, String serviceCredits, String loyaltyCredits, String rewardPoints, String rewardChargeCode, String usageCredits, String statusCode, String statusDescription, String beneficiaryMSISDN, String deviceModel, String IMEI, String promotionId, String promotionName, String keyword, String downloadURL, String deliveryChannel, String discoveryPortalChannel, String discoveryPortalID, String discoveryPortalName, String byCSR, String textLength, String UDHIMerged, String UDHIPart, String UDHITotalParts, String DCS, String shortCode, String placeholder_1, String placeholder_2, String placeholder_3, String placeholder_4, String placeholder_5, SimpleDateFormat cdrTransactionTimeFormat, boolean isFine, boolean isVas) {
        this.IMSI = IMSI;
        this.MSISDN = MSISDN;
        this.SubscriberType = subscriberType;
        this.CustomerSegmentID = customerSegmentID;
        this.CustomerSegmentName = customerSegmentName;
        this.TransactionID = transactionID;
        this.CorrelationID = correlationID;
        this.TransactionTime = transactionTime;
        this.ServiceID = serviceID;
        this.ServiceKey = serviceKey;
        this.ServiceName = serviceName;
        this.ServiceProviderID = serviceProviderID;
        this.ServiceProviderName = serviceProviderName;
        this.SubscriptionID = subscriptionID;
        this.ContentID = contentID;
        this.Content_ItemMimeType = content_ItemMimeType;
        this.Content_ItemName = content_ItemName;
        this.ContentProviderID = contentProviderID;
        this.ContentProviderName = contentProviderName;
        this.CategoryID = categoryID;
        this.CategoryName = categoryName;
        this.SubCategoryID = subCategoryID;
        this.SubCategoryName = subCategoryName;
        this.EventType = eventType;
        this.DownloadSize = downloadSize;
        this.StreamDuration = streamDuration;
        this.ChargeCode = chargeCode;
        this.ActionType = actionType;
        this.ActualChargeapplied = actualChargeapplied;
        this.BasePrice = basePrice;
        this.TariffPlanId = tariffPlanId;
        this.TariffPlanName = tariffPlanName;
        this.DiscountPlanId = discountPlanId;
        this.DiscountPlanName = discountPlanName;
        this.CurrencyCode = currencyCode;
        this.ServiceCredits = serviceCredits;
        this.LoyaltyCredits = loyaltyCredits;
        this.RewardPoints = rewardPoints;
        this.RewardChargeCode = rewardChargeCode;
        this.UsageCredits = usageCredits;
        this.StatusCode = statusCode;
        this.StatusDescription = statusDescription;
        this.BeneficiaryMSISDN = beneficiaryMSISDN;
        this.DeviceModel = deviceModel;
        this.IMEI = IMEI;
        this.PromotionId = promotionId;
        this.PromotionName = promotionName;
        this.Keyword = keyword;
        this.DownloadURL = downloadURL;
        this.DeliveryChannel = deliveryChannel;
        this.DiscoveryPortalChannel = discoveryPortalChannel;
        this.DiscoveryPortalID = discoveryPortalID;
        this.DiscoveryPortalName = discoveryPortalName;
        this.ByCSR = byCSR;
        this.TextLength = textLength;
        this.UDHIMerged = UDHIMerged;
        this.UDHIPart = UDHIPart;
        this.UDHITotalParts = UDHITotalParts;
        this.DCS = DCS;
        this.ShortCode = shortCode;
        this.Placeholder_1 = placeholder_1;
        this.Placeholder_2 = placeholder_2;
        this.Placeholder_3 = placeholder_3;
        this.Placeholder_4 = placeholder_4;
        this.Placeholder_5 = placeholder_5;
        this.cdrTransactionTimeFormat = cdrTransactionTimeFormat;
        this.isFine = isFine;
        this.isVas = isVas;
    }


    public String getCdr() {
        return "" +
                "" + IMSI +
                "|" + MSISDN +
                "|" + SubscriberType +
                "|" + CustomerSegmentID +
                "|" + CustomerSegmentName +
                "|" + TransactionID +
                "|" + CorrelationID +
                "|" + TransactionTime +
                "|" + ServiceID +
                "|" + ServiceKey +
                "|" + ServiceName +
                "|" + ServiceProviderID +
                "|" + ServiceProviderName +
                "|" + SubscriptionID +
                "|" + ContentID +
                "|" + Content_ItemMimeType +
                "|" + Content_ItemName +
                "|" + ContentProviderID +
                "|" + ContentProviderName +
                "|" + CategoryID +
                "|" + CategoryName +
                "|" + SubCategoryID +
                "|" + SubCategoryName +
                "|" + EventType +
                "|" + DownloadSize +
                "|" + StreamDuration +
                "|" + ChargeCode +
                "|" + ActionType +
                "|" + ActualChargeapplied +
                "|" + BasePrice +
                "|" + TariffPlanId +
                "|" + TariffPlanName +
                "|" + DiscountPlanId +
                "|" + DiscountPlanName +
                "|" + CurrencyCode +
                "|" + ServiceCredits +
                "|" + LoyaltyCredits +
                "|" + RewardPoints +
                "|" + RewardChargeCode +
                "|" + UsageCredits +
                "|" + StatusCode +
                "|" + StatusDescription +
                "|" + BeneficiaryMSISDN +
                "|" + DeviceModel +
                "|" + IMEI +
                "|" + PromotionId +
                "|" + PromotionName +
                "|" + Keyword +
                "|" + DownloadURL +
                "|" + DeliveryChannel +
                "|" + DiscoveryPortalChannel +
                "|" + DiscoveryPortalID +
                "|" + DiscoveryPortalName +
                "|" + ByCSR +
                "|" + TextLength +
                "|" + UDHIMerged +
                "|" + UDHIPart +
                "|" + UDHITotalParts +
                "|" + DCS +
                "|" + ShortCode +
                "|" + Placeholder_1 +
                "|" + Placeholder_2 +
                "|" + Placeholder_3 +
                "|" + Placeholder_4 +
                "|" + Placeholder_5 +
                "";
    }


    public void recordPiping() {

    }


}
