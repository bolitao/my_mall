package xyz.bolitao.my_mall.service;

import xyz.bolitao.my_mall.entity.PmsBrand;

import java.util.List;

/**
 * @author bolitao
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
