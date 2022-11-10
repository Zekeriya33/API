package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DummyRestApiResponseBodyPojo {

    private String status;
    private DummyRestApiDataPojo dummyRestApiDataPojo;
    private String message;

    public DummyRestApiResponseBodyPojo(String status, DummyRestApiDataPojo dummyRestApiDataPojo, String message) {
        this.status = status;
        this.dummyRestApiDataPojo = dummyRestApiDataPojo;
        this.message = message;
    }

    public DummyRestApiResponseBodyPojo() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DummyRestApiDataPojo getDummyRestApiDataPojo() {
        return dummyRestApiDataPojo;
    }

    public void setDummyRestApiDataPojo(DummyRestApiDataPojo dummyRestApiDataPojo) {
        this.dummyRestApiDataPojo = dummyRestApiDataPojo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "DummyRestApiResponseBodyPojo{" +
                "status='" + status + '\'' +
                ", dummyRestApiDataPojo=" + dummyRestApiDataPojo +
                ", message='" + message + '\'' +
                '}';
    }
}
