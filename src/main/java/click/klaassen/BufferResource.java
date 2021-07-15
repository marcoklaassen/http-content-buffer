package click.klaassen;

import java.util.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/buffer")
public class BufferResource {

    private String content;

    @GET
    public String getContent() {
        return Optional.ofNullable(content).orElse("");
    }

    @POST
    public String setContent(String content) {
        this.content = content;
        return content;
    }

}