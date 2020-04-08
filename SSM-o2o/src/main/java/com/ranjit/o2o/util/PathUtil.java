package com.ranjit.o2o.util;

public class PathUtil {
	public static String seperator=System.getProperty("file.seperator");	
     public static String getImgBasePath() {
    	 String os=System.getProperty("os.name");
    	 String basePath="";
    	 if(os.toLowerCase().startsWith("win")) {
    		 basePath="D:/o2o/image";
    	 }else {
    		 basePath="/Users/baidu/work/image";
    	 }
    	 //basePath= basePath.replace("/", seperator); windows系统  注释不要就return basePath
    	 basePath= basePath.replace("/", seperator);
    	 return basePath; 
     }
     
     public static String getShopImagePath(long shopId) {
 		String imagePath = "/upload/item/shop/" + shopId + "/";
 		
 		//imagePath.replace("/", seperator)   windows系统   注释不要就return imagePath
 		return imagePath.replace("/", seperator);
 	}
}
