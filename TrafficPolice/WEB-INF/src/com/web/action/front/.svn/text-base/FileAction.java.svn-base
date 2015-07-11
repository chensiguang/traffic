package com.web.action.front;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import net.sf.json.JSONObject;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.json.annotations.JSON;

import com.web.action.base.BaseAction;

public class FileAction extends BaseAction {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private File image; // 上传的文件
    private String imageFileName; // 文件名
    private String imageContentType; // 文件类型
    private String action;
    private String key;
    private String filename;

    public String advertisement() {
        String realpath = ServletActionContext.getServletContext().getRealPath("style");
        log.debug("#####文件上传...### image is " + image + "## is null ? " + (image != null) + " ### File Type is "
                + imageContentType);
        String type = imageFileName.substring(imageFileName.lastIndexOf('.'));
        if (!".jpg".equals(type.toLowerCase())) {
            message = "广告图片必须为jpg格式";
            action = "admin/page/Startpage.jsp";
            return SUCCESS;
        }
        if (image != null) {
            File dir = new File(realpath);
            try {
                File savefile = new File(dir, filename + ".jpg");
                if (!savefile.getParentFile().exists())
                    savefile.getParentFile().mkdirs();

                FileUtils.copyFile(image, savefile);
                message = "文件上传成功";
            } catch (Exception e) {
                log.error("FILE UPLOAD##: ERROR####", e);
                message = "文件上传失败###" + e.getLocalizedMessage();
            }
        }
        action = "admin/page/Startpage.jsp";
        return SUCCESS;
    }

    @JSON(serialize = false)
    public String editUpload_json() throws IOException {

        // 文件保存目录路径
        String savePath = ServletActionContext.getServletContext().getRealPath("admin/page/upload");

        // 文件保存目录URL
        String saveUrl = getRequest().getContextPath() + "/admin/page/upload/";
        // String saveUrl = "/upload/";
        String fileExt = imageFileName.substring(imageFileName.lastIndexOf('.'));
        PrintWriter out = null;
        JSONObject obj = new JSONObject();
        this.getResponse().setCharacterEncoding("GBK");
        try {
            if (image != null) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
                Date tmp = new Date();
                String ymd = sdf.format(tmp);
                savePath += "/" + ymd + "/";
                saveUrl += "/" + ymd + "/";
                File dirFile = new File(savePath);
                if (!dirFile.exists()) {
                    dirFile.mkdirs();
                }
                String newFileName = tmp.getTime() + fileExt;
                File savefile = new File(dirFile, newFileName);
                if (!savefile.getParentFile().exists())
                    savefile.getParentFile().mkdirs();

                FileUtils.copyFile(image, savefile);
                message = "文件上传成功";
                out = getOutputStream();

                
                obj.put("error", 0);
                obj.put("url", "upload" + "/" + ymd + "/" + newFileName);

            } else {
                log.debug("### image is null! ###");
                obj.put("error", 1);
                obj.put("message", getError("上传文件失败。"));
            }
        } catch (Exception e) {
            log.error(getError("上传文件失败。"), e);
            obj.put("error", 1);
            obj.put("message", getError("上传文件失败。"));
        } finally {
            if (null != getOutputStream()) {
                out.println(obj.toString());
                out.flush();
                out.close();
            }
        }
        return SUCCESS;
    }
    
    
    @JSON(serialize = false)
    public String errorInputEditImage() throws IOException {
        JSONObject obj = new JSONObject();
        this.getResponse().setCharacterEncoding("GBK");
        obj.put("error", 1);
        obj.put("message", "上传的文件过大，或不是一个合法的图片文件!\\n\\t" + "1.允许上传的文件大小最大不得超过200K\\n\\t" + "2.文件格式必须为jpg格式" + "\\n\\t"
                + getError("上传文件失败。"));
        PrintWriter out = getOutputStream();
        out.println(obj.toString());
        out.flush();
        out.close();
        return null;
    }

    public String errorInputAdvertisement() {
        message = "上传的文件过大，或不是一个合法的图片文件!\\n\\t" + "1.允许上传的文件大小最大不得超过200K\\n\\t" + "2.文件格式必须为jpg格式";
        action = "admin/page/Startpage.jsp";
        return SUCCESS;
    }

    private String getError(String message) {
        JSONObject obj = new JSONObject();
        obj.put("error", 1);
        obj.put("message", message);
        return obj.toString();
    }

    public File getImage() {
        return image;
    }

    public void setImage(File image) {
        this.image = image;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    public String getImageContentType() {
        return imageContentType;
    }

    public void setImageContentType(String imageContentType) {
        this.imageContentType = imageContentType;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
