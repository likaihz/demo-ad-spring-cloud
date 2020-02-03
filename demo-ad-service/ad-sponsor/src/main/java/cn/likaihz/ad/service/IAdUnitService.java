package cn.likaihz.ad.service;

import cn.likaihz.ad.exception.AdException;
import cn.likaihz.ad.vo.AdUnitDistrictRequest;
import cn.likaihz.ad.vo.AdUnitDistrictResponse;
import cn.likaihz.ad.vo.AdUnitItRequest;
import cn.likaihz.ad.vo.AdUnitItResponse;
import cn.likaihz.ad.vo.AdUnitKeywordRequest;
import cn.likaihz.ad.vo.AdUnitKeywordResponse;
import cn.likaihz.ad.vo.AdUnitRequest;
import cn.likaihz.ad.vo.AdUnitResponse;
import cn.likaihz.ad.vo.CreativeUnitRequest;
import cn.likaihz.ad.vo.CreativeUnitResponse;

/**
 * @author Li Kai
 */
public interface IAdUnitService {

    AdUnitResponse createUnit(AdUnitRequest request) throws AdException;

    AdUnitKeywordResponse createUnitKeyword(AdUnitKeywordRequest request)
        throws AdException;

    AdUnitItResponse createUnitIt(AdUnitItRequest request)
        throws AdException;

    AdUnitDistrictResponse createUnitDistrict(AdUnitDistrictRequest request)
        throws AdException;

    CreativeUnitResponse createCreativeUnit(CreativeUnitRequest request)
        throws AdException;
}
