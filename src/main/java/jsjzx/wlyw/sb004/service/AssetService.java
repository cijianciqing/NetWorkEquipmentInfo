package jsjzx.wlyw.sb004.service;

import jsjzx.wlyw.sb004.entities.*;
import jsjzx.wlyw.sb004.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssetService {

    @Autowired
    AssetMapper assetMapper;
    @Autowired
    AssetTypeMapper assetTypeMapper;
    @Autowired
    AssetModelMapper assetModelMapper;
    @Autowired
    AssetOwnerMapper assetOwnerMapper;
    @Autowired
    AssetStatusMapper assetStatusMapper;
    @Autowired
    AssetGradeMapper assetGradeMapper;

    public List<Asset> getAllAssets(){
      return   assetMapper.selectByExample(null);
    }

    public Asset getTheAsset(Integer hostId){
        return  assetMapper.selectByPrimaryKey(hostId);
    }

    //Get All AssetOwner----CompanyNames
    public List<String> getAllCompanyNames() {
        List<AssetOwner> assetOwners = assetOwnerMapper.selectByExample(null);

        List<String> companyNames = new ArrayList<>();
        for (AssetOwner assetOwner : assetOwners) {
            String companyname = assetOwner.getCompanyname();
            if (companyname != null & companyname != "") {
                if (!companyNames.contains(companyname)) {
                    companyNames.add(companyname);
                }
            }
        }
        return companyNames;
    }
    //Get All AssetType----TypeName
    public List<String> getAllTypeNames() {
        List<AssetType> assetTypes = assetTypeMapper.selectByExample(null);
        List<String> types = new ArrayList<>();
        for (AssetType assetType : assetTypes) {
            String type = assetType.getType();
            if (type != null & type != "") {
                if (!types.contains(type)) {
                    types.add(type);
                }
            }
        }
        return types;
    }

    //Get All AssetStatus----statusNames
    public List<String> getAllStatusNames() {
        List<AssetStatus> assetStatuses = assetStatusMapper.selectByExample(null);
        List<String> statusNames = new ArrayList<>();
        for (AssetStatus assetStatus : assetStatuses) {
            String statusName = assetStatus.getStatusname();
            if (statusName != null & statusName != "") {
                if (!statusNames.contains(statusName)) {
                    statusNames.add(statusName);
                }
            }
        }
        return statusNames;
    }

    //Get All AssetGrade----gradeNames
    public List<String> getAllGradeNames() {
        List<AssetGrade> assetGrades = assetGradeMapper.selectByExample(null);
        List<String> gradeNames = new ArrayList<>();
        for (AssetGrade assetGrade : assetGrades) {
            String gradeName = assetGrade.getGradename();
            if (gradeName != null & gradeName != "") {
                if (!gradeNames.contains(gradeName)) {
                    gradeNames.add(gradeName);
                }
            }
        }
        return gradeNames;
    }

    //Get All AssetType Entities
    public List<AssetType> selectBrands(String type)  {
        AssetTypeExample example = new AssetTypeExample();
        AssetTypeExample.Criteria criteria = example.createCriteria();
        criteria.andTypeEqualTo(type);
        List<AssetType> assetTypes = assetTypeMapper.selectByExample(example);

        List<AssetType> assetTypes01 = new ArrayList<>();
        for (AssetType assetType : assetTypes) {
            String brand = assetType.getBrandcn();
            if (brand != null & brand != "") {
                assetTypes01.add(assetType);
            }
        }
        return assetTypes01;
    }

    //Get All AssetModel Entities By assetBrandId
    public List<AssetModel> selectModels(Integer assetBrandId) {


        AssetModelExample example = new AssetModelExample();
        AssetModelExample.Criteria criteria = example.createCriteria();
        criteria.andTypebrandidEqualTo(assetBrandId);
        List<AssetModel> assetModels = assetModelMapper.selectByExample(example);

        List<AssetModel> assetModels01 = new ArrayList<>();

        for (AssetModel assetModel : assetModels) {
            String modelName = assetModel.getModel();
            if (modelName != null & modelName != "") {
                assetModels01.add(assetModel);
            }
        }

        return assetModels01;
    }

    ////Get All AssetOwner Entities By assetComponyName
    public List<AssetOwner> selectOwners(String assetComponyName) {
        AssetOwnerExample example = new AssetOwnerExample();
        AssetOwnerExample.Criteria criteria = example.createCriteria();
        criteria.andCompanynameEqualTo(assetComponyName);
        List<AssetOwner> assetOwners = assetOwnerMapper.selectByExample(example);

        List<AssetOwner> assetOwners1 = new ArrayList<>();

        for (AssetOwner assetOwner : assetOwners) {
            String departmentame = assetOwner.getDepartmentame();
            if (departmentame != null & departmentame != "") {
                assetOwners1.add(assetOwner);
            }
        }

        return assetOwners1;
    }

    //添加asset
    public void addAsset(Asset asset) {
        assetMapper.insert(asset);
    }

    public void udateAsset(Asset asset) {
        assetMapper.updateByPrimaryKey(asset);
    }

    public Asset getAssetByHostId(Integer hostid) {
        Asset asset = assetMapper.selectByPrimaryKey(hostid);

        return asset;
    }

    public List<String> getDepartmentNamesByCompany(String company) {

        AssetOwnerExample example = new AssetOwnerExample();
        AssetOwnerExample.Criteria criteria = example.createCriteria();
        criteria.andCompanynameEqualTo(company);

        List<AssetOwner> assetOwners = assetOwnerMapper.selectByExample(example);
        List<String> departmentNames = new ArrayList<>();
        for (AssetOwner assetOwner : assetOwners) {
            String departmentName = assetOwner.getDepartmentame();
            if (departmentName != null & departmentName != "") {
                if (!departmentNames.contains(departmentName)) {
                    departmentNames.add(departmentName);
                }
            }
        }
        return departmentNames;
    }

    public List<String> getModelNamesByBrand(String type, String brand) {
//        System.out.println("type: "+type);
//        System.out.println("brand: "+brand);
        if(type==null){
            type="";
        }
        if(brand==null){
            brand="";
        }
        AssetTypeExample example = new AssetTypeExample();
        AssetTypeExample.Criteria criteria = example.createCriteria();
        criteria.andTypeEqualTo(type);
        criteria.andBrandcnEqualTo(brand);
        List<AssetType> assetTypes = assetTypeMapper.selectByExample(example);
//        System.out.println(assetTypes.isEmpty());
        if(assetTypes.isEmpty()){
            return null;
        }
        AssetType assetType = assetTypes.get(0);
        Integer typeId = assetType.getId();

        AssetModelExample example1 = new AssetModelExample();
        AssetModelExample.Criteria criteria1 = example1.createCriteria();
        criteria1.andTypebrandidEqualTo(typeId);
        List<AssetModel> assetModels = assetModelMapper.selectByExample(example1);

        List<String> modelNames = new ArrayList<>();

        for (AssetModel assetModel : assetModels) {
            String modelName = assetModel.getModel();
            if (modelName != null & modelName != "") {
                if (!modelNames.contains(modelName)) {
                    modelNames.add(modelName);
                }
            }
        }
        return modelNames;
    }


    public void deleteByHostId(Integer hostId) {
        assetMapper.deleteByPrimaryKey(hostId);
    }
}
