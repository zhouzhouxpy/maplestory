package com.maple.common.model;

/**
 * @ClassName: UUID
 * @Description: TODO
 * @author: lixuesong
 * @date: 2019/1/26 12:41
 */
public class UUID {
    private String workId;
    private String datacenterId;

    public static class Builder{
        private String workId;
        private String datacenterId;

        public Builder setWorkId(String workId) {
            this.workId = workId;
            return this;
        }

        public Builder setDatacenterId(String datacenterId) {
            this.datacenterId = datacenterId;
            return this;
        }
        public UUID build(){
            return new UUID(this);
        }
    }

    public static Builder options(){
        return new UUID.Builder();
    }
    public UUID(Builder builder) {
        this.workId = builder.workId;
        this.datacenterId = builder.datacenterId;
    }

    public String getWorkId() {
        return workId;
    }
    public String getDatacenterId() {
        return datacenterId;
    }
}
