package com.example.lozovabusiness;

import org.xmlpull.v1.XmlPullParser;

import java.util.ArrayList;

public class BuisnessItemParser {
//    private ArrayList<BusinessItem> businessItems;
//
//    public BuisnessItemParser(){
//        businessItems = new ArrayList<>();
//    }
//
//    public ArrayList<BusinessItem> getBuisnessItem(){
//        return  businessItems;
//    }
//
//    public boolean parse(XmlPullParser xpp){
//        boolean status = true;
//        BusinessItem currentBusinessItem = null;
//        boolean inEntry = false;
//        String textValue = "";
//
//        try{
//            int eventType = xpp.getEventType();
//            while(eventType != XmlPullParser.END_DOCUMENT){
//
//                String tagName = xpp.getName();
//                switch (eventType){
//                    case XmlPullParser.START_TAG:
//                        if("RECORD".equalsIgnoreCase(tagName)){
//                            inEntry = true;
//                            currentBusinessItem = new BusinessItem();
//                        }
//                        break;
//                    case XmlPullParser.TEXT:
//                        textValue = xpp.getText();
//                        break;
//                    case XmlPullParser.END_TAG:
//                        if(inEntry){
//                            if("RECORD".equalsIgnoreCase(tagName)){
//                                businessItems.add(currentBusinessItem);
//                                inEntry = false;
//                            } else if("FIO".equalsIgnoreCase(tagName)){
//                                currentBusinessItem.setName(textValue);
//                            } else if("ADDRESS".equalsIgnoreCase(tagName)){
//                                currentBusinessItem.setAddress(textValue);
//                            } else if("KVED".equalsIgnoreCase(tagName)) {
//                                currentBusinessItem.setKved(tagName);
//                            } else if("STAN".equalsIgnoreCase(textValue)) {
//                                currentBusinessItem.setStan(tagName);
//                            }
//                        }
//                        break;
//                    default:
//                }
//                eventType = xpp.next();
//            }
//        }
//        catch (Exception e){
//            status = false;
//            e.printStackTrace();
//        }
//        return  status;
//    }
}
