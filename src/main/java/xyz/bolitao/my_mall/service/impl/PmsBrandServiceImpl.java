package xyz.bolitao.my_mall.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.bolitao.my_mall.entity.PmsBrand;
import xyz.bolitao.my_mall.mapper.PmsBrandMapper;
import xyz.bolitao.my_mall.service.PmsBrandService;

import java.util.List;

/**
 * @author bolitao
 */
@Service
public class PmsBrandServiceImpl implements PmsBrandService {
    private final PmsBrandMapper pmsBrandMapper;

    @Autowired
    public PmsBrandServiceImpl(PmsBrandMapper pmsBrandMapper) {
        this.pmsBrandMapper = pmsBrandMapper;
    }

    @Override
    public List<PmsBrand> listAllBrand() {
        // TODO
        return null;
    }

    @Override
    public int createBrand(PmsBrand brand) {
        return pmsBrandMapper.insert(brand);
    }

    @Override
    public int updateBrand(Long id, PmsBrand brand) {
        // TODO
        return 0;
    }

    @Override
    public int deleteBrand(Long id) {
        return pmsBrandMapper.deleteById(id);
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        // TODO
//        return pmsBrandMapper.select
        return null;
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return pmsBrandMapper.selectById(id);
    }
}
