package sb.project.example.entity;


import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Corp {

    private Integer corp_id;

    private Integer city_id;

    private String corp_name;
}
