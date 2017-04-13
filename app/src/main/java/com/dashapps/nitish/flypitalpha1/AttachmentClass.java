package com.dashapps.nitish.flypitalpha1;

/**
 * Created by Nitish on 6/18/2016.
 */



    public class AttachmentClass {

        public Integer getAttId() {
            return id;
        }

        public String getUrl() {
            return url;
        }

        public String getSlug() {
            return slug;
        }

        public String getAttTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }

        public String getCaption() {
            return caption;
        }

        public Integer getParent() {
            return parent;
        }

        public String getMimeType() {
            return mimeType;
        }

        public ImagesClass getImages() {
            return images;
        }

        private Integer id;
        private String url;
        private String slug;
        private String title;
        private String description;
        private String caption;
        private Integer parent;
        private String mimeType;
        private ImagesClass images;
    }
