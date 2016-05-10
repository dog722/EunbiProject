package com.example.tacademy.eunbiminitest.data;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dongja94 on 2016-05-09.
 */
public class TStoreProduct {
    String categoryPath;
    String webUrl;
    int charge;
    int downloadCount;
    String description;
    String thumbnailUrl;
    String name;
    float score;
    String tinyUrl;
    String detailDescription;
    String productId;

    String platform;
    String developerId;
    String osVersion;
    String categoryCode;
    @SerializedName("previewUrl")
    String rawpreviewUrls;

    List<String> previewUrilist = new ArrayList<String>();

    public boolean makePreviewUrlList() {
        if (rawpreviewUrls != null) {
            String[] urls = rawpreviewUrls.split(";");
            previewUrilist.addAll(Arrays.asList(urls));
            return true;
        }
        return  false;
    }

    public String getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(String developerId) {
        this.developerId = developerId;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getRawpreviewUrls() {
        return rawpreviewUrls;
    }

    public void setRawpreviewUrls(String rawpreviewUrls) {
        this.rawpreviewUrls = rawpreviewUrls;
    }

    public List<String> getPreviewUrilist() {
        return previewUrilist;
    }

    public void setPreviewUrilist(List<String> previewUrilist) {
        this.previewUrilist = previewUrilist;
    }

    public int getVoterCount() {
        return voterCount;
    }

    public void setVoterCount(int voterCount) {
        this.voterCount = voterCount;
    }

    public TStorPhoneModels getModels() {
        return models;
    }

    public void setModels(TStorPhoneModels models) {
        this.models = models;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    int voterCount;
    TStorPhoneModels models;
    String categoryName;
    String developerName;

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getCategoryPath() {
        return categoryPath;
    }

    public void setCategoryPath(String categoryPath) {
        this.categoryPath = categoryPath;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public int getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(int downloadCount) {
        this.downloadCount = downloadCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getTinyUrl() {
        return tinyUrl;
    }

    public void setTinyUrl(String tinyUrl) {
        this.tinyUrl = tinyUrl;
    }

    public String getDetailDescription() {
        return detailDescription;
    }

    public void setDetailDescription(String detailDescription) {
        this.detailDescription = detailDescription;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
