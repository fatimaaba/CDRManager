package ir.mci.cdrmanagertesti;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import netscape.javascript.JSObject;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Service


public class FileWriter {


    private static final String filePath = "/home/babaie/All-Should-DO/cdr-manager-vas-variables/3G/cdrmanagertesti-variables/cdrpip.txt";


    public OutputStream outputStream = null;

    private ObjectReader objectReaderList;

    @Value("${cdr.statusCode}")
    private String statusCode;

    @Value("${cdr.ServiceProviderName}")
    private String ServiceProviderName;

    @Value("${cdr.Content_ItemName}")
    private String Content_ItemName;

    @Value("${cdr.CategoryName}")
    private String CategoryName;

    @Value("${cdr.EventType}")
    private String EventType;

    @Value("${cdr.ActionType}")
    private String ActionType;

    public FileWriter(ObjectMapper objectMapper) throws FileNotFoundException {

        this.objectReaderList = objectMapper.readerFor(new TypeReference<List<Cdr>>() {
        });

        outputStream = new FileOutputStream(new File(filePath));
        System.out.println("output stream is: " + outputStream);
    }


    public void cdrManageFormat(String data) throws IOException {

        try {

            Cdr tr = new Cdr();

            System.out.println(statusCode);


            List<Cdr> obj = objectReaderList.readValue(data);


            for (Cdr cdr : obj) {

                System.out.println("object decode is " + cdr);


                writeObjectToFile(cdr);
                System.out.println("cdr record was successfully write to file");
            }


        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }


    public void writeObjectToFile(Cdr cdr) {

        try {

            String data = (" " + printNotNull(cdr.getIMSI()) + "|" + printNotNull(cdr.getMSISDN()) + "|"
                    + printNotNull(cdr.convertSubscriptionType(cdr.getMt().getIsPre())) + "|" + printNotNull(cdr.getCustomerSegmentID()) + "|" + printNotNull(cdr.getCustomerSegmentName())
                    + "|" + printNotNull(cdr.getTransactionID()) + "|" + printNotNull(cdr.getCorrelationID()) + "|"
                    + printNotNull(cdr.stToTransactionTime(cdr.getIMSI())) + "|" + printNotNull(cdr.getMt().getSid()) + "|" + printNotNull(cdr.getServiceKey()) + "|"
                    + printNotNull(cdr.getMt().getScat()) + "|" + printNotNull(cdr.getServiceProviderID()) + "|" + printNotNull(ServiceProviderName) + "|"
                    + printNotNull(cdr.getSubscriptionID()) + "|" + printNotNull(cdr.getContentID()) + "|" + printNotNull(cdr.getContent_ItemMimeType()) + "|"
                    + printNotNull(Content_ItemName) + "|" + printNotNull(cdr.getContentProviderID()) + "|" + printNotNull(cdr.getContentProviderName()) + "|"
                    + printNotNull(cdr.getCategoryID()) + "|" + printNotNull(CategoryName) + "|" + printNotNull(cdr.getSubCategoryID()) + "|"
                    + printNotNull(cdr.getSubCategoryName()) + "|" + printNotNull(EventType) + "|" + printNotNull(cdr.getDownloadSize()) + "|"
                    + printNotNull(cdr.getStreamDuration()) + "|" + printNotNull(cdr.getChargeCode()) + "|" + printNotNull(ActionType) + "|"
                    + printNotNull(String.valueOf(cdr.getMt().getSfee())) + "|" + printNotNull(cdr.getBasePrice()) + "|" + printNotNull(cdr.getTariffPlanId()) + "|"
                    + printNotNull(cdr.getTariffPlanName()) + "|" + printNotNull(cdr.getDiscountPlanId()) + "|" + printNotNull(cdr.getDiscountPlanName()) + "|"
                    + printNotNull(cdr.getCurrencyCode()) + "|" + printNotNull(cdr.getServiceCredits()) + "|" + printNotNull(cdr.getLoyaltyCredits()) + "|"
                    + printNotNull(cdr.getRewardPoints()) + "|" + printNotNull(cdr.getRewardChargeCode()) + "|" + printNotNull(cdr.getUsageCredits()) + "|"
                    + printNotNull(statusCode) + "|" + printNotNull(cdr.getMt().getSst()) + "|" + printNotNull(cdr.getMt().getStp()) + "|"
                    + printNotNull(cdr.getDeviceModel()) + "|" + printNotNull(cdr.getIMEI()) + "|" + printNotNull(cdr.getPromotionId()) + "|" + printNotNull(cdr.getPromotionName()) + "|"
                    + printNotNull(cdr.getKeyword()) + "|" + printNotNull(cdr.getDownloadURL()) + "|" + printNotNull(cdr.getMt().getCh()) + "|"
                    + printNotNull(cdr.getDiscoveryPortalChannel()) + "|" + printNotNull(cdr.getDiscoveryPortalID()) + "|" + printNotNull(cdr.getMt().getGw()) + "|"
                    + printNotNull(cdr.getByCSR()) + "|" + printNotNull(String.valueOf(cdr.getMt().getL())) + "|" + printNotNull(cdr.convertUdhMerg(cdr.getUDHITotalParts())) + "|" + printNotNull(cdr.getUDHIPart()) + "|"
                    + printNotNull(cdr.getUDHITotalParts()) + "|" + printNotNull(String.valueOf(cdr.getMt().getDcs())) + "|" + printNotNull(cdr.getShortCode()) + "|" + printNotNull((cdr.stToTransactionTime(cdr.getIMSI()))) + "|"
                    + printNotNull((cdr.getPlaceholder_2())) + "|" + "|" + printNotNull(cdr.getPlaceholder_3()) + "|"
                    + printNotNull(cdr.getPlaceholder_4()) + "|" + printNotNull(cdr.getPlaceholder_5()) + "|" + "|\n");

            outputStream.write(data.getBytes());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //    private String printNotNull(String s) {
    //        if (s != null) {
    //            return s;
    //        } else return "NULL";
    //    }isPre

    private String printNotNull(String s) {
        return s == null ? "" : s;
    }
}


