package data;

import java.util.List;

public class ChangesRequestBody {

    private int matcher;
    private List<ChangePair> data;

    public int getMatcher() {
        return matcher;
    }

    public void setMatcher(int matcher) {
        this.matcher = matcher;
    }

    public List<ChangePair> getData() {
        return data;
    }

    public void setData(List<ChangePair> data) {
        this.data = data;
    }
}
