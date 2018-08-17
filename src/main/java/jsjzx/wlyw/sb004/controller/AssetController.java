package jsjzx.wlyw.sb004.controller;

import jsjzx.wlyw.sb004.entities.*;
import jsjzx.wlyw.sb004.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/asset")
@Controller
public class AssetController {

    @Autowired
    AssetService assetService;

    //    查询所有的Assets,并返回到list.html
//    @GetMapping("/showAsset/getAllAssets")
//    public String getAllAssets(Model model) {
//        List<Asset> assets = assetService.getAllAssets();
//        model.addAttribute("assets", assets);
//        return "asset/list";
//    }
    @ResponseBody
    @GetMapping("/showAsset/getAllAssets")
    public List<Asset> getALlAsset() {

        List<Asset> assets = assetService.getAllAssets();
        return assets;
    }

    //查询单个Asset,返回到asset.html
    @GetMapping(value = "/showAsset/{hostid}")
    public String selectAssetByHostId(@PathVariable("hostid") Integer hostid, Model model) {
        Asset asset = assetService.getTheAsset(hostid);
        model.addAttribute("asset", asset);
        return "asset/asset";
    }

    //获取相关数据，转到add.html页面
    @RequestMapping(value = "/addAsset", method = RequestMethod.GET)
    public String addAsset(Model model) {
        List<String> typeNames = assetService.getAllTypeNames();
        List<String> companyNames = assetService.getAllCompanyNames();
        List<String> statusNames = assetService.getAllStatusNames();
        List<String> gradeNames = assetService.getAllGradeNames();

//        Asset asset = new Asset();
        model.addAttribute("typeNames", typeNames);
        model.addAttribute("companyNames", companyNames);
        model.addAttribute("statusNames", statusNames);
        model.addAttribute("gradeNames", gradeNames);
//        model.addAttribute("asset", asset);
        return "asset/add";
    }

    //根据设备type获取设备brand
    @ResponseBody
    @GetMapping(value = "/selectBrand")
    public List<AssetType> selectBrand(@RequestParam("assetType") String assetType) {

        List<AssetType> assetTypes = assetService.selectBrands(assetType);
        return assetTypes;

    }

    //根据设备brand获取设备的model
    @ResponseBody
    @GetMapping(value = "/selectModel")
    public List<AssetModel> selectModel(@RequestParam("assetBrandId") String assetBrandId) {

        Integer brandId = Integer.parseInt(assetBrandId);
        List<AssetModel> assetModels = assetService.selectModels(brandId);
        return assetModels;

    }

    //根据设备的company获取设备的company+department
    @ResponseBody
    @GetMapping(value = "/selectDepartment")
    public List<AssetOwner> selectselectDepartment(@RequestParam("assetComponyName") String assetComponyName) {

        List<AssetOwner> assetOwners = assetService.selectOwners(assetComponyName);
        return assetOwners;
    }

    //    @ResponseBody
//    @PostMapping(value = "/addAsset")
//    public Map<String,Object> uploadAsset(Asset asset){
//        //将提交的参数转换为Asset
//        //保存到数据库
//        System.out.println("jsjzx.wlyw.sb004.controller.AssetController.uploadAsset...");
//        System.out.println(asset);
//        assetService.addAsset(asset);
//
//        Map<String,Object> map = new HashMap<>();
//
//        map.put("key1","succcess");
//        map.put("asset",asset);
//        //如果成功返回到对应的设备页面
//        return map;
//    }
    @ResponseBody
    @PostMapping(value = "/addAsset")
    public Msg uploadAsset(@Valid Asset asset, BindingResult result) {
        //将提交的参数转换为Asset
        //保存到数据库
        if(result.hasErrors()){
        Map<String, Object> map = new HashMap<>();
        List<FieldError> errors = result.getFieldErrors();
        for (FieldError fieldError : errors) {
            System.out.println("错误的字段名：" + fieldError.getField());
            System.out.println("错误信息：" + fieldError.getDefaultMessage());
            map.put(fieldError.getField(), fieldError.getDefaultMessage());
        }
        return Msg.fail().add("errorFields", map);
    }else{
            assetService.addAsset(asset);
        return Msg.success();
    }

}

    @RequestMapping(value = "/editAsset/{hostid}", method = RequestMethod.GET)
    public String editAsset(@PathVariable("hostid") Integer hostid, Model model) {
        Asset asset = assetService.getAssetByHostId(hostid);
        model.addAttribute("asset", asset);

        List<String> typeNames = assetService.getAllTypeNames();
        List<String> companyNames = assetService.getAllCompanyNames();
        List<String> statusNames = assetService.getAllStatusNames();
        List<String> gradeNames = assetService.getAllGradeNames();

        List<String> departmentNames = assetService.getDepartmentNamesByCompany(asset.getCompany());
        List<String> modelNames = assetService.getModelNamesByBrand(asset.getType(), asset.getBrand());
        List<AssetType> brands = assetService.selectBrands(asset.getType());

        model.addAttribute("typeNames", typeNames);
        model.addAttribute("companyNames", companyNames);
        model.addAttribute("statusNames", statusNames);
        model.addAttribute("gradeNames", gradeNames);
        model.addAttribute("departmentNames", departmentNames);
        model.addAttribute("brands", brands);
        model.addAttribute("modelNames", modelNames);

        return "asset/edit";
    }


//    @ResponseBody
//    @PostMapping(value = "/editAsset")
//    public Map<String, Object> updateAsset(Asset asset) {
//        //将提交的参数转换为Asset
//        //保存到数据库
//
//        assetService.udateAsset(asset);
//
//        Map<String, Object> map = new HashMap<>();
//
//        map.put("key1", "succcess");
//        map.put("asset", asset);
//        //如果成功返回到对应的设备页面
//        return map;
//    }

    @ResponseBody
    @PostMapping(value = "/editAsset")
    public Msg updateAsset(@Valid Asset asset, BindingResult result) {
        //将提交的参数转换为Asset
        //保存到数据库
        if(result.hasErrors()){
            Map<String, Object> map = new HashMap<>();
            List<FieldError> errors = result.getFieldErrors();
            for (FieldError fieldError : errors) {
                System.out.println("错误的字段名：" + fieldError.getField());
                System.out.println("错误信息：" + fieldError.getDefaultMessage());
                map.put(fieldError.getField(), fieldError.getDefaultMessage());
            }
            return Msg.fail().add("errorFields", map);
        }else{
            assetService.udateAsset(asset);
            return Msg.success();
        }



    }

    @GetMapping(value = "/deleteAsset/{hostid}")
    public String deleteAsset(@PathVariable("hostid") Integer hostId) {


        assetService.deleteByHostId(hostId);
        //重定向时:以 “/” 开头并且使用相对路径，那么会默认加上contextPath
        return "redirect:/";
    }

}
