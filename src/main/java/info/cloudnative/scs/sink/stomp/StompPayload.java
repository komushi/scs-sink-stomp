package info.cloudnative.scs.sink.stomp;
/**
 * Created by lei_xu on 6/26/16.
 */


public class StompPayload {

    public StompPayload(Object payload) {

        this.payload = payload;
    }

    private final Object payload;

    public Object getPayload() {
        return payload;
    }

}
