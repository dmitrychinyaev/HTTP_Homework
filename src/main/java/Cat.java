import com.fasterxml.jackson.annotation.JsonProperty;

public class Cat {
    public final String id;
    public final String text;
    public final String type;
    public final String user;
    public final int upvotes;

    public Cat(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") int upvotes
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public String getText() {
        return text;
    }

    public String getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Cat" +
                "\n id= " + id +
                "\n text= " + text +
                "\n type= " + type +
                "\n user= " + user +
                "\n upvotes= " + upvotes;
    }
}
