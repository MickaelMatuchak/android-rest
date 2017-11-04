package restproject.eservices.mickaelmatuchak.restproject.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {
    //@SerializedName("id")
    //@Expose
    private int id;

    //@SerializedName("name")
    //@Expose
    private String name;

    //@SerializedName("message")
    //@Expose
    private String message;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
