package ir.mci.cdrmanagertesti;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Value;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)

public class Cdr implements Serializable {

//        "id": "4b52d387137f4c25b9e8c22d5e0b5d9a",
//                "src": "989193000746",
//                "dst": "9889201101",
//                "err": "000",
//                "stat": "DELIVRD",
//                "dlvrd": true,
//                "st": 1654058400000,
//                "dt": 1654058400000,
//                "pc": 1,
//                "type": "SINGLE",
//                "mt": {
//        "dcs": 8,
//                "isPre": false,
//                "ch": "API",
//                "gw": "babaee",
//                "st": 1654058428511,
//                "l": 17,
//                "stp": "2G-F",
//                "sst": "0",
//                "sid": "70007",
//                "sfee": 500,
//                "tx": false,
//                "scat": "VAS"
//    },
//            "user": "bulknotify",
//            "trid": "154240ea17eb7002"
    private Mt mt;

    @JsonProperty("st")
    private String IMSI;
    @JsonProperty("src")
    private String MSISDN;

    @JsonProperty("isPre")
    private String SubscriberType;

    private String CustomerSegmentID;
    private String CustomerSegmentName;
    @JsonProperty("id")
    private String TransactionID;
    @JsonProperty("trid")
    private String CorrelationID;

    private String TransactionTime;

    private String ServiceID;

    private String ServiceKey;

    private String ServiceName;

    private String ServiceProviderID;

    @Value("${cdr.ServiceProviderName}")
    private String ServiceProviderName;

    private String SubscriptionID;
    private String ContentID;
    private String Content_ItemMimeType;

    @Value("${cdr.Content_ItemName}")
    private String Content_ItemName;

    private String ContentProviderID;

    @JsonProperty("user")
    private String ContentProviderName;

    private String CategoryID = Content.MT.toString();

    @Value("${cdr.CategoryName}")
    private String CategoryName;

    private String SubCategoryID;
    private String SubCategoryName;

    @Value("${cdr.EventType}")
    private String EventType;

    private String DownloadSize;
    private String StreamDuration;
    private String ChargeCode;

    @Value("${cdr.ActionType}")
    private String ActionType;

//    @JsonProperty("sfee")
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

    @Value("${cdr.statusCode}")
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


//    @JsonProperty("pc")
    private String UDHIMerged;

    private String UDHIPart;

    @JsonProperty("pc")
    private String UDHITotalParts;

    private String DCS;

    @JsonProperty("dst")
    private String ShortCode;

//    @JsonProperty("dt")
    private String Placeholder_1;

    private String Placeholder_2;
    private String Placeholder_3;
    private String Placeholder_4;
    private String Placeholder_5;
//    SimpleDateFormat cdrTransactionTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private boolean isFine = true;
    private boolean isVas = false;


    public Cdr(Mt mt, String IMSI, String MSISDN, String subscriberType, String customerSegmentID, String customerSegmentName, String transactionID, String correlationID, SimpleDateFormat transactionTime, String serviceID, String serviceKey, String serviceName, String serviceProviderID, String serviceProviderName, String subscriptionID, String contentID, String content_ItemMimeType, String content_ItemName, String contentProviderID, String contentProviderName, String categoryID, String categoryName, String subCategoryID, String subCategoryName, String eventType, String downloadSize, String streamDuration, String chargeCode, String actionType, String actualChargeapplied, String basePrice, String tariffPlanId, String tariffPlanName, String discountPlanId, String discountPlanName, String currencyCode, String serviceCredits, String loyaltyCredits, String rewardPoints, String rewardChargeCode, String usageCredits, String statusCode, String statusDescription, String beneficiaryMSISDN, String deviceModel, String IMEI, String promotionId, String promotionName, String keyword, String downloadURL, String deliveryChannel, String discoveryPortalChannel, String discoveryPortalID, String discoveryPortalName, String byCSR, String textLength, String UDHIMerged, String UDHIPart, String UDHITotalParts, String DCS, String shortCode, String placeholder_1, String placeholder_2, String placeholder_3, String placeholder_4, String placeholder_5, SimpleDateFormat cdrTransactionTimeFormat, boolean isFine, boolean isVas) {
        this.mt = mt;
        this.IMSI = IMSI;
        this.MSISDN = MSISDN;
        SubscriberType = subscriberType;
        CustomerSegmentID = customerSegmentID;
        CustomerSegmentName = customerSegmentName;
        TransactionID = transactionID;
        CorrelationID = correlationID;
        TransactionTime = transactionTime.toString();
        ServiceID = serviceID;
        ServiceKey = serviceKey;
        ServiceName = serviceName;
        ServiceProviderID = serviceProviderID;
        ServiceProviderName = serviceProviderName;
        SubscriptionID = subscriptionID;
        ContentID = contentID;
        Content_ItemMimeType = content_ItemMimeType;
        Content_ItemName = content_ItemName;
        ContentProviderID = contentProviderID;
        ContentProviderName = contentProviderName;
        CategoryID = categoryID;
        CategoryName = categoryName;
        SubCategoryID = subCategoryID;
        SubCategoryName = subCategoryName;
        EventType = eventType;
        DownloadSize = downloadSize;
        StreamDuration = streamDuration;
        ChargeCode = chargeCode;
        ActionType = actionType;
        ActualChargeapplied = actualChargeapplied;
        BasePrice = basePrice;
        TariffPlanId = tariffPlanId;
        TariffPlanName = tariffPlanName;
        DiscountPlanId = discountPlanId;
        DiscountPlanName = discountPlanName;
        CurrencyCode = currencyCode;
        ServiceCredits = serviceCredits;
        LoyaltyCredits = loyaltyCredits;
        RewardPoints = rewardPoints;
        RewardChargeCode = rewardChargeCode;
        UsageCredits = usageCredits;
        StatusCode = statusCode;
        StatusDescription = statusDescription;
        BeneficiaryMSISDN = beneficiaryMSISDN;
        DeviceModel = deviceModel;
        this.IMEI = IMEI;
        PromotionId = promotionId;
        PromotionName = promotionName;
        Keyword = keyword;
        DownloadURL = downloadURL;
        DeliveryChannel = deliveryChannel;
        DiscoveryPortalChannel = discoveryPortalChannel;
        DiscoveryPortalID = discoveryPortalID;
        DiscoveryPortalName = discoveryPortalName;
        ByCSR = byCSR;
        TextLength = textLength;
        this.UDHIMerged = UDHIMerged;
        this.UDHIPart = UDHIPart;
        this.UDHITotalParts = UDHITotalParts;
        this.DCS = DCS;
        ShortCode = shortCode;
        Placeholder_1 = placeholder_1;
        Placeholder_2 = placeholder_2;
        Placeholder_3 = placeholder_3;
        Placeholder_4 = placeholder_4;
        Placeholder_5 = placeholder_5;
//        this.cdrTransactionTimeFormat = cdrTransactionTimeFormat;
        this.isFine = isFine;
        this.isVas = isVas;
    }

    public String stToTransactionTime(String st) {
        Date date = new Date(Long.parseLong(st));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(date);
    }

    public String convertSubscriptionType(Boolean isPre){
        return  Boolean.TRUE.equals(isPre) ? "0" : "1";
    }

    public String convertUdhMerg(String UDHITotalParts){
        return UDHITotalParts.equals("0")? "0" : "1";
    }
}









