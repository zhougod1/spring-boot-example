package sb.project.example.entity;


import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Corp {

    private Integer corpId;

    private Integer cityId;

    private String corpName;
}
