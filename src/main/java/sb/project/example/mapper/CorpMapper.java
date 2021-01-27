package sb.project.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import sb.project.example.entity.Corp;

import java.util.List;


@Mapper
@Repository
public interface CorpMapper extends BaseMapper<Corp> {

    List<Corp> queryCorpList();
}
